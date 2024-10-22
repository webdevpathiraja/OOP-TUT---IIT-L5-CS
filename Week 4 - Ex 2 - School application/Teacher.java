public class Teacher extends Person {
    private double salary;
    private String subject;
    private Student[] students; // Array to store up to 3 students
    private int studentCount;    // Keep track of how many students are assigned

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender); // Call to the parent class constructor (Person)
        this.subject = subject;
        this.salary = salary;
        this.students = new Student[3]; // Fixed size array of 3 students
        this.studentCount = 0;          // Initialize the student count to 0
    }

    // Getter and Setter methods for subject and salary
    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Method to add a student to the teacher's student array
    public void addStudent(Student student) {
        if (studentCount < 3) { // Ensure the array has space for a new student
            students[studentCount] = student; // Add the student to the array
            studentCount++;                    // Increment the student count
            System.out.println(student + "Student added.");
        } else {
            System.out.println("This teacher already has 3 students assigned.");
        }
    }

    // Method to get the list of assigned students
    public Student[] getStudents() {
        return students;
    }

    // Override the toString method to include the teacher's information and the list of students
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(super.toString()); // Call the toString method of the Person class
        result.append(" Subject: ").append(subject);
        result.append(", Salary: ").append(salary);
        result.append("\nAssigned Students:\n");

        // Loop through the students array and add each student's details to the output
        for (int i = 0; i < studentCount; i++) {
            result.append(students[i].toString()).append("\n");
        }
        return result.toString();
    }
}
