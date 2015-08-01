import java.util.Arrays;
import java.util.List;

/**
 * Created by Catalin on 8/1/2015 .
 */
public class Exercise5 {

    public void printListFromThreadClassic1(List<Integer> words) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer word : words) {
                    System.out.println(word);
                }
            }
        }).start();
    }

    public void printListFromThreadClassic2(List<Integer> words) {
        new Thread() {
            @Override
            public void run() {
                for (Integer word : words) {
                    System.out.println(word);
                }
            }
        }.start();
    }

    public void printListFromThreadLambda(List<Integer> words) {
        new Thread(() -> words.forEach(System.out::println)).start();
    }

    public static void main(String[] args) {
        Exercise5 e = new Exercise5();
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        e.printListFromThreadClassic1(list);
        e.printListFromThreadClassic2(list);
        e.printListFromThreadLambda(list);
    }
}
