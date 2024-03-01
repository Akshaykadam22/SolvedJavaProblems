import java.io.*;
class NestedloopDemo4{
	public static void main(String[] args)throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Start number");
	int Start=Integer.parseInt(br.readLine());
	System.out.println("Enter End number" );
	int End=Integer.parseInt(br.readLine());
       for(int i=End;i>=Start;i--){
	  if(i%2==0){
              System.out.print(i+ " ");

	     } 
       } System.out.println();
	  for(int j=Start;j<=End;j++){
              if(j%2==1){

	        System.out.print(j+" ");
	      
            } 
        }
	System.out.println();
  } 
} 
