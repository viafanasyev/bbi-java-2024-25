import java.util.Arrays;

public class Sem05Task13 {
    public static void main(String[] args) {
        // Для проверки сгенерируем случайный массив
        // Math.random() генерирует случайный double на полуинтервале [0; 1)
        int length = (int) (Math.random() * 50);
        int[] array = new int[length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = (int) (Math.random() * 100) - 50;
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        mergeSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    /**
     * Сортировка всего массива
     */
    public static void mergeSort(int[] array) {
        mergeSort(array, 0, array.length);
    }

    /**
     * Сортировка массива на полуинтервале array[left; right)
     */
    public static void mergeSort(int[] array, int left, int right) {
        // Крайний случай - нужно посортировать всего 1 или 0 элементов
        if (right - left <= 1) {
            return;
        }

        // Разбиваем массив пополам и сортируем обе части рекурсивно
        int middle = (left + right) / 2;
        mergeSort(array, left, middle);
        mergeSort(array, middle, right);

        // Объединяем отсортированные части
        merge(array, left, middle, right);
    }

    /**
     * Слияние двух отсортированных подмассивов: array[left; middle) и array[middle; right)
     */
    public static void merge(int[] array, int left, int middle, int right) {
        // Результат помещаем в массив merged
        int[] merged = new int[right - left];
        int indexLeft = left;
        int indexRight = middle;
        int indexMerged = 0;
        while (indexLeft < middle || indexRight < right) {
            if (indexLeft == middle) { // В array[left; middle) больше нет элементов - берём элемент из array[middle; right)
                merged[indexMerged] = array[indexRight];
                ++indexRight;
                ++indexMerged;
            } else if (indexRight == right) { // В array[middle; right) больше нет элементов - берём элемент из array[left; middle)
                merged[indexMerged] = array[indexLeft];
                ++indexLeft;
                ++indexMerged;
            } else {
                // Берём минимальный элемент из обоих частей
                if (array[indexLeft] < array[indexRight]) {
                    merged[indexMerged] = array[indexLeft];
                    ++indexLeft;
                    ++indexMerged;
                } else {
                    merged[indexMerged] = array[indexRight];
                    ++indexRight;
                    ++indexMerged;
                }
            }
        }

        // Копируем результат объединения обратно в оригинальный массив
        for (int i = left; i < right; ++i) {
            array[i] = merged[i - left];
        }
    }
}
