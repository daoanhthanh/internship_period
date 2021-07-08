package vn.server.coreServerForTesting.service;

import org.springframework.stereotype.Service;
import vn.server.coreServerForTesting.dao.CourseRepo;
import vn.server.coreServerForTesting.dao.TeacherRepo;
import vn.server.coreServerForTesting.entities.Course;
import vn.server.coreServerForTesting.entities.Teacher;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
public class DataFillService {
    private final CourseRepo courseDAO;
    private final TeacherRepo teacherDAO;
    public DataFillService(CourseRepo courseDAO, TeacherRepo teacherDAO) {
        this.courseDAO = courseDAO;
        this.teacherDAO = teacherDAO;
    }

    @PostConstruct
    @Transactional //@Transaction annotations to indicate the entire method must run inside a transaction
    public void fillData(){
        Teacher pj = new Teacher(
                "Professor Jirafales",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Ruben2017.jpg/245px-Ruben2017.jpg",
                "jirafales@yahoo_.com"
        );
        Teacher px = new Teacher(
                "Professor X",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS9uI1Cb-nQ2uJOph4_t96KRvLSMjczAKnHLJYi1nqWXagvqWc4",
                "director@xproject_.com"

        );
        teacherDAO.save(pj);
        teacherDAO.save(px);
        // create courses
        Course mathematics = new Course("Mathematics", 20, (short) 10, pj);
        Course spanish = new Course("Spanish", 20, (short) 10, pj);
        Course dealingWithUnknown = new Course("Dealing with unknown", 10, (short) 100, pj);
        Course handlingYourMentalPower = new Course("Handling your mental power", 50, (short) 100, pj);
        Course introductionToPsychology = new Course("Introduction to psychology", 90, (short) 100, pj);
        courseDAO.save(mathematics);
        courseDAO.save(spanish);
        courseDAO.save(dealingWithUnknown);
        courseDAO.save(handlingYourMentalPower);
        courseDAO.save(introductionToPsychology);
    }
}