import java.io.*;
class NestedloopDemo6{
       public static void main(String[] args)throws IOException{
	       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	       System.out.println("enter two char ");
	       int ch1=(char)br.read();
	       br.skip(1);
	       int ch2=(char)br.read();

	       if(ch1==ch2){
		       System.out.println("characters are equal");
	       }
	       else{
		     int diff=ch1-ch2;
		     if(diff<0){
			   diff=diff*(-1);
		     }
		     System.out.println("The difference between "+ch1+"and"+ch2+"is"+diff); 
		}
	   }
      }

