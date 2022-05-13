package Utilities;

import java.time.LocalDate;

public  class Film {
    private int duration;
    private int stock;
    private String title;
    private String classification;
    private String genre;
    private LocalDate releaseDate;



    public Film(int duration,int stock, String title, String classification, String genre, LocalDate releaseDate) {
        this.duration = duration;
        this.stock = stock;
        this.title = title;
        this.classification = classification;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
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
                "   Clasificacion de Audiencia: " + classification + '\n' +
                "   Genero: " + genre + '\n' +
                "   Fecha de estreno: " + releaseDate + '\n' +
                "   En stock: "  + stock +
                "\n";
    }
}
