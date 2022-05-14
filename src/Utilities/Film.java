package Utilities;

import java.time.LocalDate;

public  class Film {
    private int duration;
    private int stock;
    private String title;
    private Audience audience;
    private MovieGenre genre;
    private LocalDate releaseDate;

    public Film (int duration,int stock, String title, Audience audience, MovieGenre genre, LocalDate releaseDate) {
        this.duration = duration;
        this.stock = stock;
        this.title = title;
        this.audience = audience;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MovieGenre getGenre() {
        return genre;
    }

    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    public Audience getClassification() {
        return audience;
    }

    public void setClassification(Audience audience) {
        this.audience = audience;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Pelicula: \n" +
                "   Titulo: " + title + '\n'+
                "   Duracion: " + duration + " minutos" + '\n' +
                "   Clasificacion de Audiencia: " + audience + '\n' +
                "   Genero: " + genre + '\n' +
                "   Fecha de estreno: " + releaseDate + '\n' +
                "   En stock: "  + stock +
                "\n";
    }
}
