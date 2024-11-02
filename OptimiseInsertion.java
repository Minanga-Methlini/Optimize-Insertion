/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package optimiseinsertion;

import java.util.Arrays;

/**
 *
 * @author Minanga Methlini
 */
public class OptimiseInsertion {

    static Integer[] array = {21, 16, 13, 9, 6};
    static int outerIndex;
    static int temp;

    
   public static int shift(int startIndex){
        //method
        temp = array[startIndex];
        int i = startIndex;
        
        for (; i > 0 && array[i - 1] > temp; i--){
            array[i] = array[i - 1];
            
            System.out.println(
                     "i = "
                    +outerIndex
                    + "; j = "
                    + (outerIndex - i + 1) 
                    + "; "
                    +Arrays.deepToString(array));
            
           
        }
        return i;
   }

   
    public static void insert(int endIndex){
    // method
        int position = shift (endIndex);
        array [position] = temp;
        System.out.println(
                        "After 1 = "
                         + outerIndex
                         + ";"
                         + Arrays.deepToString(array));
        }
    

public static void insertionSort(){
    //method
        for (outerIndex = 1; outerIndex < array.length; outerIndex++){
            insert(outerIndex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         System.out.println("Array befpre sorting:" + Arrays.deepToString(array));
        
        insertionSort();
        
        System.out.println("Array after sorting:" + Arrays.deepToString(array));
    }
    
}
