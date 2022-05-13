import Utilities.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Film pelicula = new Film(120, 3, "Titanic", Classification.PG13, Genres.DRAMA, LocalDate.of(1998,02,05));
        Film pelicula1 = new Film(120, 3, "Titanic 2", Classification.PG13, Genres.DRAMA, LocalDate.of(1998,02,05));
        VideoStore video = new VideoStore();

        video.addFilm(pelicula);
        video.addFilm(pelicula1);
        video.addClient(new Client("Franco","2235432067","Brown 2184"));
        video.addClient(new Client("Franco 2","2235432077","Brown 2183"));
        video.rentFilm("Titanic","Franco 2");
        video.rentFilm("Titanic 2", "Franco");

        System.out.println(video.getRentList());
    }
}