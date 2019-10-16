package Builder.Mode;

//客户端类
public class Client {
    public static void main(String[] args) {
        //建造者
        Builder builder=new ConcreteBuilder();
        Builder builder2 = new Concrete2Builder();

        //指挥者  维护抽象建造者
        Director director=new Director(builder);
        Director director2 = new Director(builder2);

        //指挥者指挥去生产产品，按照每个具体建造者的方式
        Product product=director.construct();
        Product product2 = director2.construct();

        //同一个类Product，由于不同指挥者（维护不同的具体建造者）生产出不同对象
        product.show();
        product2.show();
    }
}