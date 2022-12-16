import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task1() {
        System.out.println("Задача 1-2");
        int[] apples = new int [3];
        apples[0] = 1;
        apples[1] = 2;
        apples[2] = 3;
        double[] bananas = {1.57, 7.654, 9.986};
        int[] potatas =  {2, 3, 4, 5,12, 3, 4,};
        for (int i = 0; i < apples.length; i++) {
            System.out.print(apples[i]);
            if (i != apples.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < potatas.length; i++) {
            System.out.print(potatas[i]);
            if (i != potatas.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < bananas.length; i++) {
            System.out.print(bananas[i]);
            if (i != bananas.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        }

    public static void task2() {
        System.out.println("Задача 4");
        int[] arr =  {1,2,3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0){
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}