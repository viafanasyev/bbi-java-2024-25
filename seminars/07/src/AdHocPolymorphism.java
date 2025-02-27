public class AdHocPolymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();

        overloadedMethod(parent); // Вызывается первый метод. Вывод: First
        overloadedMethod(child); // Вызывается второй метод. Вывод: Second

        methodWithParentType(parent); // Вызывается третий метод. Вывод: Third

        // Значения дочернего типа можно передавать в методы с параметрами родительского типа
        methodWithParentType(child);  // Вызывается третий метод. Вывод: Third

        Parent childAsParent = child;
        // При передаче объекта как параметра в метод (т.е. в форме method(object))
        //   вызываемый метод выбирается на основе объявленного типа ПЕРЕМЕННОЙ, а не реального типа объекта
        // childAsParent имеет тип Parent при определении
        overloadedMethod(childAsParent); // Вызывается первый метод. Вывод: First
    }

    private static void overloadedMethod(Parent parent) {
        System.out.println("First");
    }

    private static void overloadedMethod(Child child) {
        System.out.println("Second");
    }

    private static void methodWithParentType(Parent parent) {
        System.out.println("Third");
    }
}
