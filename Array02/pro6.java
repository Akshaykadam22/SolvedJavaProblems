// Maximum element in array program..

import java.io.*;

class A6{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the size of array");
                int n=Integer.parseInt(br.readLine());

                int arr[] =new int[n];

                System.out.println("enter the element to add in array ");
                for(int i=0;i<arr.length;i++){

                      arr[i]=Integer.parseInt(br.readLine());
                   }
                int max=arr[0];
                for(int i=1;i<arr.length;i++){

                        if(arr[i]>max)
                               max=arr[i];
                }


                 System.out.println(" maximum element in array :"+max);

    }
  }
                                                                                                                                    
