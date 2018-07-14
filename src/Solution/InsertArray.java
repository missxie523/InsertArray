package Solution;

import java.util.Arrays;

/* Given an array, and an element to insert, and the position to insert this element.
Return a new array with the element inserted.
 */
public class InsertArray {
    public static int[] insert(int[] array, int num, int position){
        int[] newArray = new int[array.length + 1];
        position = Math.min(array.length, position);
        for(int i = 0; i < position; i++){
            newArray[i] = array[i];
        }
        newArray[position] = num;
        for(int j = position; j < array.length; j++){
            newArray[j + 1] = array[j];
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] array = new int[] {1, 3, 5, 6, 9};
        int num = 5;
        int position = 4;
        System.out.println(Arrays.toString(insert(array, num, position)));
    }
}
/* Is it possible to write a version of this method that returns void and changes x in place?
No. Because array has fixed initialized length, so to add an element, you need to create a new array.
 */
