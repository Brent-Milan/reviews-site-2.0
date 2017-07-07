package production;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToMany(mappedBy="tags")
	private Set<Review> reviews;
	
	private String name;
	
	public Tag() {
		
	}
	
	public Tag(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
