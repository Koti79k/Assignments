package Students.Repositery;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import Students.Entity.Student;

@Repository
public interface StudentRepo extends ElasticsearchRepository<Student, String>{

}
