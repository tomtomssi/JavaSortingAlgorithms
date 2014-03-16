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
public class Sorts {

    public <E extends Comparable<? super E>> List<E> selectionSort(List<E> arr) {
        for (int i = 0; i < arr.size() - 1; ++i) {
            for (int j = i + 1; j < arr.size(); ++j) {
                if (arr.get(i).compareTo(arr.get(j)) < 0) {
                    E temp = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, temp);
                }
            }
        }
        return arr;
    }

    public <E extends Comparable<? super E>> List<E> quickSort(List<E> arr) {
        if (!arr.isEmpty()) {

            E pivot = arr.get(0);

            List<E> left = new LinkedList<>();
            List<E> pivotList = new LinkedList<>();
            List<E> right = new LinkedList<>();

            for (E i : arr) {
                if (i.compareTo(pivot) < 0) {
                    left.add(i);
                } else if (i.compareTo(pivot) > 0) {
                    right.add(i);
                } else {
                    pivotList.add(i);
                }
            }

            left = quickSort(left);
            right = quickSort(right);

            left.addAll(pivotList);
            left.addAll(right);
            return left;
        }
        return arr;
    }

    public <E extends Comparable<? super E>> List<E> shellSort(List<E> arr) {
        E temp;
        int g = arr.size() / 2;
        for (int i = 0; i < arr.size(); ++i) {
            if (i + g + 1 > arr.size()) {
                if (g == 1) {
                    return selectionSort(arr);
                }
                g = g / 2;
                i = -1;
                continue;
            }
            if (arr.get(i).compareTo(arr.get(i + g)) < 0) {
                temp = arr.get(i);
                arr.set(i, arr.get(i + g));
                arr.set(i + g, temp);
            }
        }
        return arr;
    }
}
