package realization;

import tplate.HotDrink;

public class Tea extends HotDrink {
    @Override
    public void addCondiments() {
        System.out.println("添加茶叶");
    }
    @Override
    public void brew() {
        System.out.println("轻轻搅拌");
    }


}
