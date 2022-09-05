public class Movie {


    String title;
    String genre;
    int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;


        }
    void playIt(){
        System.out.println("Playing the Movie" + " " + this.title);
    }

}
