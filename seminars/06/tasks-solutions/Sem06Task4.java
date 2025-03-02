public class Sem06Task4 {
    public static void main(String[] args) {
        TimeOfDay example1 = new TimeOfDay(1234567);
        System.out.println(example1.to24HourString());
        System.out.println(example1.to12HourString());

        TimeOfDay example2 = new TimeOfDay(-1);
        System.out.println(example2.to24HourString());
        System.out.println(example2.to12HourString());

        TimeOfDay example3 = new TimeOfDay(23, 59, 59);
        System.out.println(example3.to24HourString());
        System.out.println(example3.to12HourString());

        System.out.println(example1.equals(example2));
        System.out.println(example3.equals(example2));

        example1.changeSeconds(-1234567);
        example1.changeHours(23);
        example1.changeMinutes(59);
        example1.changeSeconds(59);
        System.out.println(example1.to24HourString());
        System.out.println(example1.to12HourString());

        System.out.println(example1.getHours());
        System.out.println(example1.getMinutes());
        System.out.println(example1.getSeconds());
    }
}
