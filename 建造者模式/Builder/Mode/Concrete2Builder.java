package Builder.Mode;

//第二个具体建造者
public class Concrete2Builder extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("Concrete2 的方式 建造PartA");
    }

    @Override
    public void buildPartB() {
        product.setPartB("Concrete2 的方式 建造PartB");
    }

    @Override
    public void buildPartC() {
        product.setPartC("Concrete2 的方式 建造PartC");
    }
}
