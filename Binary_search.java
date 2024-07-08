import java.util.*;
public class Binary_search{
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        System.out.println("Enter Target Element: ");
        int target=Sc.nextInt();
        //process
        int idx=-1;
        boolean flag=false;
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+low+high-low)/2;
            if(arr[mid]==target){
                idx=mid;
                flag=true;
                break;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else low=mid+1;
        }
        if(flag==true)
            System.out.println(target+" found at index "+idx);
        else
            System.out.println(target+" not found");
    }
}
