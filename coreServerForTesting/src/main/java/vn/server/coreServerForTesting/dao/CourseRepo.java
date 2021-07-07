package vn.server.coreServerForTesting.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.server.coreServerForTesting.entities.Course;

import java.util.UUID;

@Repository
public interface CourseRepo extends JpaRepository<Course, UUID>{
}
