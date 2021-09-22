package challanges.hackerrank.java.datastructure;

import java.util.ArrayList;
import java.util.Random;

public class Java2DArray {

    // https://www.hackerrank.com/challenges/java-2d-array/problem

    public static void main(String[] args) {
        makeMatrix2d();
    }

    private static ArrayList<Integer> makeMatrix2d() {
        Random random = new Random();

        ArrayList<Integer> firstLine = new ArrayList<>();
        //make first random line in hourglass
        firstLine.add(0, random.nextInt());
        firstLine.add(1, random.nextInt());
        firstLine.add(2, random.nextInt());
        firstLine.add(3, random.nextInt());
        firstLine.add(4, random.nextInt());
        firstLine.add(5, random.nextInt());

        ArrayList<Integer> secondLine = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            if (i == 1 || i == 4) secondLine.add(i, random.nextInt());
            else secondLine.add(i, 0);
        }

//        ArrayList<ArrayList<Integer>> arrayMatrix2d = new ArrayList<>();
//        arrayMatrix2d.add(0, firstLine);
//        arrayMatrix2d.add(1, firstLine);

        System.out.println(firstLine);
        System.out.println(secondLine);

//        System.out.println(arrayMatrix2d);
        return firstLine;
    }
}
