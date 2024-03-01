import java.io.*;
class mini{
           public static void main(String[] args)throws IOException{
	   BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	   System.out.println("Enter 1.for square");
           System.out.println("enter 2.for circle");
           int a=Integer.parseInt(br.readLine());
	   switch(a){
                     case 1:{
			   int x=1089;
			   System.out.println("enter length: ");
			   
			   float b =Float.parseFloat(br.readLine());
			   System.out.println("enter width: ");
			   float c= Float.parseFloat(br.readLine());

			   if(0<b &&0<c){
			        float d=b*c;
			        float e=d/x;
				System.out.println("Area is : "+e );
		             
			    System.out.println("enter the amount you decided with your customer= "); 
			    float f=Float.parseFloat(br.readLine());
			    float g=e*f;
			    System.out.println("your amount is : " + g +"rs");
			    }else{
			       System.out.println("please enter vaid length an width");
		             }
	                   
                            }
                          break;
		}
}
}
			    
                            	   
	     

