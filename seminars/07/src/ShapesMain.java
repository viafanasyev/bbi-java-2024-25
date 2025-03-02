public class ShapesMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4);
        shapes[1] = new Circle(1);
        shapes[2] = new Rectangle(1, 1);
        shapes[3] = new Rectangle(2, 3);
        shapes[4] = new Rectangle(7, 5);
        System.out.println(totalPerimeter(shapes));
    }

    // Метод totalPerimeter абстрагируется от того, какие фигуры существуют в программе
    // При добавлении новых фигур (наследников Shape) данный метод менять не придётся
    // Разделение кода, который взаимодействует с абстракциями, и конкретных реализаций - преимущество динамического полиморфизма
    public static double totalPerimeter(Shape[] shapes) {
        double result = 0;
        for (int i = 0; i < shapes.length; i++) {
            result += shapes[i].perimeter();
        }
        return result;
    }
}
