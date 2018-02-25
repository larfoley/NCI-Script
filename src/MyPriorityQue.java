import java.util.ArrayList;
import java.util.Iterator;

public class MyPriorityQue implements PriorityQueueInterface {

    private int highestPriority;
    private ArrayList<String> que;

    public MyPriorityQue() {
        highestPriority = 0;
        que = new ArrayList<String>();
    }

    @Override
    public void enqueue(String item, int priority) {

        if (priority > highestPriority) {

            highestPriority = priority;

            if (!que.isEmpty()) {
                que.add(item);
            } else {
                que.add(0,item);
            }

        } else {
            que.add(0, item);
        }

        this.displayAll();

    }

    @Override
    public String dequeue() {
        return que.remove((que.size() - 1));
    }

    @Override
    public boolean isEmpty() {
        return que.size() == 0;
    }

    @Override
    public int size() {
        return que.size();
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
