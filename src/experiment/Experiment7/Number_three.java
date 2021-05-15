package experiment.Experiment7;


public class Number_three {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0;i < 3;i++){
            new Thread(() ->{
                ticket.Sale_ticket();
                ticket.getTickets();
            }).start();
        }
    }
}
