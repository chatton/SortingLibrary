package com.sorting.sorters;

import com.sorting.Sorter;

import java.util.List;

// adapted from pseudo code here
// https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm

public class InsertionSorter<T extends Comparable<T>> implements Sorter<T> {
    @Override
    public void sort(List<T> list) {
        for(int i = 1; i < list.size(); i++){
            final T valueToInsert = list.get(i);
            int position = i;
            while(position > 0 && list.get(position - 1).compareTo(valueToInsert) > 0){
                list.set(position, list.get(position - 1));
                position--;
            }
            list.set(position, valueToInsert);
        }
    }
}
