import java.util.*;
class Nesteddemo10{
	public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

		System.out.println("enter start:");
		int start=sc.nextInt();

		System.out.println("enter end:");
		int end=sc.nextInt();
               
		for(int i=start;i<=end;i++){
			int num=i;
			int power=0;

		    while(num>0){
			   int digit=num%10;
			   power++;
			   num=num/10;

		    
		    System.out.println(digit);
		  }
	   }
      }
