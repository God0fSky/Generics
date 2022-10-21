package ua.hillelit.homeworks.services;

import ua.hillelit.homeworks.fruits.Apple;
import ua.hillelit.homeworks.fruits.Fruit;
import ua.hillelit.homeworks.fruits.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple(2.5F);
        Apple apple2 = new Apple(1.5F);
        Apple apple3 = new Apple(3.2F);
        Apple apple4 = new Apple(1.3F);

        Orange orange1 = new Orange(3.5F);
        Orange orange2 = new Orange(0.5F);

        Apple []appleArray = {apple1, apple2};

        ArrayList<Apple> appleBox = new ArrayList<>();
        appleBox.add(apple1);
        appleBox.add(apple2);

        ArrayList<Apple> appleBox2 = new ArrayList<>();
        appleBox2.add(apple4);
        appleBox2.add(apple3);

        ArrayList<Orange> orangeBox = new ArrayList<>();
        orangeBox.add(orange1);
        orangeBox.add(orange2);

        Box boxOfApple = new Box(appleBox);
        Box boxOfApple2 = new Box(appleBox2);

        Box boxOfOrange = new Box(orangeBox);

        boxOfApple.print();
        boxOfApple.merge(boxOfApple2.getBox());
        boxOfApple.print();

    }

    public static ArrayList<Fruit> toList(Fruit []array) {
        ArrayList<Fruit> list = (ArrayList<Fruit>) Arrays.asList(array);
        return list;
    }
}
