import java.util.*;
public class Binary_search_optimised {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.print("Enter size of the Array: ");
        int n=Sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the Array: ");
        for(int i=0;i<n;i++)
            arr[i]=Sc.nextInt();
        Arrays.sort(arr);
        System.out.print("Enter element to be searched: ");
        int target=Sc.nextInt();
        int low=0,high=n-1;
        if(arr[low]>target || arr[high]<target)
            System.out.println(target+" is not there in the Array");
        else{
            boolean flag=false;
            while(low<=high){
                //as mid=(low+high)/2,just add and subtract low on numerator of rhs
                int mid=(high-low+low+low)/2;
                if(arr[mid]==target){
                    flag=true;
                    break;
                }
                else if(arr[mid]<target)low=mid+1;
                else high=mid-1;
            }
            if(flag==true)
                System.out.println(target+" is there in the Array");
            else
                System.out.println(target+" is not there in the Array");
        }
    }
}