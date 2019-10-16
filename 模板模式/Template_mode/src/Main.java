import realization.Coffee;
import realization.Tea;
import realization.Water;
import tplate.HotDrink;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

       /* HotDrink tea = new Tea();
        HotDrink coffee = new Coffee();
        System.out.println("开始泡茶：");
        tea.prepareRecipe();
        System.out.println("开始泡咖啡：");
        coffee.prepareRecipe();*/
       HotDrink water = new Water();
       water.prepareRecipe();
    }
}
