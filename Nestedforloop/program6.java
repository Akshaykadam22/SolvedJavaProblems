import java.io.*;
class NestedloopDemo6{
	   public static void main(String[] args)throws IOException{
                 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 
		   System.out.println("enter number ");
		   int num=Integer.parseInt(br.readLine());

	           int count=0;
		   int temp=num;
                
		   while(temp!=0){
                          temp/=10;
			   count++;
   		   } 
		   System.out.println("Your count of digit is ="+ count);
	   }
}
