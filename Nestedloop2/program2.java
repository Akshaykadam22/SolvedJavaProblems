import java.io.*;
class NestedloopDemo2{
	public static void main(String[] args)throws IOException{ 
            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("enter rows: ");
	    int rows=Integer.parseInt(br.readLine());
             
	    for(int i=1;i<=rows;i++){
	              int a=i;	
		for(int j=1;j<=rows;j++){
                      if(j==a){
                           System.out.print("#"+ " ");
			}else{
			    System.out.print("=" + " ");
			  }
		    } System.out.println();
	    }
	  }
} 
