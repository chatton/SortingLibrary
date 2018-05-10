package com.sorting;

import java.util.ArrayList;
import java.util.List;

public interface Sorter<T extends Comparable<T>> {

    void sort(List<T> list);

    default List<T> sorted(List<T> list){
        final List<T> other = new ArrayList<>(list);
        sort(other);
        return other;
    }
}
