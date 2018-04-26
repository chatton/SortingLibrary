package com.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public interface Sorter<T extends Comparable<T>> {

    void sort(List<T> list);

    default Collection<T> sorted(List<T> list){
        List<T> other = new ArrayList<>(list);
        this.sort(other);
        return other;
    }
}
