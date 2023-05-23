package Encapsulation;

public class Student {
    private String stdName;
    private String stdId;
    private int stdAge;
    private double stdGpa;
    private double stdHeight;

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public int getStdAge() {
        return stdAge;
    }

    public void setStdAge(int stdAge) {
        this.stdAge = stdAge;
    }

    public double getStdGpa() {
        return stdGpa;
    }

    public void setStdGpa(double stdGpa) {
        this.stdGpa = stdGpa;
    }

    public double getStdHeight() {
        return stdHeight;
    }

    public void setStdHeight(double stdHeight) {
        this.stdHeight = stdHeight;
    }
    public void getAll(){
        System.out.println("Name : "+stdName);
        System.out.println("Id : "+stdId);
        System.out.println("Age : "+stdAge);
        System.out.println("Gpa : "+stdGpa);
        System.out.println("Height : "+stdHeight);
        System.out.println();
    }
}
