package LinkCode.P101_200;

/**
 * Created by 18394 on 2017/2/17.
 */
public class S172_RemoveElement {
    /**
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     */
    //这好像要求必须在A中做改变
    public static int removeElement(int[] A, int elem) {
        int length = A.length, eleNumber = 0;
        for (int i = 0; i < length; i++){
            if (A[i] == elem){
                eleNumber++;
            }
        }
        int[] result = new int[length - eleNumber];
        int index = 0;
        for (int i = 0; i < length; i++){
            if (A[i] != elem){
                result[index++] = A[i];
                System.out.print(A[i]);
            }
        }
        return result.length;
    }

    public static int removeElement2(int[] A, int elem) {
       int count = A.length;
       int i = 0;
       while (i < count){
           if (A[i] == elem){
               for (int j = i ; j < count-1; j++){
                   A[j] = A[j+1];
               }
               count--;
           } else {
               i++;
           }
       }
       return count;
    }

    public static void main(String[] args){
        int [] A = {0, 4, 4,0,4,4,4,0,2};
        System.out.print(removeElement2(A, 2));
    }
}
