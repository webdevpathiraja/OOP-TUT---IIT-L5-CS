public class Actor {
    private String name;
    private int age;
    private Date dob;

    public Actor(String name, int age, Date dob) {
        this.name = name;
        this.age = age;
        this.dob= dob;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
