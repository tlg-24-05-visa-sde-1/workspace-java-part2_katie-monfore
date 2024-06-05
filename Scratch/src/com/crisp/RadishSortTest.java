package com.crisp;

import java.util.ArrayList;
import java.util.List;

public class RadishSortTest {

    public static void main(String[] args) {
        List<Radish> radishes = new ArrayList<>();

        radishes.add(new Radish("red", 1.5, 2.5, 5));
        radishes.add(new Radish("black", 1.0, 0.0, 0));
        radishes.add(new Radish("red", 1.5, 0.0, 7));
        radishes.add(new Radish("pink", .9, 5.5, 0));

        dump(radishes);

        //sort by natural order (passing null means natural order)
        System.out.println("sort by natural order");
        radishes.sort(null);

        dump(radishes);

        System.out.println("sort by color via RadishColorComparator");
        radishes.sort(new RadishColorComparator());

    }
    private static void dump(List<Radish> radishList) {
        for (Radish radish : radishList) {
            System.out.println(radish); //toString() automatically called
        }
    }
}
