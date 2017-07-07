package production;

import org.springframework.data.repository.CrudRepository;

public interface TagRepository extends CrudRepository<Review, Long> {

}
