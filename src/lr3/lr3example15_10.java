package lr3;
import java.util.Arrays;
import java.util.Collections;

public class lr3example15_10 {

    public static void main(String[] args) {
        Integer arr[] = new Integer[20];
        for(int i = 0; i <  arr.length; i++) {
            arr[i] =  (int)(Math.random() * 1000);
            System.out.print(arr[i] + "  ");
        }
        System.out.print("\nSorted: \n");
        //Сортируем массив
        Arrays.sort(arr, Collections.reverseOrder());
        //Выводим отсортированный массив на консоль.
        for(int i = 0; i <  arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}