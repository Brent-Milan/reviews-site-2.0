package production;

import org.springframework.data.repository.CrudRepository;

public interface GenreRepository extends CrudRepository<Review, Long> {
	

}