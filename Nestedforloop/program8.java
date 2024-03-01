import java.util.*;
class Pddemo{
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		int start =sc.nextInt();
		int end=sc.nextInt();
               for(int i=start;i<=end;i++){
                     int num=i;
		     int rev=0;
		     int orginal=num;
		      while(num>0){
			      int rem=num%10;
			      rev=rev*10+rem;
			      num=num/10;
			     }
                        if(orginal== rev){
				System.out.println("This is a reverse number:"+orginal);
	                  }
		}
	      }
}

