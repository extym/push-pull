
import java.util.Random;

public class HomeWorkDoubleArray {

    public static void main(String[] args) {
        int duArray[][] = new int[10][10];

        Random rand = new Random();
        for (int i = 0; i < duArray.length; i++) {
            for (int j = 0; j < duArray[i].length; j++) {
                duArray[i][j] = rand.nextInt(100);
            }

        }


        for (int i = 0; i < duArray.length; i++, System.out.println()) {
            for (int j = 0; j < duArray[i].length; j++) {
                System.out.print(duArray[i][j] + " ");
            }
        }
    }
}