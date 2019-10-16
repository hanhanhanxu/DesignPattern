package Builder.Mode;

//抽象建造者
public abstract class Builder {
    //创建产品对象
    protected Product product=new Product();//建造产品所以维护一个产品对象
    public abstract void buildPartA();//建造A部分 B C
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult()
    {
        return product;
    }
}