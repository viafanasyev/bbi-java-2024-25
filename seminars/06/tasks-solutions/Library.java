import java.util.Arrays;

public class Library {
    private Book[] books;
    private boolean[] isCheckedOut;
    private int size;

    public Library() {
        books = new Book[1];
        isCheckedOut = new boolean[1];
        size = 0;
    }

    public Library(Book[] books) {
        this(); // Вызываем конструктор выше, чтобы инициализировать значения полей
        for (int i = 0; i < books.length; i++) {
            // Добавляем все книги вручную, а не сохраняем ссылку
            // Иначе можно будет нарушить инкапсуляцию данного класса, подменив элемент массива
            // Также это помогает исключить null-элементы и дубликаты (см. ниже)
            add(books[i]);
        }
    }

    public void add(Book book) {
        if (book == null || isPresent(book)) { // Не допускаем null и дубликатов в массиве
            return;
        }
        if (size == books.length) {
            enlarge();
        }
        books[size] = book;
        ++size;
    }

    private void enlarge() {
        // Создаём массив, который вдвое больше текущего, и копируем в него значения старого
        books = Arrays.copyOf(books, books.length * 2);
        isCheckedOut = Arrays.copyOf(isCheckedOut, books.length);
    }

    public int size() {
        return size;
    }

    public Book[] getBooks() {
        // Возвращаем копию!, а не ссылку на массив
        // Иначе можно будет нарушить инкапсуляцию данного класса, подменив элемент массива
        return Arrays.copyOf(books, size);
    }

    public void removeBook(Book book) {
        int index = indexOf(book);
        if (index == -1) {
            return;
        }
        // Смещаем все элементы начиная с index+1 влево на один элемент
        for (int i = index + 1; i < size; i++) {
            books[i - 1] = books[i];
            isCheckedOut[i - 1] = isCheckedOut[i];
        }
        --size;
    }

    public Book[] findByISBN(String isbn) {
        Book[] result = new Book[size];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                result[resultSize] = books[i];
                ++resultSize;
            }
        }
        return Arrays.copyOf(result, resultSize); // Сжимаем массив до нужного размера
    }

    public Book[] findByFirstLetterOfTitle(char firstLetter) {
        Book[] result = new Book[size];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getTitle().charAt(0) == firstLetter) {
                result[resultSize] = books[i];
                ++resultSize;
            }
        }
        return Arrays.copyOf(result, resultSize); // Сжимаем массив до нужного размера
    }

    public Book[] findByFirstLetterOfAuthorName(char firstLetter) {
        Book[] result = new Book[size];
        int resultSize = 0;
        for (int i = 0; i < size; i++) {
            if (books[i].getAuthor().charAt(0) == firstLetter) {
                result[resultSize] = books[i];
                ++resultSize;
            }
        }
        return Arrays.copyOf(result, resultSize); // Сжимаем массив до нужного размера
    }

    // Выписывает книгу из библиотеки
    // Возвращает книгу в случае успеха, иначе null
    public Book checkOutBook(Book book) {
        int index = indexOf(book);
        if (index == -1) {
            return null;
        }
        if (isCheckedOut[index]) {
            return null;
        }
        isCheckedOut[index] = true;
        return books[index];
    }

    // Возвращает книгу в библиотеку
    // Возвращает true в случае успеха, иначе false
    public boolean returnBook(Book book) {
        int index = indexOf(book);
        if (index == -1) {
            return false;
        }
        if (!isCheckedOut[index]) {
            return false;
        }
        isCheckedOut[index] = false;
        return true;
    }

    private boolean isPresent(Book book) {
        return indexOf(book) != -1;
    }

    // Вспомогательный метод, ищущий индекс книги в массиве books
    // Если такой книги нет, возвращает -1
    private int indexOf(Book book) {
        for (int i = 0; i < size; ++i) {
            // Сравниваем ссылки, а не ISBN (или какой-то другой идентификатор)
            // Таким образом мы допускаем в библиотеке разные копии одной и той же книги
            if (books[i] == book) {
                return i;
            }
        }
        return -1;
    }
}
