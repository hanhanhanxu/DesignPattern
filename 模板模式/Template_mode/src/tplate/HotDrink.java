package tplate;


//模板是一个抽象类，模板中所包含的内容：
/*
    1、算法步骤，使用final修饰，子类不可更改
    2、已经实现的方法，使用final修饰，子类不可更改
    3、抽象的方法
    4、hook，子类可选项
 */

//泡东西喝
public abstract class HotDrink {
    //模板模式：封装了一个算法步骤（prepareRecipe）
    //并允许子类为一个或多个步骤方法提供实现模板模式可以使子类在不改变算法结构的情况下，
    //重新定义算法中的某些步骤。
    public final void prepareRecipe(){
        //烧水
        boiWater();
        //倒入杯子中
        pourInCup();
        //添加佐料
        if(want_addCondiments()){
            addCondiments();
        }
        //泡
        brew();
    }
    //hook方法默认父类实现。子类根据情况可覆盖。
    public boolean want_addCondiments(){
        return true;
    }

    //相同的方法父类实现
    public final void boiWater(){
        System.out.println("烧开水");
    }

    public final void pourInCup(){
        System.out.println("将水倒入杯子中");
    }
    public abstract void addCondiments();
    public abstract void brew();
}
