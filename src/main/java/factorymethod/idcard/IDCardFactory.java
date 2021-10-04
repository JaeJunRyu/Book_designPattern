package factorymethod.idcard;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;
//    private List owners = new ArrayList();
//    private List<String> owners = new ArrayList();

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        final IDCard card = (IDCard) product;
        database.put(new Integer(card.getSerial()),card.getOwner());
//        owners.add(
//                ((IDCard)product).getOwner()
//        );
    }

//    public List<String> getOwners() {
//        return owners;
//    }

    public HashMap getDatabase() {
        return database;
    }

//    public List getOwners() {
//        return owners;
//    }
}

