package experiment.Experiment7;


public class Ticket {
    public static int tickets = 200;

    public synchronized void Sale_ticket(){
        if (tickets > 0){
            tickets --;
        }else{
            System.out.println("票卖完了");
        }
    }
    public synchronized void getTickets(){
        System.out.println("还剩"+tickets+"张票");
    }
}
