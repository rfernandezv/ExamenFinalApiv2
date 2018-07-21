package examen.student.domain.entity;


public class StudentPregrado extends Student{

    public StudentPregrado(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, isActive);
    }
    
    @Override
    public double calculateAmount() {
        return 500.0;
    }    
}
