package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogFileReader {

    public static List<LogEntry> readLogs(Path path) {

        try (Stream<String> lines = Files.lines(path)) {
            return lines
                    .map(line -> {
                        String[] parts = line.split(" ", 3);
                        return new LogEntry(parts[0], parts[1], parts[2]);
                    })
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
