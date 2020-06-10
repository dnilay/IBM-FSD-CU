package comm.example.dao;

import comm.example.model.Image;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableAutoConfiguration
@EnableTransactionManagement
public interface ImageRepository extends CrudRepository<Image,Integer> {
}
