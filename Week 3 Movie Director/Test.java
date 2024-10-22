public class Test {
    public static void main(String[] args) {

        // Director object to create movie object
        Director director = new Director("Willy", "Wonka");

        Date dob = new Date(16,8,1964);
        
        director.setDob(dob);
        director.setNumDirectedMovie(23);

        System.out.println(director); // Director's toString()

        System.out.println("name is: " + director.getName());
        System.out.println("surname is: " + director.getSurName());
        System.out.println("dob is: " + director.getDob());
        System.out.println("number of movies directed is: " +
                director.getNumDirectedMovie());

        System.out.println();

        // Movie object
        Movie movie = new Movie("Avatar", "Fantasy", director, 2);
       
        // Test Setters and Getters
        movie.setNumAwards(23);

        Actor actor1 = new Actor("Leonardo DiCaprio", 45, new Date(11, 11, 1974));
        Actor actor2 = new Actor("Kate Winslet", 40, new Date(5, 10, 1981));

        movie.setActor(actor1, 0); // Adding actor1
        movie.setActor(actor2, 1); // Adding actor2
        
        System.out.println(movie);
        System.out.println("title is: " + movie.getTitle());
        System.out.println("category is: " + movie.getCategory());
        System.out.println("name of director is: " + movie.getDirector().getName());
        System.out.println("surname of the director is: " + movie.getDirector().getSurName());
        System.out.println("number of awards is: " + movie.getNumAwards());

        System.out.println(movie); // Movie's toString with actors

    }
}
