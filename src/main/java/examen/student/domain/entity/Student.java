package examen.student.domain.entity;

public abstract class Student {
    public Long studentId;
    public String firstName;
    public String lastName;
    public String studentCode;
    public String typeGrade;
    public boolean isActive;

    public Student() {
    }

    public Student(Long studentId, String firstName, String lastName, String studentCode, String typeGrade, boolean isActive) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentCode = studentCode;
        this.typeGrade = typeGrade;
        this.isActive = isActive;
    }
    
    

    public abstract double calculateAmount();
}
