package vn.daoanhthanh.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import vn.daoanhthanh.server.model.entities.Student;
import vn.daoanhthanh.server.service.StudentServiceImp;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    private final StudentServiceImp studentServiceImp;

    public StudentController(StudentServiceImp studentServiceImp) {
        this.studentServiceImp = studentServiceImp;
    }

    @GetMapping("/all")
    public List<Student> getAllStudents(){
        return studentServiceImp.getAllStudents();
    }


}
