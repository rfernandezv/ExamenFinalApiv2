package examen.student.application;


import examen.common.application.Notification;
import examen.student.domain.entity.Student;
import examen.student.domain.repository.StudentRepository;
import examen.student.domain.service.StudentDomainService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service()
public class StudentApplicationService {
    @Autowired
    private StudentDomainService moduloDomainService;
    @Autowired
    private StudentRepository studentRepository;
    
    
    public List<Student> findAllStudents() throws Exception{
        return studentRepository.getAll();
    }
    
    public List<Student> findStudentByType(String typeStudent) throws Exception{
        Notification notification = this.validation(typeStudent);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        return studentRepository.findStudentByType(typeStudent);
    }
    
    public double calculateAmount(Long studentId) throws Exception{
        Notification notification = this.validationStudent(studentId);
        if (notification.hasErrors()) {
            throw new IllegalArgumentException(notification.errorMessage());
        }
        return studentRepository.calculateAmount(studentId);
    }
   
    private Notification validation(String typeStudent) {
        Notification notification = new Notification();
        if (typeStudent == null) {
            notification.addError("Type not valid");
            return notification;
        }
        return notification;
    }
    
    private Notification validationStudent(Long studentId) {
        Notification notification = new Notification();
        if (studentId == null) {
            notification.addError("Student Id not valid");
            return notification;
        }
         if (studentId < 0) {
            notification.addError("Student Id can not be negative");
            return notification;
        }
        return notification;
    }
}
