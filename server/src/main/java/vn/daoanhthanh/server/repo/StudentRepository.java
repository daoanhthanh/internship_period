package vn.daoanhthanh.server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.daoanhthanh.server.model.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("")
    Student findStudentByName();
}
