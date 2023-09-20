package pooact10;

// @author Haze
import java.util.Arrays;

public class POOAct10 {

    public static void main(String[] args) {
        double arrA[] = new double[50];
        double arrB[] = new double[20];

        for (int i = 0; i < 50; i++) {
            arrA[i] = Math.random() * 100;
        }

        System.out.println(Arrays.toString(arrA));

        Arrays.sort(arrA);

        System.arraycopy(arrA, 0, arrB, 0, 10);

        Arrays.fill(arrB, 10, 20, 0.5);

        System.out.println(Arrays.toString(arrA));
        System.out.println(Arrays.toString(arrB));

    }

}
