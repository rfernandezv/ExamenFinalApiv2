package examen.modulo.domain.entity;

public abstract class Student {
    public Long studentId;
    public String firstName;
    public String lastName;
    public String studentCode;
    public String typeGrade;
    public Double amount;
    public boolean isActive;

    public Student() {
    }

    public Student(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, Double amount, boolean isActive) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.typeGrade = typeGrade;
        this.amount = amount;
        this.isActive = isActive;
    }
    
    

    public abstract double calculateAmount();
}
