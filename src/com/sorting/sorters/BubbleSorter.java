package com.sorting.sorters;

import java.util.List;

public class BubbleSorter<T extends Comparable<T>> extends SwappingSorter<T> {
    @Override
    public void sort(List<T> list) {
        boolean swapped;
        for (int i = 0; i < list.size() - 1; i++) {
            swapped = false;
            for (int j = 0; j < list.size() - 1; j++) {
                if (list.get(j).compareTo(list.get(j + 1)) >= 0) {
                    swap(list, i, j);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}