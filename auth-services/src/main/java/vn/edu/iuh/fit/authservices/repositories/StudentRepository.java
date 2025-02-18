package vn.edu.iuh.fit.authservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.authservices.models.Student;

public interface StudentRepository extends JpaRepository<Student, String> {

}
