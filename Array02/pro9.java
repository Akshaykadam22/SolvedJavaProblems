//Merge array program 

import java.io.*;

class A9{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array1");
		int size1=Integer.parseInt(br.readLine());

		System.out.println("enter the size of array2");
		int size2=Integer.parseInt(br.readLine());
         
		int arr1[]=new int[size1];
	        int arr2[]=new int[size2];
		int arr3[]=new int[size1+size2];
		for(int i=0;i<size1;i++){

			System.out.println("enter the element to add in array1");
			arr1[i]=Integer.parseInt(br.readLine());

		}
		for(int i=0;i<size2;i++){

			System.out.println("enter the element to add in array2");
			arr2[i]=Integer.parseInt(br.readLine());

		}
		for(int i=0;i<size1;i++){
			arr3[i]=arr1[i];
		}

	     	for(int i=0;i<size2;i++){
			         arr3[size1+i]=arr2[i];
		}
	        System.out.println("elements of arr3 is");
		for(int i=0;i<arr3.length;i++){
			System.out.print(+arr3[i]+",");
 		} System.out.println();
	}
}
