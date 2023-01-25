public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        //task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int [] first = new int[3];
        for (int i = 0; i < first.length; i++) {
            first[i] = i+1;
            System.out.println(first[i]);
        }
        double [] second = {1.57, 7.654, 9.986};
        for (double v : second) {
            System.out.println(v);
            /*for (int i = 0; i < second.length; i++) {
            System.out.println(second[i]);*/
        }
        int [] third = new int[5];
        for (int i = 0; i < third.length; i++) {
            third[i] = i*3;
            System.out.println(third[i]);
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int [] first = new int[3];
        for (int i = 0; i < first.length; i++) {
            first[i] = i+1;
            System.out.print(first[i] + ", ");
        }
        System.out.println();
        double [] second = {1.57, 7.654, 9.986};
        for (int i = 0; i < second.length; i++) {
            System.out.print(second[i] + ", ");
        }
        System.out.println();
        int [] third = new int[5];
        for (int i = 0; i < third.length; i++) {
            third[i] = i*3;
            System.out.print(third[i] + ", ");
        }
    }
    public static void task3() {

    }
}