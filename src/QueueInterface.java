public interface QueueInterface {
    void enqueue(String item);
    String dequeue();
    boolean isEmpty();
    int size();
    void displayAll();
}
