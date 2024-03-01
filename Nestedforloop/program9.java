import java.util.*;
class Nesteddemo9{
	public static void main(String[] args){
              Scanner sc=new Scanner(System.in);

	      System.out.println("enter starting range:");
	      int start=sc.nextInt();
	      System.out.println("enter ending range:");
	      int end=sc.nextInt();

	      for(int i=start;i<=end;i++){

		      int num=i;
		      int sum=0;
		      
		      while(num>0){
		      	      int rem=num%10;
			     int factorial=1; 
			     for(int j=1;j<=rem;j++){
                                    factorial=factorial*j;
			     }
                               sum=sum+factorial;
			        num=num/10;   
		              } 
                            if(sum==i){
	        			  System.out.println("the strong numbers between  "+start+" to "+end+" range is: " +i);   
			    }
	   }
   }
}
