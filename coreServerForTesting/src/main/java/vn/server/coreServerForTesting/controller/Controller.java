package vn.server.coreServerForTesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vn.server.coreServerForTesting.dao.CourseRepo;
import vn.server.coreServerForTesting.dao.TeacherRepo;
import vn.server.coreServerForTesting.entities.Course;
import vn.server.coreServerForTesting.entities.Teacher;

import java.util.List;

@RestController
public class Controller {
    private final TeacherRepo teacherRepo;
    private final CourseRepo courseRepo;

    public Controller(TeacherRepo teacherRepo, CourseRepo courseRepo) {
        this.teacherRepo = teacherRepo;
        this.courseRepo = courseRepo;
    }

    @GetMapping("/teacher")
    public List<Teacher> getAllTeacher(){
        return teacherRepo.findAll();
    }

    @GetMapping("/course")
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }
}
