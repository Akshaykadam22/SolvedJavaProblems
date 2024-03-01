import java.util.*;
 class Pro1{
	    public static void main(String[] args){
		     
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the size of array");
		  int size = sc.nextInt();

		  int arr[] =new int[size];
                  int sum=0;
		  for(int i=0;i<arr.length;i++){

			  System.out.println("enter element to add ");
			  arr[i]=sc.nextInt();

			  if(arr[i]%2==1){
				  sum=sum+arr[i];
			  }
		}
		System.out.println("The sum of odd numbers is : "+sum);
	}
}

