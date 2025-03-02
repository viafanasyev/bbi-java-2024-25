public class Sem06Task6 {
    public static void main(String[] args) {
        IntList list = new IntList();

        list.add(1);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(10);
        printList(list);

        list.remove(2);
        printList(list);

        list.removeLast();
        printList(list);

        list.add(100500);
        printList(list);
    }

    private static void printList(IntList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1) {
                System.out.print(' ');
            }
        }
        System.out.println();
    }
}
