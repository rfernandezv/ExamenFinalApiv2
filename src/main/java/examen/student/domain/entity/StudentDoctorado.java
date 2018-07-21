package examen.student.domain.entity;


public class StudentDoctorado extends Student{

    public StudentDoctorado(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, isActive);
    }  
    
    
    @Override
    public double calculateAmount() {
        return 2000.0;
    }
}
