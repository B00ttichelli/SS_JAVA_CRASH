package LabTasks.readfile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static String readFile(String filename) throws IOException {

        // Write your code here

        java.nio.file.Path path = Path.of(filename);
        List<String> stringList = Files.lines(path).collect(Collectors.toList());
        StringBuilder stringBuilder =new StringBuilder();
        for (String s :stringList) {

            stringBuilder.append(s);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
