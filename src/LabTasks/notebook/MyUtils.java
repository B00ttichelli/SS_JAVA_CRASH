package LabTasks.notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {
    // Code
    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        // Code

        Map<String, List<String>> notebook = new HashMap<>();
        if (phones != null) {

            for (Map.Entry<String, String> entry : phones.entrySet()
            ) {
                if (entry.getKey() != null) {
                    notebook.put(entry.getValue(), new ArrayList<>());
                }
            }
            if (notebook.size() > 0) {

                for (String name : notebook.keySet()
                ) {
                    List<String> contact = new ArrayList<>();

                    for (Map.Entry<String, String> entry : phones.entrySet()
                    ) {
                        if (entry.getValue() == null && entry.getKey() != null) {
                            contact.add(entry.getKey());
                        } else if (entry.getValue().equals(name) && entry.getKey() != null) {
                            contact.add(entry.getKey());
                        }
                    }
                    notebook.put(name, contact);

                }
            }


        }
        return notebook;


    }
}