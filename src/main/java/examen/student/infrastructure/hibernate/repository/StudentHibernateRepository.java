package examen.student.infrastructure.hibernate.repository;


import examen.student.domain.entity.Student;
import examen.student.domain.entity.StudentDoctorado;
import examen.student.domain.entity.StudentMaestria;
import examen.student.domain.entity.StudentPregrado;
import examen.student.domain.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

@Repository
public class StudentHibernateRepository implements StudentRepository{
    
    private List<Student> students;
    
    public StudentHibernateRepository () {
        students = new ArrayList();       
        students.add(new StudentMaestria(1L,"Richar Marvin","Fernández Vílchez","00000001","MAESTRIA",true));
        students.add(new StudentMaestria(2L,"Lissi","Fernández Vílchez","00000002","MAESTRIA",true));
        students.add(new StudentMaestria(7L,"Rhony","Arevalo Diaz","00000007","MAESTRIA",false));
        students.add(new StudentMaestria(8L,"Marco","Surco Prado","00000008","MAESTRIA",true));
        students.add(new StudentPregrado(3L,"Adaia","Silvera Ortiz","00000003","PREGRADO",true));
        students.add(new StudentPregrado(4L,"Edgar","Tello Cardenas","00000004","PREGRADO",false));
        students.add(new StudentDoctorado(5L,"Mario","Salinas","00000005","DOCTORADO",true));
        students.add(new StudentDoctorado(6L,"Bruno","Tijero","00000006","DOCTORADO",true));
        
    }
    
    @Override
    public List<Student> getAll() throws Exception {
        return students;
    }

    @Override
    public List<Student> findStudentByType(String typeStudent) throws Exception {
        return students.stream().filter(student -> typeStudent.equals(student.typeGrade)).collect(Collectors.toList());
    }

    @Override
    public double calculateAmount(Long studentId) throws Exception {
        Double amount = students.stream()
                            .filter(student -> studentId.equals(student.studentId)).
                             map(student -> student.calculateAmount()).findFirst().get();
        if(amount != null){
            return amount;
        }
        return 0;
    }
    
}
