import java.util.Arrays;

public class App {

    public static int solution(int[] A) {
         int N = A.length;
        int result = 1;
        Arrays.sort(A);
        for(int i = 0; i < N; i++) {
            if(A[i] == result) {
                result++;
            }
        }
        return result; // return the sorted array    
    }
   
    public static void main(String[] args) throws Exception {
        int[] arr = {4, 3, 2}; // create an array of integers
        System.out.println(solution(arr)); // call the solution method with the array
    }
}
