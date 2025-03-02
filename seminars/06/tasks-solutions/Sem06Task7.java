public class Sem06Task7 {
    public static void main(String[] args) {
        IntStack stack = new IntStack();

        stack.push(1);
        stack.push(4);
        stack.push(5);
        stack.push(3);
        stack.push(-1);
        System.out.println("Size: " + stack.size());

        System.out.println("Top: " + stack.top());

        stack.pop();
        System.out.println("Size: " + stack.size());

        System.out.println("Pop: " + stack.pop());
        System.out.println("Size: " + stack.size());

        stack.push(100500);

        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());

        System.out.println("Size: " + stack.size());
    }
}
