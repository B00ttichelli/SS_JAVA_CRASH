package LabTasks.notebook;

import java.util.HashMap;
import java.util.List;
import java.util.Map;




/*
        {0501234567=null}false
        {0671234567=null, 0501234567=null}
        */

public class Test {

    public static void main(String[] args) {
        MyUtils myUtils = new MyUtils();
        Map<String,String> map = new HashMap<>();

        map.put("0501234567",null);
        map.put("0671234567",null);

        System.out.println(myUtils.createNotebook(map));
    }
}
