package examen.student.domain.entity;

public class StudentMaestria extends Student{

    public StudentMaestria(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, isActive);
    }

    @Override
    public double calculateAmount() {
        return 1000.0;
    }
    
}
