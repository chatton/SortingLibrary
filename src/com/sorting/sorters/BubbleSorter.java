package com.sorting.sorters;

import com.sorting.Sorter;

import java.util.List;

public class BubbleSorter<T extends Comparable<T>> implements Sorter<T>{

    @Override
    public void sort(List<T> list) {
        boolean swapped;
        for(int i = 0; i < list.size() - 1; i++){
            swapped = false;
            for (int j = 0; j < list.size() - 1; j++){
                if(list.get(j).compareTo(list.get(j + 1)) >= 0){
                    T temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}