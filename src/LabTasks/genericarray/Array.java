package LabTasks.genericarray;

public class Array <T>{

    private T[] arr;

    public Array(T[] arr) {
        this.arr = arr;
    }

    public T get(int index){
        return arr[index];
    }

    public int length(){
        return arr.length;
    }
}
