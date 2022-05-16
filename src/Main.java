import Utilities.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Film pelicula1 = new Film(120, 3, "Titanic", Audience.PG13, MovieGenre.DRAMA, LocalDate.of(1998,02,05));
        Film pelicula2 = new Film(120, 3, "Matrix", Audience.PG13, MovieGenre.ACTION, LocalDate.of(2001,02,05));
        Client client1 = new Client("Franco","2235432067","Brown 2184");
        Client client2 = new Client("Franco 2","2235432077","Brown 2183");
        VideoStore video = new VideoStore();

        video.addFilm(pelicula1);
        video.addFilm(pelicula2);
        video.addClient(client1);
        video.addClient(client2);
        video.rentFilm(pelicula1.getTitle(),client1.getName());
        video.rentFilm(pelicula2.getTitle(), client2.getName());

        video.getRentList();
    }
}