package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int min=arr[2]-arr[1];
        for (int i = 0; i <arr.length-1; i++) {
            if((arr[i+1]-arr[i]) < min){
                min=(arr[i+1]-arr[i]);
                list.clear();
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }else if((arr[i+1]-arr[i]) == min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }

        return list;
    }
}
