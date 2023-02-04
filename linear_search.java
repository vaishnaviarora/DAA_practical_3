import java.util.*;
public class linear_search{
    public static int ls(int n, int[] arr, int x){
        int ans=-1;
        for(int i=0; i<n; i++){
            if(arr[i]==x){
                ans=i;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.print(x + " is found at index:");
        System.out.print(ls(n,arr,x));
        sc.close();
    }
}