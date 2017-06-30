package production;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

	@Entity
	public class Review {
		
		@Id
		@GeneratedValue
		private Long id;
		
		@Lob
		private String synopsis;
		@Lob
		private String description;
		private String imageURL;
		
		private int date;
		
		@ManyToOne
		public Genre genre;
		
		public Review() {
			
		}
		
//		public Review() {}

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
