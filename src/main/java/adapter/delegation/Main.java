package adapter.delegation;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Hello");
        final PrintBanner p = new PrintBanner(banner);
        p.printWeak();
        p.printStrong();
    }
}
