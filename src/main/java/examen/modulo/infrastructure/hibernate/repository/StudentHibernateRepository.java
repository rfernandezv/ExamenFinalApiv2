package examen.modulo.infrastructure.hibernate.repository;


import examen.modulo.domain.entity.Student;
import examen.modulo.domain.entity.StudentDoctorado;
import examen.modulo.domain.entity.StudentMaestria;
import examen.modulo.domain.entity.StudentPregrado;
import examen.modulo.domain.repository.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class StudentHibernateRepository implements StudentRepository{
    
    private List<Student> students;
    
    public StudentHibernateRepository () {
        students = new ArrayList();       
        students.add(new StudentMaestria(1L,"Richar Marvin","Fernández Vílchez","00000001","MAESTRIA",0.0,true));
        students.add(new StudentMaestria(2L,"Lissi","Fernández Vílchez","00000002","MAESTRIA",0.0,true));
        students.add(new StudentPregrado(3L,"Adaia","Silvera Ortiz","00000003","PREGRADO",0.0,true));
        students.add(new StudentPregrado(4L,"Edgar","Tello Cardenas","00000004","PREGRADO",0.0,false));
        students.add(new StudentDoctorado(5L,"Mario","Salinas","00000005","DOCTORADO",0.0,true));
        students.add(new StudentDoctorado(6L,"Bruno","Tijero","00000006","DOCTORADO",0.0,true));
        
    }
    
    @Override
    public List<Student> getAll() throws Exception {
        return students;
    }

    @Override
    public List<Student> findStudentByType(String typeStudent) throws Exception {
        List<Student> lstStudent = new ArrayList<>();
        for(Student student :students) {
            if(student.typeGrade.equals(typeStudent) ) {
                lstStudent.add(student);                
            }
        }
        return lstStudent;
    }

    @Override
    public double calculateAmount(Long studentId) throws Exception {
        for(Student student :students) {
            if(student.studentId == studentId ) {
                student.calculateAmount();
                return student.amount;
            }
        }
        return 0;
    }
    
}
