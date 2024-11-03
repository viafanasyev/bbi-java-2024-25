## План семинара №1

1. Установка JDK 21.
    * В зависимости от ОС:
        * Windows: При помощи [установщика](https://www.oracle.com/java/technologies/downloads/#java21) (x64 Installer).
        * Linux (Debian-based): `sudo apt install openjdk-21-jdk` в терминале.
        * Linux (non-Debian-based): Либо из пакетного менеджера, либо из [tarball](https://www.oracle.com/java/technologies/downloads/#java21). После установки проверьте, что Java добавилась в `PATH`.
        * MacOS (с использованием [Brew](https://brew.sh/)): `brew install openjdk@21` в терминале.
    * После установки удостоверьтесь, что при вводе `java --version` в терминале/командной строке/Powershell выводится версия 21.
2. Установка IntelliJ IDEA.
    * [Ссылка на скачивание](https://www.jetbrains.com/ru-ru/idea/download/). Устанавливать **Community** Edition.
      * Если вдруг вы получаете ошибку 451 при загрузке, то вместо ссылки вида `https://download.jetbrains.com/...` используйте `https://download-cdn.jetbrains.com/...` (т.е. добавьте `-cdn` после `download`)
3. Создание первого проекта в IDEA. Разбираемся с его структурой.
4. Пишем "Hello, World!".
5. Запускаем программу через IDEA.
6. Компиляция программы через утилиту `javac`. Запуск при помощи утилиты `java`.
7. Выходные файлы и их формат.
    * Опционально: используем утилиту `javap` или `Show Bytecode` в IDEA для просмотра `class`-файлов.
