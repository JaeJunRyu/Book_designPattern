package templatemethod;

public class Main {
    public static void main(String[] args) {
        //"H를 가진 CharDisplay 인스턴스 1개를 만든다.
        final AbstractDisplay charDisplay = new CharDisplay('H');

        // "Hello, world"를 가진 StringDisplay의 인스턴스를 1개 만든다.
        final AbstractDisplay stringDisplay = new StringDisplay("Hello, world");

        // 안녕하세요.를 가진 StringDisplay의 인스턴스를 1개 만든다.
        final AbstractDisplay stringDisplay1 = new StringDisplay("안녕하세요.");
        /**
         * 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이기 때문에 상속한 display 메소드를 호출할 수 있다.
         * 실제 동작은 CharDisplay나 StringDisplay에서 결정한다.
         */
        charDisplay.display();
        stringDisplay.display();
        stringDisplay1.display();
    }
}
