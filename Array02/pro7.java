// Common elements in array program

import java.io.*;
class A7{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the size of array 1");
		int n1=Integer.parseInt(br.readLine());

                System.out.println("enter the size of array 2");
		int n2=Integer.parseInt(br.readLine());
               
		int arr[] =new int[n1];
		int arr2[]=new int[n2];

		for(int i=0;i<n1;i++){
				System.out.println("values in array1");
				arr[i]=Integer.parseInt(br.readLine());
                       }
		for(int i=0;i<n2;i++){
			       System.out.println("Enter for array2");
			       arr2[i]=Integer.parseInt(br.readLine());
		       }
                for(int i=0;i<n1;i++){ 
			for(int j=0;j<n2;j++){

	                 if(arr[i]==arr2[j])
				   System.out.println("common elements is :"+arr[i]);
               }
 	} 
	
     }

}


