package cams;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Carlos
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Array");
        System.out.println("");
        executaShuffleArray();
        System.out.println("");
        System.out.println("List");
        executaShuffleList();
    }

    public static void executaShuffleArray() {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        ShuffleArray.shuffleArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void executaShuffleList() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        ShuffleList.shuffleList(list);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
