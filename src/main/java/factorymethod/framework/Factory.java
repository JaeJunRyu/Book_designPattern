package factorymethod.framework;

public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);
//    public Product createProduct(String name) {
//        return new Product(name);
//
//    }
//    public Product createProduct(String name) {
//        throw new FactoryMethodRuntimeException();
//    }
    protected abstract void registerProduct(Product p);
}
