package models;

public class TicketCinema {
    private String idTicket;
    private String nameCustomer;

    public TicketCinema(String idTicket, String nameCustomer) {
        this.idTicket = idTicket;
        this.nameCustomer = nameCustomer;
    }

    public String getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(String idTicket) {
        this.idTicket = idTicket;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    @Override
    public String toString() {
        return "TicketCinema{" +
                "idTicket='" + idTicket + '\'' +
                ", nameCustomer='" + nameCustomer + '\'' +
                '}';
    }
}
