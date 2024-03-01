//ArmStong number in array finding program.


import java.util.*;
class A038{
        public static void main(String[] args){

                Scanner sc=new Scanner(System.in);
                System.out.println("enter the size of array");
                int size=sc.nextInt();

                int arr[]=new int[size];

                for(int i=0;i<size;i++){

                     System.out.print("enter to add :");
                     arr[i]=sc.nextInt();
                  }

                 for(int i=0;i<size;i++){

                        int temp=arr[i];
                        int sum=0;
                        int pow=0;
		
                        while(temp!=0){ 
				pow++;
                                temp=temp/10;
		
			} 
			temp=arr[i];
                         while(temp!=0){ 
                              int rem=temp%10;
			      int mul=1;
                              for(int j=1;j<=pow;j++){
	                                mul=mul*rem;	 
		              }
		             sum=sum+mul;
		             temp=temp/10;		     
  			 }
                       if(sum==arr[i])
                               System.out.println("ArmStong No. "+arr[i]+" at index "+i);
        }

    }

}
