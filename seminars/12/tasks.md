## Задания к семинару №12

1. Используя метод `Integer.parseInt` реализуйте метод, переводящий строку в число типа `int`. Если строка не является числом, то метод должен возвращать 0. \
   Примечание: метод `Integer.parseInt` бросает исключение типа `NumberFormatException`, если строка не является числом типа `int`.
2. Реализуйте метод `factorial`, вычисляющий факториал целого числа. Если в метод передано отрицательное число, бросьте исключение типа `IllegalArgumentException` с подробным сообщением.
3. Возьмите классы `IntStack`, `IntQueue`, `IntList` с одного из предыдущих семинаров. \
   Добавьте в их методы проверки ошибок, например, выход за границы списка. \
   В случае, если передан некорректный аргумент, бросьте исключение типа `IllegalArgumentException`, а в иных ошибочных случаях - `IllegalStateException`. \
   Исключения должны иметь подробные сообщения об ошибке.
4. Вместо `IllegalArgumentException` и `IllegalStateException` из предыдущего задания создайте свои типы исключений, наследующиеся от `RuntimeException`.
5. Исключения из предыдущего задания отнаследуйте от `Exception`. Предварительно подумайте, что после этого изменится в коде и почему.
6. Реализуйте класс `GeometricProgression`. Прогрессия задаётся первым членом и знаменателем. В классе должен быть метод, возвращающий N-й член прогрессии. \
   В конструкторах и методах данного класса проверьте корректность аргументов и бросьте исключение в случае ошибки. \
   В методе `main` в бесконечном цикле считывайте с клавиатуры параметры геометрических прогрессий и число N, и выводите N-й член прогрессии. \
   Обрабатывайте ошибки при помощи `try-catch` и выводите сообщения пользователю, но не завершайте программу.