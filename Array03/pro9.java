// Second maximum number in array checking program


import java.util.*;
class A039{
	  public static void main(String[] args){

		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of array :");
		  int size=sc.nextInt();

		  int arr[] = new int[size];

		  for(int i=0;i<size;i++){

			  System.out.print("enter to add :");
			  arr[i]=sc.nextInt();
	            }
         
		   int Max=arr[0];
		   int Second_Max=0;

		   for(int j=1;j<size;j++){
                           
			   if(size<=2&arr[j]>=Max){
			       
				    Second_Max=Max;
			             
			    }else if(size<=2&arr[j]<=Max){
				     Second_Max=arr[j];

			    }else if(arr[j]>=Max){
				   Second_Max=Max;
				    Max=arr[j];
		       }

               }
		    System.out.println("Second Max in the array is "+Second_Max);
	}
}

