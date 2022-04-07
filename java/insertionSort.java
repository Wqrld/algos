public class Main {

    public static void main(String[] args){

        System.out.println("aye!");
        int[] arone = {8,5,7,3,1,4,10,3,4,5,3,1,5};

        for(int i  = 1; i < arone.length; i++ ){
            int key = arone[i]; // the current key that we are filling in

            int j = i; // make a copy of i so we can use that to loop our subarray
            while(j > 0 && key < arone[j - 1]){ // loop every item in the array until we find an element smaller than key, or until we hit the first element

                arone[j] = arone[j - 1]; // move item at j-1 one to the right
                j--; // check the next  one

            }
            arone[j] = key; // key >= element at j-1, so put it right after that j-1

        }

        // Print our sorted array
        for(int x : arone){
            System.out.print(x + " ");
        }

    }


}
