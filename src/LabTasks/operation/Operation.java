package LabTasks.operation;

class Operation{
    public static  int squareRectangle (int a, int b) throws IllegalArgumentException {
        //your code
        if (a<1 || b<1){
            throw new IllegalArgumentException("both arguments should be more than zero");
        }
        return a*b;
    }

    public static int trySquareRectangle(int a, int b) {
        //your code
        int  area ;
        try {
            area = squareRectangle(a,b);
        } catch (IllegalArgumentException e) {
            return -1;
        }
        return area;
    }
}
