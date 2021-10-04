package singleton.exercise;

public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {
    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }
    private int ticket = 1000;
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
