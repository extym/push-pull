import java.util.Random;

public class HomeWorkSecond {

    public static void main(String[] args) {
        // объявляем массив целых чисел
        int[] anArray = new int[10];

        Random rand = new Random();
        for (int i = 0; i < anArray.length; i++) {

            anArray[i] = rand.nextInt(100);

            System.out.print(anArray[i] + " ");
        }
        // Нахождение среди элементов массива наименьшего
        int min = anArray[0];

        for (int i = 1; i < anArray.length; i++) {
            if (anArray[i] < min) min = anArray[i];
        }
        System.out.println("Наименьший элемент: " + min);
        // Найти количество меньше 25
        int s = 0;//для количества цифр более 25

        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] > 25) {
                s = s + 1;
            }
        }

        //System.out.println(anArray[i]);
        System.out.println("Количество цифр  больше 25 = " + s);

    }
}

