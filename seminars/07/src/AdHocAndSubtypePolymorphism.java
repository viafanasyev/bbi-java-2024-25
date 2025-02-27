public class AdHocAndSubtypePolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        overloadedMethod(parent); // Вызывается первый метод. Вывод: First Parent Parent
        overloadedMethod(child); // Вызывается второй метод. Вывод: Second Child

        Parent childAsParent = child;
        // Выбор из перегруженных методов проводится на основе типа ПЕРЕМЕННОЙ
        //    -> выбирается первый метод
        // Вызов `parent.doSomething()` вызывает метод на РЕАЛЬНОМ типе объекта
        //    -> вызывается метод из класса Child
        overloadedMethod(childAsParent); // Вывод: First Child Child
    }

    private static void overloadedMethod(Parent parent) {
        System.out.println("First");
        parent.doSomething();
        parent.doSomething();
    }

    private static void overloadedMethod(Child child) {
        System.out.println("Second");
        child.doSomething();
    }
}
