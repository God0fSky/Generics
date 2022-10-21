package ua.hillelit.homeworks.services;

import ua.hillelit.homeworks.fruits.Fruit;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> box;
    private float weightOfBox;

    public Box(ArrayList<T> box) {
        this.box = box;
    }

    void print() {
        for (T t : this.box) {
            System.out.println(t.getWeight() + "\t");
        }
        System.out.println();
    }

    boolean addOneFruit(T fruit) {
        try {
            if (this.getBox().get(0).getClass().equals(fruit.getClass())) {
                this.box.add(fruit);
                return true;
            } else {
                System.out.println("Яблоки не могут лежать с апельсинами");
                return false;
            }
        } catch (NullPointerException e) {
            e.getMessage();
            return false;
        }
    }

    boolean addFruits(T[] fruit) {
        try {
            if (this.getBox().get(0).getClass().equals(fruit.getClass())) {
                this.box.addAll(List.of(fruit));
                return true;
            } else {
                System.out.println("Яблоки не могут лежать с апельсинами");
                return false;
            }
        } catch (NullPointerException e) {
            e.getMessage();
            return false;
        }
    }

    float getWeight() {
        float weightOfBox = 0;
        for (T t : this.box) {
            weightOfBox += t.getWeight();
        }
        this.weightOfBox = weightOfBox;
        return weightOfBox;
    }

    boolean compare(Box box) {
        try {
            if (box.weightOfBox == this.weightOfBox) {
                return true;
            }
            return false;
        } catch (NullPointerException e) {
            e.getMessage();
        }
        return false;
    }

    boolean merge(ArrayList<T> arrayList) {
        try {
            if (this.getBox().get(0).getClass().equals(arrayList.get(0).getClass())) {
                this.box.addAll(arrayList);
                return true;
            } else {
                System.out.println("Яблоки не могут лежать с апельсинами");
                return false;
            }
        } catch (NullPointerException e) {
            e.getMessage();
            return false;
        }
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void setBox(ArrayList<T> box) {
        this.box = box;
    }

    public float getWeightOfBox() {
        return weightOfBox;
    }

    public void setWeightOfBox(float weightOfBox) {
        this.weightOfBox = weightOfBox;
    }
}