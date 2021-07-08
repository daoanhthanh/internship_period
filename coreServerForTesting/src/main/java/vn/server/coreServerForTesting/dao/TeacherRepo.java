package vn.server.coreServerForTesting.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.server.coreServerForTesting.entities.Teacher;

import java.util.UUID;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher, UUID> {

}