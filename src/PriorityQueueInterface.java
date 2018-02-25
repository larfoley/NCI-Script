public interface PriorityQueueInterface {
    void enqueue(String item, int priority);
    String dequeue();
    boolean isEmpty();
    int size();
    void displayAll();
}
