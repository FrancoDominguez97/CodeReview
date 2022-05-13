package Utilities;

public class Client {
    private String name;
    private String phone;
    private String adress;

    public Client(String name, String phone, String adress) {
        this.name = name;
        this.phone = phone;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Cliente: \n" +
                "   Nombre:" + name + '\n'+
                "   Telefono: " + phone + '\n' +
                "   Direccion: " + adress+"\n";
    }
}
