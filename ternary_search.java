import java.util.*;
public class ternary_search {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter sorted elements:");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();
        int l=0, r=n-1;
        while(l<=r){
            int mid1=l+(r-l)/3;
            int mid2=r-(r-l)/3;
            if(arr[mid1]==key){
                System.out.println(mid1);
                break;
            }
            else if(arr[mid2]==key){
                System.out.println(mid2);
                break;
            }
            else if(arr[mid1]>key){
                r=mid1-1;
            }
            else if(arr[mid2]<key){
                l=mid2+1;
            }
            else{
                l=mid1+1;
                r=mid2-1;
            }
        }
        sc.close();
    }
}
