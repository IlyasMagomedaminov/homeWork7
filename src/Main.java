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

        double[] cat = {1.57, 7.654, 9.986};

        System.out.println(cat[2]);

        String[] dog = {"hello","world","how","are","you"};

        System.out.println(dog[3]+"\n");
    }
    public static void task2(){
        System.out.println("Задача 2");

        int[] fox = new int[]{1,2,3};
        double[] cat = new double[]{1.57, 7.654, 9.986};
        String[] dog = new String[]{"hello","world","how","are","you"};

        for (int i = 0;i < fox.length;i++){
            System.out.print(fox[i]);
            if (i != fox.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0;i < cat.length;i++){
            System.out.print(cat[i]);
            if (i != cat.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0;i < dog.length;i++){
            System.out.print(dog[i]);
            if (i != dog.length - 1){
                System.out.print(",");
            }
        }
        System.out.println("\n");
    }
    public static void task3(){
        System.out.println("Задача 3");

        int[] fox ={1,2,3};
        double[] cat ={1.57, 7.654, 9.986};
        String[] dog ={"hello","world","how","are","you"};

        for (int i = fox.length - 1;i >= 0;i--){
            System.out.print(fox[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = cat.length - 1;i >= 0;i--){
            System.out.print(cat[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = dog.length - 1;i >= 0;i--) {
            System.out.print(dog[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println("\n");
    }
    public static void task4(){
        System.out.println("Задача 4");

        int[] fox ={1,2,3,4,5,6,7};

        for (int i = 0;i < fox.length;i++){
            if (fox[i] % 2 == 0){
                System.out.print(fox[i]);
            }else{
                System.out.print(fox[i] + 1);
            }
            if (i != fox.length -1){
                System.out.print(",");
            }
        }
    }
}