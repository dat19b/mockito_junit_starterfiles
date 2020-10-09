package dk.clbo.repository;

import dk.clbo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsJPARepository extends CrudRepository<Student, Integer> {
}
