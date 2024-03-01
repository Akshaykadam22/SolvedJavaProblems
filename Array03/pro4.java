// Finding prime number an return its index

import java.io.*;

class A034{
            public static void main(String[] args)throws IOException{

		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		    System.out.println("enter size of array");
		    int size=Integer.parseInt(br.readLine());

		    int arr[]=new int[size];
		    for(int i=0;i<size;i++){

			    arr[i]=Integer.parseInt(br.readLine());
			}
                    
		    for(int i=0;i<size;i++){
                           int temp=arr[i];
			   int count=0;
			    for(int j=1;j<=temp;j++){

				       if(arr[i]%j==0)
					       count++;
				       if(count==3)
					       break;

					    
			      } if(count<=2)
			               System.out.println("prime: "+arr[i]+" index: "+i);
                 }
       }
}
	
