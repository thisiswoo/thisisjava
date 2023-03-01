package ch15.collection_framwork;

public class QueueMessage {
    public String command;
    public String to;

    public QueueMessage(String command, String to) {
        this.command = command;
        this.to = to;
    }
}
