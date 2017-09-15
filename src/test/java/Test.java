import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by lukasz on 2017-09-14.
 */
public class Test {
    public static void main(String[] args) {
        Queue<String> kolejka = new ArrayDeque<>();
        kolejka.add ("1");
      kolejka.offer("9");
        kolejka.offer("8");
        kolejka.offer("7");
        kolejka.offer("6");
     /*   kolejka.add("5");
        kolejka.add("4");
        kolejka.add("3");
        kolejka.add("2");
        kolejka.add("1");   */
        for (String numebr : kolejka) {

            System.out.println(kolejka.peek());

        }
        System.out.println(kolejka.peek());

    }


}
