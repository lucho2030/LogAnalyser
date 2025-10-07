package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;

import org.example.AbstractTask;

public class Main {
    public static void main(String[] args) throws URISyntaxException, IOException {

        Path path = Paths.get(Objects.requireNonNull(Main.class.getResource("/app.log")).toURI());

        List<LogEntry> logs = (LogFileReader.readLogs(path));

        for (line : logs) {

            run().start;

            List<LogEntry> errorLogs = logs.stream()
                    .filter(log -> "ERROR".equals(log.getLevel()))
                    .toList();
            System.out.println("Total ERROR in logs: " + errorLogs.size());
            errorLogs.forEach(System.out::println);
        }
    }
}
