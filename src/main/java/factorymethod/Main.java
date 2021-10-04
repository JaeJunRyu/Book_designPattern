package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IDCard;
import factorymethod.idcard.IDCardFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
//        IDCardFactory factory = new IDCardFactory();
        final Product card1 = factory.create("홍길동");
        final Product card2 = factory.create("이순신");
        final Product card3 = factory.create("강감찬");

        card1.use();
        card2.use();
        card3.use();

//        final List<String> owners = factory.getOwners();
//        for (String owner : owners) {
//            System.out.println("owner = " + owner);
//        }

//        IDCard idCard = new IDCard("홍길동");
    }
}
