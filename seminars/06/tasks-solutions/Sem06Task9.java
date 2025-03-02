import java.util.Arrays;

public class Sem06Task9 {
    public static void main(String[] args) {
        Book solaris = new Book("978-5-17-083899-8", "Солярис", "Лем Станислав");

        Library libraryFromDuplicatesAndNulls = new Library(new Book[] {
                solaris,
                solaris,
                null,
                null,
                solaris,
                null,
                new Book("978-5-17-083899-8", "Солярис", "Лем Станислав") // Другой экземпляр той же книги. Не дубликат!
        });
        System.out.println("Размер библиотеки с дубликатами: " + libraryFromDuplicatesAndNulls.size());

        Book[] books = new Book[] {
                solaris,
                new Book("978-5-17-090334-4", "Понедельник начинается в субботу", "Стругацкие Аркадий и Борис"),
                new Book("978-5-04-089112-2", "Задача трёх тел", "Лю Цысинь")
        };
        Library library = new Library(books);

        System.out.println("Размер библиотеки: " + library.size());

        books[0] = null;
        books[1] = null;
        books[2] = null;
        System.out.println("Книги библиотеки после замены книг на null в исходном массиве: " + Arrays.toString(library.getBooks()));

        books = library.getBooks();
        books[0] = null;
        books[1] = null;
        books[2] = null;
        System.out.println("Книги библиотеки после замены книг на null в массиве getBooks(): " + Arrays.toString(library.getBooks()));

        library.add(solaris);
        System.out.println("Размер библиотеки после добавление дубликата: " + library.size());

        library.add(new Book("978-5-17-083899-8", "Солярис", "Лем Станислав")); // Другой экземпляр той же книги. Не дубликат!
        System.out.println("Размер библиотеки после добавление нового экземпляра: " + library.size());

        System.out.println("Книги на букву П: " + Arrays.toString(library.findByFirstLetterOfTitle('П')));
        System.out.println("Книги на букву С: " + Arrays.toString(library.findByFirstLetterOfTitle('С')));
        System.out.println("Книги на букву Ы: " + Arrays.toString(library.findByFirstLetterOfTitle('Ы')));

        System.out.println("Книги с автором на букву Л: " + Arrays.toString(library.findByFirstLetterOfAuthorName('Л')));
        System.out.println("Книги с автором на букву С: " + Arrays.toString(library.findByFirstLetterOfAuthorName('С')));
        System.out.println("Книги с автором на букву Я: " + Arrays.toString(library.findByFirstLetterOfAuthorName('Я')));

        System.out.println("Книги с ISBN 978-5-17-083899-8: " + Arrays.toString(library.findByISBN("978-5-17-083899-8")));
        System.out.println("Книги с ISBN 123-456: " + Arrays.toString(library.findByISBN("123-456")));

        Book checkOut1 = library.checkOutBook(solaris);
        System.out.println("Выписанная книга: " + checkOut1);

        Book checkOut2 = library.checkOutBook(solaris);
        System.out.println("Выписанная повторно книга: " + checkOut2);

        System.out.println("Результат возврата выписанной книги: " + library.returnBook(solaris));
        System.out.println("Результат возврата не выписанной книги: " + library.returnBook(solaris));

        library.removeBook(solaris);
        System.out.println("Размер библиотеки после удаления существующей книги: " + library.size());

        library.removeBook(solaris);
        System.out.println("Размер библиотеки после удаления отсутствующей книги: " + library.size());

        Library emptyLibrary = new Library();
        System.out.println("Размер пустой библиотеки: " + emptyLibrary.size());
    }
}
