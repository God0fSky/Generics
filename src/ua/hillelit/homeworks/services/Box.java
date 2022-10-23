package ua.hillelit.homeworks.services;

import ua.hillelit.homeworks.fruits.Fruit;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> listBox;
    private float weightOfBox;

    public Box(List<T> box) {
        this.listBox = box;
    }

    void print() {
        for (T t : this.listBox) {
            System.out.println(t.getWeight() + "\t");
        }
        System.out.println();
    }

    boolean addOneFruit(T fruit) {
        try {
            if (this.getBox().get(0).getClass().equals(fruit.getClass())) {
                this.listBox.add(fruit);
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
                this.listBox.addAll(List.of(fruit));
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
        for (T t : this.listBox) {
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

    boolean merge(List<T> arrayList) {
        try {
            if (this.getBox().get(0).getClass().equals(arrayList.get(0).getClass())) {
                this.listBox.addAll(arrayList);
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

    public List<T> getBox() {
        return listBox;
    }

    public void setBox(List<T> box) {
        this.listBox = box;
    }
}
