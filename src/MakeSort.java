
import java.util.Random;
import java.util.Arrays;

public class MakeSort {

    public static void main(String[] args) {
        int[] anArray = new int[10];
        int temp;
        Random rand = new Random();
        for (int i = 0; i < anArray.length; i++) {

            anArray[i] = rand.nextInt(100);


            System.out.print(anArray[i] + " ");
        }
        boolean isSorted = false;
        //int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < anArray.length-1; i++) {
                if(anArray[i] < anArray[i+1]){
                    isSorted = false;

                    temp = anArray[i];
                    anArray[i] = anArray[i+1];
                    anArray[i+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(anArray));
    }
}
