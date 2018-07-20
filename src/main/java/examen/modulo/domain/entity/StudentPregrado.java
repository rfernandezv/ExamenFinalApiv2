package examen.modulo.domain.entity;


public class StudentPregrado extends Student{

    public StudentPregrado(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, Double amount, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, amount, isActive);
    }
    
    @Override
    public double calculateAmount() {
        this.amount = 500.0;
        return this.amount;
    }    
}
