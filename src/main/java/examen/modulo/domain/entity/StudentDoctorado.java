package examen.modulo.domain.entity;


public class StudentDoctorado extends Student{

    public StudentDoctorado(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, Double amount, boolean isActive) {
        super(studentId, firstName, lastName, studentCode, typeGrade, amount, isActive);
    }  
    
    
    @Override
    public double calculateAmount() {
        this.amount = 2000.0;
        return this.amount;
    }
}
