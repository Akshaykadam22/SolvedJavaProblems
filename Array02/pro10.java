//array elements digit sum even or not check program

import java.io.*;

class A10{
        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter the size of array1");
                int size=Integer.parseInt(br.readLine());

                int arr[]=new int[size];
                for(int i=0;i<size;i++){

                        System.out.println("enter the element to add in array1");
                        arr[i]=Integer.parseInt(br.readLine());

                } 
		 for(int j=0;j<size;j++){

                    int num=arr[j];
                    int sum=0;
                    while(num!=0){
			   int rem=num%10;
			   
                           sum=sum+rem;
	                   num=num/10;
		    }
		     if(sum%2==0)
			     System.out.println("Number with there digit sum is even present in array :"+arr[j]); 
        }

   }
}
