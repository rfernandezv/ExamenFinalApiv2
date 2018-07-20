package examen.modulo.domain.entity;

public class StudentMaestria extends Student{

    public StudentMaestria(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, Double amount, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, amount, isActive);
    }

    @Override
    public double calculateAmount() {
        this.amount = 1000.0;
        return this.amount;
    }
    
}
