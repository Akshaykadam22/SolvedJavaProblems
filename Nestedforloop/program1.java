import java.io.*;
class NestedDemo{
	     public static void main(String[] args)throws IOException {
		     BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		     System.out.println("Enter the row: ");
		     int rows=Integer.parseInt(obj.readLine());

		     int num=rows;
                     int ch=rows+64;
	           for(int i=1;i<=rows;i++){
	             for(int j=1;j<=rows;j++){
			     if(i%2==1){
				    System.out.print(num-- + " " +(char)ch-- +" ");
		             }else {
				    System.out.print(num++ +" " +(char)ch++ + " ");
                                   }                    
                        
			     }
	       	   
		 if(i%2==1){
			 num++;
			 ch++;
			}
                 else{
			 num--;
	         	 ch--;
	            }       
     	   System.out.println();
	    } 
      }
}
