/*
Results:
ArrayList Insertion:  60348047
LinkedList Insertion: 53801250
ArrayList 'Search':  11559440
LinkedList 'Search': 286310123
ArrayList Deletion:  678297933
LinkedList Deletion: 559545686
 */

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String args[]){


        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

// ArrayList insertion
        long startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList Insertion:  " + duration);

// LinkedList insertion
        startTime = System.nanoTime();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Insertion: " + duration);

// ArrayList Search
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            arrayList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList 'Search':  " + duration);

// LinkedList Search
        startTime = System.nanoTime();

        for (int i = 0; i < 10000; i++) {
            linkedList.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList 'Search': " + duration);


// ArrayList Deletion
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            arrayList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList Deletion:  " + duration);

// LinkedList Deletion
        startTime = System.nanoTime();

        for (int i = 9999; i >=0; i--) {
            linkedList.remove(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList Deletion: " + duration);
    }
}

