package com.chun.utility;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFile {

    public static List<String> Open() {
        List<String> info = new ArrayList<String>();
        File file = new File("src/test/java/com/chun/resources/Information.txt");
        try (Stream<String> stream = Files.lines(Paths.get(file.getAbsolutePath()))) {
            info = stream.sequential().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return info;
    }
}
