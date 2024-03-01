import java.io.*;
class NestedDemo1{
	public static void main(String [] args)throws IOException{
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter rows");
		int rows=Integer.parseInt(obj.readLine());

		               
		int n=1;
	        for(int i=1;i<=rows;i++){
		    for(int j=1;j<=rows;j++){
			  if(j==n){
		            System.out.print("#" +" ");
			   }else{
				  System.out.print("="+" "); 
                                } 
		    } 
		      n++;
                    System.out.println();
		   }
	}
} 
