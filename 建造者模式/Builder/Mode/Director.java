package Builder.Mode;

//指挥者
public class Director {
    //维护一个抽象建造者
    private Builder builder;
    public Director(Builder builder) {//传入这个建造者
        this.builder=builder;
    }
    //产品构建与组装方法
    public Product construct() {//指挥者指挥建造者 生产产品
        builder.buildPartA();//每个产品的生产细节不同，所以调用统一的方法，由同实现者建造不同对象
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}