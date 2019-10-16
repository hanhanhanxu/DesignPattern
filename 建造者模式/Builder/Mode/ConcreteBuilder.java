package Builder.Mode;

//具体建造者
public class ConcreteBuilder extends Builder {
    public void buildPartA()
    {
        product.setPartA("ConcreteBuilder的方式 建造 PartA");
    }
    public void buildPartB()
    {
        product.setPartB("ConcreteBuilder的方式 建造 PartB");
    }
    public void buildPartC()
    {
        product.setPartC("ConcreteBuilder的方式 建造 PartC");
    }
}