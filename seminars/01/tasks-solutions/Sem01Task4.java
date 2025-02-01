public class Sem01Task4 {
    public static void main(String[] args) {
        byte secondsInMinute = 60;
        short secondsInHour = 60 * 60;
        int secondsInDay = 24 * 60 * 60;
        int secondsInYear = 365 * 24 * 60 * 60;
        long secondsInCentury = 100L * 365 * 24 * 60 * 60; // Не учитываем високосные года ради простоты

        System.out.println(secondsInMinute);
        System.out.println(secondsInHour);
        System.out.println(secondsInDay);
        System.out.println(secondsInYear);
        System.out.println(secondsInCentury);
    }
}
