// Element reverse in array

import java.io.*;

class A032{
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
                        int rev=0;
			int temp=arr[i];
                        
                        while(temp!=0){
                              int rem=temp%10;
                              rev=rev*10+rem;
                              temp=temp/10;
			  
			}
                        System.out.println("rev:"+rev);

          }
   } 

}
