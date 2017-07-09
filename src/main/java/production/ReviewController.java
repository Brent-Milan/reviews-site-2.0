package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository reviewRepo;
	
	@Resource
	GenreRepository genreRepo;
	
	@Resource
	TagRepository tagRepo;

	@RequestMapping("/reviews")
	public String fetchReviews(Model model) {
		model.addAttribute("reviewsAsCollection", reviewRepo.findAll());
		return "reviews";
	}
	
	@RequestMapping("/onereview")
    public String fetchOne(@RequestParam(value="id") Long id, Model model) {
         model.addAttribute("onereview", reviewRepo.findOne(id));
         return "onereview";
     }
	
	@RequestMapping("/genrelist")
	public String fetchGenres(Model model) {
		model.addAttribute("genreAsCollection", genreRepo.findAll());
		return "genrelist";
	}
	
	@RequestMapping("/onegenre")
	public String fetchGenre(@RequestParam(value="id") Long id, Model model) {
		model.addAttribute("onegenre", genreRepo.findOne(id));
		return "onegenre";
	}
	
	@RequestMapping("/taglist")
	public String fetchTags(Model model) {
		model.addAttribute("tagAsCollection", tagRepo.findAll());
		return "taglist";
	}
	
	@RequestMapping("/onetag")
	public String fetchTag(@RequestParam(value="id") Long id, Model model) {
		model.addAttribute("onetag", tagRepo.findOne(id));
		return "onetag";
	}
	
	@RequestMapping("/onereview/tags/delete")
	public String untag(@RequestParam long tagId, @RequestParam long reviewId) {
		Tag toUntag = tagRepo.findOne(tagId);
		Review review = reviewRepo.findOne(reviewId);
		review.remove(toUntag);
		reviewRepo.save(review);
		return "redirect:/onereview?id=" + reviewId;
		
	}
	
	@RequestMapping("/tags/delete")
	public String deleteTag(@PathVariable long id) {
		Tag toDelete = tagRepo.findOne(id);
		for(Review current: toDelete.getReviews()) {
			current.remove(toDelete);
			reviewRepo.save(current);
			}
		tagRepo.delete(toDelete);
		return "redirect:/taglist";
	}
	
	
}

