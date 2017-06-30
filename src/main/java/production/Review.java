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
		
		private String title;
		
		@Lob
		private String synopsis;
		@Lob
		private String content;
		private String imageUrl;
		
		private String date;
		
		@ManyToOne
		public Genre genre;
		
		public Review() {
			
		}
		
		public Review(Genre genre, String title, String content, String date, String synopsis, String imageUrl) {
			this.genre = genre;
			this.title = title;
			this.content = content;
			this.date = date;
			this.synopsis = synopsis;
			this.imageUrl = imageUrl;
			
		}
		

		public Long getId() {
			return id;
			
		}
		
		public String getTitle() {
			return title;
		}
		
		public String getDate() {
			return date;
		}
		public String getSynopsis() {
			return synopsis;
		}
		public String getContent() {
			return content;
		}
		public String getImageUrl() {
			return imageUrl;
		}
		public Genre getGenre() {
			return genre;  
		}
	
		
	
}
