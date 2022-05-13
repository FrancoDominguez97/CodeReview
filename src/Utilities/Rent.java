package Utilities;

import java.time.LocalDate;

public class Rent {
    private static int i = 1;


    private int id;
    private Film film;
    private Client client;
    private LocalDate rentDate;
    private LocalDate returnDate;

    public Rent(Film film, Client client, LocalDate rentDate) {
        this.id = i++;
        this.film = film;
        this.client = client;
        this.rentDate = rentDate;
        this.returnDate = rentDate.plusDays(2);
    }

    public Rent() {
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public int getId() {
        return id;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    @Override
    public String toString() {
        return "\nAlquiler{" +
                "Id: " + id + '\n' +
                 film + '\n' +
                 client + '\n' +
                "Fecha de alquiler: " + rentDate + '\n' +
                "Fecha de devolucion: " + returnDate +
                "\n}";
    }
}
