import java.util.*;

class A3{
         public static void main(String[] args){

                 Scanner sc=new Scanner(System.in);
                 System.out.println("enter size of array");

                 int size=sc.nextInt();
                 int arr[]=new int[size];
                 int sum=1;

                for(int i=0;i<size;i++){
                     System.out.print("enter element to add in array" +" ");
                     arr[i]=sc.nextInt();
                        if(arr[i]%2==1)
                                sum=sum*arr[i];

                  }
                System.out.println("your sum is :"+sum);
         }
}
