package pl.javastart;

/**
 * Created by Rysiek on 2017-02-11.
 */
public class BubbleSort {

    public int[] sort(int[] ints) {

        if (ints.length < 2) {
            return ints;
        } else {
            int counter = ints.length;
            while (!isOrdered(ints)) {
                for (int i = 0; i < counter - 1; i++) {
                    if (ints[i] > ints[i + 1]) {
                        int temp = ints[i];
                        ints[i] = ints[i + 1];
                        ints[i + 1] = temp;
                    }
                }
                counter--;
            }
            return ints;
        }
    }

    public boolean isOrdered(int [] ints) {
        boolean result = false;
        for (int i = 0; i < ints.length-1; i++) {
            if (ints[i] <= ints[i+1]){
              result = true;
            } else {
                result = false;
                break;
            }
        } return result;
    }
}
