import br.com.alura.streaming.models.Film;

public class Main {
    public static void main(String[] args) {

        Film myFilm = new Film();

        myFilm.setName("The Matrix");
        myFilm.setYearOfRelease(1999);
        myFilm.setDurationInMinutes(180);
        myFilm.setIncludedInThePlan(false);

        myFilm.displayTechnicalSpecifications();
        myFilm.evaluate(10);
        myFilm.evaluate(6);
        myFilm.evaluate(8);

        System.out.println("Média de avaliações do filme: " + myFilm.getMedia());
    }
}