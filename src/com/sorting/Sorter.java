package com.sorting;

import java.util.Collection;
import java.util.List;

public interface Sorter<T extends Comparable> {

    void sort(List<T> list);

    Collection<T> sorted(List<T> list);
}
