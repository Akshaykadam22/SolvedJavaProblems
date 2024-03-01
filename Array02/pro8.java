//Uncommon element find in two array

import java.io.*;

class A8{
	public static void main(String[] args)throws IOException{

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter the size of array1");
		int size1=Integer.parseInt(br.readLine());

		System.out.println("enter the size of array2");
		int size2=Integer.parseInt(br.readLine());

                int arr[]=new int[size1];
		int arr1[]=new int[size2];

		for(int i=0;i<arr.length;i++){

			System.out.println("enter element to add in array1:");
			arr[i]=Integer.parseInt(br.readLine());

		}

		for(int i=0;i<arr1.length;i++){

			System.out.println("enter element to add in array2:");
			arr1[i]=Integer.parseInt(br.readLine());

		}
                int flag=0;
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){

				if(arr[i]==arr1[j]){
                                       flag=1;
                             }
			 }
			     if(flag==0)
			            	System.out.println("Uncommon elements are: "+arr[i]);     
	            flag=0;     
	   	} 
		
		for(int i=0;i<size1;i++){
			for(int j=0;j<size2;j++){

				if(arr1[i]==arr[j]){
                                       flag=1;
                             }
			 }
			     if(flag==0)
			            	System.out.println("Uncommon elements are: "+arr1[i]);     
	            flag=0;     
        }
    }
}
