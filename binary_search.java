import java.util.*;
public class binary_search {
    public static void bs(int n, int[] arr, int x){
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int ans = 0;
        int low = 0; 
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                ans = mid;
                break;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.print(x + " is found at index:"+ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]  arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        bs(n, arr, x);
        sc.close();
    }
}
