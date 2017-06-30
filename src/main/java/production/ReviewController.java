package production;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewController {

	@Resource
	ReviewRepository repository;

	@RequestMapping("/reviews")
	public String fetchReviews(Model model) {
		model.addAttribute("reviewsAsCollection", repository.findAll());
		return "reviews";
	}
}
