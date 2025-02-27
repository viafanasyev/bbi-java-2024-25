public class SubtypePolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        parent.doSomething(); // Вызывается метод в классе Parent. Вывод: Parent
        child.doSomething(); // Вызывается метод в классе Child. Вывод: Child

        Parent childAsParent = child;
        // При вызове метода на объекте (т.е. в форме object.method(...))
        //   вызывается метод из РЕАЛЬНОГО типа объекта, а не объявленного типа переменной
        // childAsParent будет иметь тип Child при выполнении
        childAsParent.doSomething(); // Вызывается метод в классе Child. Вывод: Child
    }
}
