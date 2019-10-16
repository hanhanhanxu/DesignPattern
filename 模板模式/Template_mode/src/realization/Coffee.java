package realization;

import tplate.HotDrink;

public class Coffee extends HotDrink {
    @Override
    public void addCondiments() {
        System.out.println("加入咖啡");
    }

    @Override
    public void brew() {
        System.out.println("快速搅拌");
    }
}
