## Задания к семинару №7

**Замечание 1**: во всех нижеприведённых заданиях некорректные данные должны обрабатываться.

**Замечание 2**: ввод/вывод любых данных должен сопровождаться "приглашением"/пояснением (к примеру, "Введите радиус окружности: ").

**Замечание 3**: соблюдение во всех заданиях принципа инкапсуляции обязательно. Только необходимые члены класса должны быть публичными. Не должно быть возможности нарушить соласованность внутреннего состояния объекта.

1. Реализуйте класс комплексных чисел. Определите в классе:
   * Конструктор, принимающий действительную и мнимую часть (как числа типа `double`).
   * Методы `getRealPart` и `getImaginaryPart`, возвращающие действительную и мнимую часть соответственно.
   * Методы для сложения, вычитания, умножения и деления на другое число. Данные методы не должны менять сами числа, а возвращать новый объект с новыми значениями полей.
2. Реализуйте класс `Part` - деталь. О детали известно её название и производитель. \
   Реализуйте класс `Engine` - двигатель. Переиспользуйте класс `Part`. О двигателе известна его мощность, название и производитель. \
   Реализуйте класс `Car` - автомобиль. Переиспользуйте классы `Engine` и `Part`. О автомобиле известна мощность (как мощность двигателя), производитель и название. \
   Подумайте, в каких отношениях должны находиться классы и почему.
3. Реализуйте класс `Employee`. О сотруднике известно его имя и фиксированная зарплата. \
   Отнаследуйте от класса `Employee` класс `BonusedEmployee`. Для сотрудников такого типа оплата труда вычисляется как фиксированная зарплата, умноженная на бонус (в процентах). Должна быть возможность увеличивать и понижать бонус данных сотрудников. \
   Релизуйте метод, принимающий массив сотрудников, вычисляющий суммарную оплату труда для всех сотрудников. \
   Релизуйте метод, принимающий массив сотрудников, и увеличивающий их бонус на 10%.
4. Реализуйте класс `Point2D`, описывающий точку на плоскости. \
   Используя данный класс реализуйте класс `Circle`, описывающий окружность (как точку центра и радиус). У окружности реализуйте метод, проверяющий, пересекаются ли две окружности, а также методы, вычисляющие периметр и площадь. \
   Реализуйте класс `Point3D`, описывающий точку в трёхмерном пространстве. \
   Определите, в каких отношениях находятся классы `Point2D` и `Point3D`. Убедитесь, что это отношение не нарушает логику методов класса `Circle`.
5. Используя класс `Circle` из прошлого задания реализуйте класс `Cylinder` для описания цилиндра. \
   Определите, в каких отношениях находятся классы `Circle` и `Cylinder`. Убедитесь, что это отношение не нарушает логику методов обоих классов.
6. Реализуйте набор классов, позволяющий описывать такие геометрические фигуры как окружность, треугольник, квадрат, прямоугольник и эллипс. \
   Для каждой фигуры должна быть возможность поменять её свойства (например, радиус у окружности), а также вычислить её площадь.
7. Реализуйте класс `Time`, хранящий время в рамках одних суток (секунды, минуты и часы). См. задание №4 с прошлого семинара. \
   Реализуйте класс `Date`, хранящий дату (день, месяц и год). Реализуйте следующие методы: изменение дня, месяца и года; проверка, является ли год високосным; возвращающий день недели. \
   Реализуйте класс `DateTime`, хранящий дату и время. Для этого переиспользуйте классы `Time` и `Date`.
8. Реализуйте класс `Person`. У каждой персоны есть имя и email (устанавливаются единожды). \
   Реализуйте класс `Course`. Каждый курс имеет название (устанавливается единожды). \
   Реализуйте класс `Student`, отнаследовав его от класса `Person`. У студентов есть курсы, которые они посещают, и оценки за эти курсы. Реализуйте методы, позволяющие манипулировать курсами и оценками. \
   Реализуйте класс `Teacher`, отнаследовав его от класса `Person`. У преподавателей есть курсы, которые они ведут. Реализуйте методы, позволяющие манипулировать курсами.