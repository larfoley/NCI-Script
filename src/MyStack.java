import java.util.ArrayList;
import java.util.Iterator;

// Stack Data Structure:
// ========================
// Last one in first out


public class MyStack implements StackInterface {
    private ArrayList<String> items;

    public MyStack() {
        items = new ArrayList();
    }

    public void push(String item) {
        items.add(item);
    }

    public String pop() {
        return items.remove((items.size() - 1));
    }

    public boolean isEmpty() {
        return this.items.size() == 0;
    }


    public void displayAll() {
        Iterator iterator = this.items.iterator();
        String itemsString = "";

        while (iterator.hasNext()) {
            itemsString += iterator.next() + " \n";
        }
        System.out.println(itemsString);
    }
}
