package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

	@Entity
	public class Review {
		
		@Id
		@GeneratedValue
		private Long id;
		
		private String synopsis;
		private String description;
		private String imageURL;

		public Long getId() {
			return id;
		}
		public String getSynopsis() {
			return synopsis;
		}
		public String getDescription() {
			return description;
		}
		public String getImageURL() {
			return imageURL;
		}
	
		
	
}
