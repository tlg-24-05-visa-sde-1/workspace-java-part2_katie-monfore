package com.entertainment.client;

import com.entertainment.Television;

import java.util.HashSet;
import java.util.Set;

class TelevisionClient {
    public static void main(String[] args) {
        Television tv1 = new Television();
        Television tv2 = new Television("RCA", 10);

        System.out.println(tv1);  //toString() automatically called
        System.out.println(tv2);

        tv2.changeChannel(9);
        System.out.println(tv2);
        System.out.println();

        // this part of the application is to examine == and the equals() method
        Television tvA = new Television("Sony", 50);
        Television tvB = new Television("LG", 52);

        System.out.println(tvA.hashCode());  //54
        System.out.println(tvB.hashCode());  //54


        System.out.println("tvA == tvB: " + (tvA == tvB)); //FALSE OF COURSE
        System.out.println("tvA.equals(tvB): " + tvA.equals(tvB)); // true
        System.out.println();

        Set<Television> tvs = new HashSet<>();
        tvs.add(tvA);
        tvs.add(tvB);
        System.out.println("The size of the Set is: " + tvs.size());
    }
}
