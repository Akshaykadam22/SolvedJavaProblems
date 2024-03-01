import java.io.*;

class NestedDemo9{
	public static void main(String[] args)throws IOException{

	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	    System.out.println("enter start an end of range");

	   int start=Integer.parseInt(br.readLine());
           int end=Integer.parseInt(br.readLine());
           System.out.println("Prime number series");

	   for(int i=start;i<=end;i++){

		  int count=0;

		for(int j=1;j*j<=i;j++){
			if(i%j==0){
			       count=count++;
			
			if(count>2) 
		  	break;
		               
		
               	}
	}
		if(count<=2) 
		System.out.println(i+" ");
                System.out.println(); 
       } 

     }
  } 
	 



