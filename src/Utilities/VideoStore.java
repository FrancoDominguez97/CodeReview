package Utilities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VideoStore {

    private List<Film>filmsList;
    private List<Rent>rentList;
    private List<Client>clientList;

    public VideoStore() {
        this.filmsList = new ArrayList<Film>();
        this.rentList = new ArrayList<Rent>();
        this.clientList = new ArrayList<Client>();
    }

    public List<Client>getClientList(){return clientList;}

    //Ver los alquileres vigentes
    public List<Rent> getRentList(){return rentList;}

  public List<Film>getFilmsList(){return filmsList;}

    public void addFilm(Film newFilm){
        filmsList.add(newFilm);
    }

    public Client searchClient(String name){
        for (Client search : clientList) {
            if (search != null && search.getName().equals(name))
                return search;
        }
        return null;
    }

    public String addClient(Client newClient){
        Client search = searchClient(newClient.getName());
        if (search == null){
            clientList.add(newClient);
        }
        return null;
    }

    public Film searchFilm(String title){
        for (Film search : filmsList) {
            if (search != null && search.getTitle().equals(title)){
                return search;
            }
        }
        return null;
    }


    public Rent searchRent(int id){
        for (Rent searchRent:rentList) {
            if (searchRent != null && searchRent.getId() == id)
                return searchRent;
        }
        return null;
    }
    public void deleteRent(int id){
        for (Rent delete : rentList) {
            if (delete != null && delete.getId() == id){
                rentList.remove(delete);
                break;
            }
        }
    }

    public Rent rentFilm(String title, String name){
        Film filmToRent = searchFilm(title);
        Client clientSearch = searchClient(name);
        if (filmToRent != null && clientSearch != null){
            Rent addRent = new Rent(filmToRent,clientSearch, LocalDate.now());
            rentList.add(addRent);
            return  addRent;
        }
     return null;
    }

    public void returnFilm(int id){
        Rent search = searchRent(id);
        String filmName = search.getFilm().getTitle();
        Film film = searchFilm(filmName);
        film.setStock(film.getStock()+1);
        deleteRent(id);
    }



    @Override
    public String toString() {
        return "Video Store{" +
                "Alquileres" + rentList +
                '}';
    }
}
