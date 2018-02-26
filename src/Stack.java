import java.util.ArrayList;

public class Stack implements StackInterface {
    private ArrayList<Item> stack;

    public Stack() {
        stack = new ArrayList<Item>();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
        System.out.println("Pushed item to stack.");
    }

    @Override
    public Item pop() {
        System.out.println("Removed item from stack.");
        return stack.remove(stack.size() - 1);
    }

    @Override
    public String toString() {

        String stackString = "Stack => [";

        for (int i = 0; i < stack.size(); i++) {
            stackString += stack.get(i).getName();
            if (i != stack.size() - 1) {
                stackString += ", ";
            }
        }
        stackString += "]";

        return stackString;
    }
}
