package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    private static Path INPUT_PATH = Paths.get("resources/input.txt");
    private static Path OUTPUT_PATH = Paths.get("resources/output.txt");

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(INPUT_PATH, StandardCharsets.UTF_8);
        List<String> result = Combiner.combineCities(new Cities(lines));
        Files.write(OUTPUT_PATH ,result, Charset.defaultCharset());
    }


}
