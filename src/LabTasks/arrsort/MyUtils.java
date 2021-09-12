package LabTasks.arrsort;

import java.util.Arrays;
import java.util.Comparator;

public class MyUtils {


    public static void main(String[] args) {
        int [][] arr  = new int[][]
                {{1,2},{},{3,2},{3,4},{2},{},{7,8,9},{2,1}};
        // всегда сранный пример с задачи полная хуйня поэтому придумал свой



    int[][] ints = arrSort(arr);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static int[][] arrSort(int[][] arr) {
        Arrays.sort(arr, (ints, t1) -> {
            if (ints.length == 0 ){
                return 1;
            }
            if(t1.length == 0){
                return -1;
            }
            if(ints[0]<t1[0]){
                return 1;
            }
            else if(ints[0]==t1[0]){
                if(ints.length>1 && t1.length>1){
                    return ints[1]-t1[1];
                }
                else{
                    return ints.length>t1.length?1:-1;
                }
            }
            else{
                return -1;
            }
        });
        return arr;
    }


}



