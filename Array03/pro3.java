//Composite number in array an there index priting program

import java.io.*;

class A033{
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
                       // int temp=arr[i];
                        int count=1;
			int j=1;

                        while(arr[i]!=j){
                              int rem=arr[i]%j++;
                               if(rem==0)
			              count++;
			       if(count>=3)
				      break;
                         } 
			 if(count>2) 
                                   System.out.println("composite element: "+arr[i]+" index: "+i);

          }
   }
}
