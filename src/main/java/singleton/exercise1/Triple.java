package singleton.exercise1;

public class Triple {
    private static Triple[] singleton = new Triple[]{
            new Triple(0),
            new Triple(1),
            new Triple(2)
    };
    private int id;

    private Triple(int id) {
        System.out.println("The instance" + id + "is created.");
        this.id = id;
    }

    public static Triple getInstance(int id) {
        return singleton[id];
    }

    @Override
    public String toString() {
        return "Triple{" +
                "id=" + id +
                '}';
    }
}
