package singleton.exercise;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        TicketMaker ticketMaker1 = TicketMaker.getInstance();

        for (int i=0; i < 10; i++ ) {
            System.out.println(i + ":" + ticketMaker1.getNextTicketNumber());
        }

        System.out.println("End.");
    }
}
