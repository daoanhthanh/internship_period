package vn.daoanhthanh.server.service;

import vn.daoanhthanh.server.model.entities.Student;
import vn.daoanhthanh.server.repo.StudentRepository;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

}
