import java.io.*;
class comb{
	public static void main(String[] args)throws IOException{
		BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter n ");
		int n=Integer.parseInt(ob.readLine());
		System.out.println("enter r");
		int r=Integer.parseInt(ob.readLine());
                float s=1;
		if(n>1){
		for(int i=1;i<=n;i++){
		       	s=i*s;
		}}
	       	System.out.println("This s: "+s);
	/*	int rd=1;
		int f=n-r;
		System.out.println("this ff:"+f);
		if(f>1){
		for(int j=1;j<=f;j++){
		      rd=rd*j;
		      
	     } }System.out.println("this rd: "+rd); 
	    int t=1;  
	    for(int i=1;i<=r;i++){
		    t=t*i;
		   }
	    System.out.println("This is t: "+t);
                int e=rd*t;
		int y=s/e;
		System.out.println("This is an combination =" +y);
*/
	}
}	
