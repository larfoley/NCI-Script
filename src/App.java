public class App {
    public static void main(String[] args) {

        MyPriorityQue que = new MyPriorityQue();

        que.enqueue("foo", 3);
        que.enqueue("bar", 2);
        que.enqueue("car", 5);
        que.enqueue("far", 8);
        que.enqueue("dar", 1);
        que.enqueue("x", 4);

        System.out.println(que.dequeue());


    }
}
