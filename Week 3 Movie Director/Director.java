public class Director {
    private String name;
    private String surname;
    private int numDirectedMovie;
    private Date Dob;

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surname;
    }

    public Date getDob() {
        return Dob;
    }

    public int getNumDirectedMovie() {
        return numDirectedMovie;
    }

    public void setNumDirectedMovie(int numDirectedMovie) {
        this.numDirectedMovie = numDirectedMovie;
    }

    public void setDob(Date dob) {
        Dob = dob;
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numDirectedMovie=" + numDirectedMovie +
                ", Dob=" + Dob +
                '}';
    }
}
