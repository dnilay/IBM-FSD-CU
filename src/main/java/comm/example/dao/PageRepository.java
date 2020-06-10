package comm.example.dao;

import comm.example.model.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PageRepository extends CrudRepository<Page,Integer> {
}
