public class Student extends Person{
    private int IDNumber;
    private double fee;
    private int grade;

    public Student(String name, int age, String gender, int idNum) {
        super(name, age, gender);
        this.IDNumber = idNum;
        this.fee = 0.0;
        this.grade = 0;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public double getFee() {
        return fee;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "IDNumber=" + IDNumber +
                ", fee=" + fee +
                ", grade=" + grade +
                "} " + super.toString();
    }
}
