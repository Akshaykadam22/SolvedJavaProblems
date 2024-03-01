//Remove an element at specific index from an array


import java.io.*;

class Barray06{

	  public static void main(String [] args)throws IOException{

		  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		  System.out.println("enter the index: ");

		  int index=Integer.parseInt(br.readLine());
                  int N=5;
		  int arr[]={1,2,3,4,5};

		  for(int i=0;i<N;i++){

			  if(i==index&& i<N-1){

			 	  int temp=arr[i+1];
			          arr[i+1]=arr[i];
				  arr[i]=temp;
				  index++;
			   }
	        }
		for(int i=0;i<N-1;i++){
			System.out.println(arr[i]);
		}
     }
}

