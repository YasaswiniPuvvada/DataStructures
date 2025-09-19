import ArrayList.MyArrayList;
import Stack.MyStack;

public class Implementation {
    public static void main(String[] args) {

        //MyStsack Implementation

        MyStack stack=new MyStack(4);
        System.out.println("Push Operation: ");
        System.out.println(stack.push(10));
        System.out.println(stack.push(20));
        System.out.println(stack.push(30));
        System.out.println(stack.push(40));
        System.out.println(stack.push(50));
        System.out.println("Pop Operation: ");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(99);
        stack.push(100);
        System.out.println("Search Operation: ");
        System.out.println(stack.search(50));
        System.out.println(stack.search(100));
        System.out.println(stack.search(20));
        System.out.println("Size of the Stack: ");
        System.out.println(stack.size());

        // MyArrayList Implementation

        MyArrayList list = new MyArrayList(10);
        System.out.println("Add Operation: ");
        System.out.println(list.add(100));
        System.out.println(list.add(120));
        System.out.println(list.add(140));
        System.out.println(list.add(160));
        System.out.println(list.add(180));
        System.out.println("Remove Operation: ");
        System.out.println(list.remove(120));
        System.out.println(list.remove(101));
        System.out.println(list.remove(140));
        list.add(200);
        list.add(250);
        list.add(432);
        System.out.println("Search Operation: ");
        System.out.println(list.search(112));
        System.out.println(list.search(160));
        System.out.println("Size of the ArrayList: ");
        System.out.println(list.size());
    }
}
