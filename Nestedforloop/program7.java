import java.io.*;
class NestedloopDemo7{

	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter start");
		int start=Integer.parseInt(br.readLine());


		System.out.println("Enter end");
		int end=Integer.parseInt(br.readLine());
                
		for(int i=start;i<=end;i++){
                       int num=i;
		       int rev=0;
		       while(num!=0){

			int rem=num%10;
		        rev=rev*10+rem;
		        num=num/10;
		       }
	      System.out.println(rev);
   }
	}
}	
