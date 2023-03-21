import drinks.Coffee;
import drinks.Tea;
import drinks.TeaType;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Generic types are used when we do not what type of data we will receive (collection of object of different classes)

        Tea greenTeaWithLemon = new Tea(3.4d, 4, TeaType.GREEN_TEA);
        Tea purpleTea = new Tea(3.4d, 4, TeaType.PURPLE_TEA);
        Tea redTea = new Tea(3.4d, 4, TeaType.RED_TEA);

        Cup<Tea> teeCup = new Cup<>(greenTeaWithLemon);
        Cup<Tea> teeCup2 = new Cup<>(purpleTea);
        Cup<Tea> teeCup3 = new Cup<>(redTea);

        teeCup.takeASip();
        teeCup2.takeASip();
        teeCup3.takeASip();

        Coffee geenCoffee = new Coffee(5, 54, 2);
        Coffee purpleCoffee = new Coffee(54, 3, 5);
        Coffee redCoffee = new Coffee(2, 3, 44);

        Cup<Coffee> coffeeCup = new Cup<>(geenCoffee);
        Cup<Coffee> coffeeCup2 = new Cup<>(purpleCoffee);
        Cup<Coffee> coffeeCup3 = new Cup<>(redCoffee);


        ArrayList<Cup> drinks = new ArrayList<>();

        drinks.add(coffeeCup3);
        drinks.add(teeCup2);
        drinks.add(coffeeCup2);
        drinks.add(teeCup);

        drinks.forEach(currentCup -> currentCup.takeASip());
    }
}
