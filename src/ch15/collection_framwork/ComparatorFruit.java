package ch15.collection_framwork;

import java.util.Comparator;

public class ComparatorFruit implements Comparator<ComparatorFruitData> {
    @Override
    public int compare(ComparatorFruitData o1, ComparatorFruitData o2) {
        if (o1.price < o2.price) return -1;
        else if (o1.price == o2.price) return 0;
        else return 1;
    }
}
