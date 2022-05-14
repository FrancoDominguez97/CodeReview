package Utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    private List<Film> filmsList;
    private List<Client> clientList;
    private List<Rent> rentList;

    public VideoStore() {
        this.filmsList = new ArrayList<Film>();
        this.clientList = new ArrayList<Client>();
        this.rentList = new ArrayList<Rent>();
    }

    public List<Client>getClientList(){return clientList;}

    //Ver los alquileres vigentes
    public List<Rent> getRentList(){return rentList;}

    public List<Film>getFilmsList(){return filmsList;}

    public void addFilm(Film newFilm){
        filmsList.add(newFilm);
    }

    public Client searchClientByName(String clientName){
        for (Client search : clientList) {
            if (search != null && search.getName().equals(clientName))
                return search;
        }

        return null;
    }

    public String addClient(Client newClient){
        Client client = searchClientByName(newClient.getName());
        if (client == null)
            clientList.add(newClient);
        return null;
    }

    public Film searchFilmByTitle(String filmTitle){
        for (Film search : filmsList) {
            if (search != null && search.getTitle().equals(filmTitle))
                return search;
        }

        return null;
    }

    public Rent searchRentById(int rentId){
        for (Rent searchRent:rentList) {
            if (searchRent != null && searchRent.getId() == rentId)
                return searchRent;
        }
        return null;
    }
    public void deleteRent(int rentId){
        for (Rent rent : rentList) {
            if (rent != null && rent.getId() == rentId){
                rentList.remove(rent);
                return;
            }
        }
    }

    public Rent rentFilm(String filmTitle, String clientName){
        Film filmFound = searchFilmByTitle(filmTitle);
        Client clientFound = searchClientByName(clientName);
        if (filmFound != null && clientFound != null){
            Rent rentToAdd = new Rent(filmFound,clientFound, LocalDate.now());
            filmFound.setStock(filmFound.getStock()-1);
            rentList.add(rentToAdd);
            return rentToAdd;
        }
     return null;
    }

    public void returnFilm(int rentId){
        Rent rentFound = searchRentById(rentId);
        String filmName = rentFound.getFilm().getTitle();
        Film filmFound = searchFilmByTitle(filmName);
        filmFound.setStock(filmFound.getStock()+1);
        rentFound.setCondition(Condition.DEVUELTO);
    }

    public void filmsReturnToday(){
        for (Rent rent  : rentList) {
            if(rent.getReturnDate() == LocalDate.now())
                System.out.println(rent.toString());
        }
    }

    @Override
    public String toString() {
        return "Video Store{" +
                "Alquileres" + rentList +
                '}';
    }
}