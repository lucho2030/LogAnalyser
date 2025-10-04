package org.example;

public class LogEntry {

    String date;
    String level;
    String message;

    public LogEntry(String date, String level, String message){
        this.date = "";
        this.level = "";
        this.message = "";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
