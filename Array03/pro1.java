// digit count in element program

import java.io.*;

class A031{ 
	  public static void main(String[] args)throws IOException{

		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	          System.out.println("Enter size of array");
		  int size=Integer.parseInt(br.readLine());
		  
		 int arr[] =new int[size];
	         for(int i=0;i<size;i++){
                     System.out.print("enter to add:");
		     arr[i]=Integer.parseInt(br.readLine());

		  }
		  
		  for(int i=0;i<size;i++){
			int temp=arr[i];
			int count=0;

			while(temp!=0){
                              int rem=temp%10;
			      count++;
			      temp=temp/10;
			}
		        System.out.println("count:"+count);	
		     	 
	  }
   }
}
