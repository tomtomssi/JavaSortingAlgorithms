/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Tatu
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        long millis;
        
        List<Integer> arr = new LinkedList<>();
        List<Integer> r = new LinkedList<>();
        Sorts sorts = new Sorts();

        for (int i = 0; i < 2000; ++i) {
            arr.add(((int)(Math.random() * 100)));
        }
       
        millis = System.currentTimeMillis();
        //r = sorts.selectionSort(arr);
        //r = sorts.quickSort(arr);
        
        r = sorts.selectionSort(arr);
        System.out.println(System.currentTimeMillis() - millis + "ms");
        millis = System.currentTimeMillis();
        r = sorts.shellSort(arr);
        System.out.println(System.currentTimeMillis() - millis + "ms");
        millis = System.currentTimeMillis();
        r = sorts.quickSort(arr);
        System.out.println(System.currentTimeMillis() - millis + "ms");
    }
}
