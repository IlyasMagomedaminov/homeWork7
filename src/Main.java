import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1(){
        System.out.println("Задача 1.");

        int[] fox = new int[3];
        fox[0] = 1;
        fox[1] = 2;
        fox[2] = 3;

        System.out.println(fox[1]);

        double[] cat = new double[]{1.57, 7.654, 9.986};

        System.out.println(cat[2]);

        String[] dog = new String[]{"hello","world","how","are","you"};

        System.out.println(dog[3]+"\n");
    }
    public static void task2(){
        System.out.println("Задача 2");

        int[] fox = new int[]{1,2,3};
        double[] cat = new double[]{1.57, 7.654, 9.986};
        String[] dog = new String[]{"hello","world","how","are","you"};

        System.out.println(Arrays.toString(fox));

        System.out.println(Arrays.toString(cat));

        System.out.println(Arrays.toString(dog));

        System.out.println();
    }
    public static void task3(){
        System.out.println("Задача 3");

        int[] fox = new int[]{1,2,3};
        double[] cat = new double[]{1.57, 7.654, 9.986};
        String[] dog = new String[]{"hello","world","how","are","you"};

        for (int i = fox.length - 1;i >= 0;i--){
            System.out.print(fox[i] + ", ");
        }
        System.out.println();
        for (int i = fox.length - 1;i >= 0;i--){
            System.out.print(cat[i] + ", ");
        }
        System.out.println();
        for (int i = fox.length - 1;i >= 0;i--) {
            System.out.print(dog[i] + ", ");
        }
        System.out.println("\n");
    }
    public static void task4(){
        System.out.println("Задача 4");

        int[] fox = new int[]{1,2,3,4,5,6,7};

        for (int i = 0;i < fox.length;i++){
            if (fox[i] % 2 == 0){
                System.out.print(fox[i] + ",");
            }else{
                System.out.print(fox[i] + 1 + ",");
            }
        }
    }
}