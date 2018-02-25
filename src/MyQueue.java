import java.util.ArrayList;
import java.util.Iterator;

public class MyQueue implements QueueInterface {
    private ArrayList<String> que;

    public MyQueue() {
        que = new ArrayList();
    }

    @Override
    public void enqueue(String item) {
        que.add(0, item);
    }

    @Override
    public String dequeue() {
        return que.remove((que.size() - 1));
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void displayAll() {
        Iterator it = this.que.iterator();
        String que = "";
        while (it.hasNext()) {
            que += it.next() + " ";
        }
        System.out.println(que);
    }
}
