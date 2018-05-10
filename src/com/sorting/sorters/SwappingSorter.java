package com.sorting.sorters;

import com.sorting.Sorter;

import java.util.List;

abstract class SwappingSorter<T extends Comparable<T>> implements Sorter<T> {
    void swap(List<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
}
