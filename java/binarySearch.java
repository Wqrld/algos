import java.util.Arrays;

public class main {

    public static boolean binarySearch(int[] array, int lookFor){
        while(true){
            int middle = (int) Math.floor(array.length / 2);

            // Base case
            if(array.length == 1 && array[0] != lookFor){
                        return false;
            }

            if(array[middle] > lookFor){
                //left
                array = Arrays.copyOfRange(array, 0, middle);
            }else if(array[middle] < lookFor){
                //right
                array = Arrays.copyOfRange(array, middle + 1, array.length);
            }else if(array[middle] == lookFor){
                return true;
            }

        }
    }

    public static void main(String[] args){
        int[] array = {0, 2, 3, 8, 9, 15, 100, 101};

        boolean found = binarySearch(array, 101);
        System.out.println(found);

    }

}
