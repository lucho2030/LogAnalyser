package org.example;

public class LogEntry {

    String date;
    String level;
    String message;

    public LogEntry(String date, String level, String message) {
        this.date = date;
        this.level = level;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "[" + date + "] " + level + " - " + message ;
    }

}
