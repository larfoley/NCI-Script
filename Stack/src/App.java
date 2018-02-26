public class App {
    public static void main(String args[]) {
        Stack stack = new Stack();

        stack.push(new Item("a"));
        System.out.println(stack.toString());

        stack.push(new Item("b"));
        System.out.println(stack.toString());

        stack.push(new Item("c"));
        System.out.println(stack.toString());

        stack.pop();
        System.out.println(stack.toString());
    }
}
