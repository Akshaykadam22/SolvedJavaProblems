// Minimum element in array program..

import java.io.*;

class A5{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the size of array");
                int n=Integer.parseInt(br.readLine());

                int arr[] =new int[n];
                
                System.out.println("enter the element to add in array ");
                for(int i=0;i<arr.length;i++){

                      arr[i]=Integer.parseInt(br.readLine());
                   }
		int min=arr[0];
                for(int i=1;i<arr.length;i++){

                        if(arr[i]<min)
                               min=arr[i];      
                }


                 System.out.println(" minimum element in array :"+min);

    }
  }
