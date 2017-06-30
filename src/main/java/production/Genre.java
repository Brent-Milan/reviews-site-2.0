package production;

import java.util.Set;

import javax.persistence.OneToMany;

public class Genre {
	
	
	private Long id;
	
	@OneToMany(mappedBy = "genre")
	private Set<Review> review;
	
	public Genre() {
		
	}
}
