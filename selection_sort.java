import java.util.*;
public class selection_sort {
    public static void ss(int n, int[] arr){
        for(int i=0; i<n-1; i++){
            int min_i = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[min_i]){
                    min_i = j;
                }
            }
            int temp = arr[min_i];
            arr[min_i]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        ss(n, arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
