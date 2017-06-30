package production;

import java.util.Set;

import javax.persistence.OneToMany;

public class Genre {
	

	private Long id;
	private String title;
	
	@OneToMany(mappedBy = "genre")
	private Set<Review> reviews;
	
	private Genre() {
		
	}
	
	public Genre(String title) {
		this.title = title;
		
	}
	
	public Long getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public Set<Review> getReviews() {
		return reviews;
	}
}
