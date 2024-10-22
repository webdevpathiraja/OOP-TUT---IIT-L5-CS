// Modified Movie class to include Actor list
public class Movie {
    private String title;
    private String category;
    private int numAwards;
    private Director director;
    private Actor[] listActor;

    public Movie(String title, String category, Director director, int numActors) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.listActor = new Actor[numActors];  // Initialize the actor array
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getNumAwards() {
        return numAwards;
    }

    public Director getDirector() {
        return director;
    }

    public void setNumAwards(int numAwards) {
        this.numAwards = numAwards;
    }

    public Actor[] getListActor() {
        return listActor;
    }

    public void setActor(Actor actor, int index) {
        this.listActor[index] = actor;
    }

    @Override
    public String toString() {
        StringBuilder actorList = new StringBuilder();
        for (Actor actor : listActor) {
            if (actor != null) {
                actorList.append(actor.toString()).append("\n");
            }
        }
        return "Movie{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", numAwards=" + numAwards +
                ", director=" + director +
                ", listActor=\n" + actorList.toString() +
                '}';
    }
}
