import java.util.*;

class A6{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);

		int arr[]=new int[10];

	       for(int i=0;i<arr.length;i++){

		       System.out.print("enter element to add in array" +" ");
		       arr[i]=sc.nextInt();
		 }

	       for(int i=0;i<arr.length;i++){

		       if(arr[i]%5==0) 
			       System.out.println("the elements divisible by 5 are:"+" "+arr[i]);

	       }
	      }
}
