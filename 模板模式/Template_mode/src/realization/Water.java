package realization;

import tplate.HotDrink;

public class Water extends HotDrink {
    @Override
    public void addCondiments() {

    }
    public boolean want_addCondiments(){
        return false;
    }

    @Override
    public void brew() {
        System.out.println("白开水，怎样搅拌都行");
    }
}
