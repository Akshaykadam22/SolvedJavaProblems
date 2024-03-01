import java.io.*;

class A1{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the size of array");
	        int n=Integer.parseInt(br.readLine());

		int arr[] =new int[n];
                int sum=0;
		System.out.println("enter the element to add in array ");
		for(int i=0;i<arr.length;i++){
            
	              arr[i]=Integer.parseInt(br.readLine());
                   }
                for(int i=0;i<arr.length;i++){
                      sum=sum+arr[i];
		   }

		System.out.println("the sum is :"+sum);

    }
  }
