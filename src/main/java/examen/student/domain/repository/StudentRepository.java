package examen.student.domain.repository;

import examen.student.domain.entity.Student;
import java.util.List;


public interface StudentRepository {
    List<Student> getAll() throws Exception;
    List<Student> findStudentByType(String typeStudent) throws Exception;
    double calculateAmount(Long studentId) throws Exception;
}
