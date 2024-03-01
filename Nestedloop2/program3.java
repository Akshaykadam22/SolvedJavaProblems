import java.io.*;
class NestedloopDemo{
	public static void main(String[] args)throws IOException{ 
             BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
              System.out.println("enter number of rows: ");
	      int rows = Integer.parseInt(br.readLine());

	      for(int i=1;i<=rows;i++){
		   int x=rows-i+1;
		 for(int j=rows;j>=i;j--){
	               System.out.print(x*i+" ");
		       x--;

              	} 
	System.out.println();
      } 

  } 
}
