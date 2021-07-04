package vn.daoanhthanh.server.service;

import org.springframework.stereotype.Service;
import vn.daoanhthanh.server.model.entities.Student;
import vn.daoanhthanh.server.repo.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService{
    private final StudentRepository repo;

    public StudentServiceImp(StudentRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Student> getAllStudents() {
        return repo.findAll();
    }
}
