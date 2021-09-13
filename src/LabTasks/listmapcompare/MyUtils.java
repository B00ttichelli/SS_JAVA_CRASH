package LabTasks.listmapcompare;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyUtils {
    // Code
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        // Code
        Set<String> mapValues = new HashSet<>();
        Set<String> listValues = new HashSet<>(list);
        for (Map.Entry<String, String> e : map.entrySet()
        ) {
            mapValues.add(e.getValue());
        }

        for (String str : listValues
        ) {
            mapValues.remove(str);
        }


        return mapValues.isEmpty();
    }
}
