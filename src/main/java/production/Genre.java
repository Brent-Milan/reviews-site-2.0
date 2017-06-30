package production;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Genre {
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	
	@OneToMany(mappedBy="genre")
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
