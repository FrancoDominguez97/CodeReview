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
    public void getRentList(){
        for (Rent rent : rentList) {
            if (rent.getCondition() == Condition.ALQUILADO)
                System.out.println(rent.toString());
        }
    }

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

    public Rent returnFilm (String clientName, String filmTitle) {
        for (Rent rent : rentList) {
            if (rent.getClient().getName().equals(clientName) && rent.getFilm().getTitle().equals(filmTitle) && rent.getCondition() != Condition.DEVUELTO) {
                    rent.setCondition(Condition.DEVUELTO);
                    rent.getFilm().setStock(rent.getFilm().getStock()+1);
                    return rent;
            }
        }
        return null;
    }


    @Override
    public String toString() {
        return "Video Store{" +
                "Alquileres" + rentList +
                '}';
    }
}