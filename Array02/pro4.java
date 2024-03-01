//Element search program
import java.io.*;

class A4{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the element want to search");
                int n=Integer.parseInt(br.readLine());

                int arr[] =new int[]{1,3,45,3,2,34,4};
                  int i=0;
                   while(i<arr.length-1){
                      if(n==arr[i]){
			      System.out.println("Find index of element is :"+i);
		              break;
		           } 
                       i++;
                  } 
                     if(arr[i]!=n)
                        System.out.println(" No such element present in array");
   }    }
