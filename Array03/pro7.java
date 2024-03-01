//Strong number in array checking program


import java.util.*;
class A037{
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
                        
			while(temp!=0){
				int rem=temp%10;
				int product=1;
				for(int j=1;j<=rem;j++){
                                          product=product*j;
                                    }
				sum=sum+product;
			        temp=temp/10;
			}
		       if(sum==arr[i])
			       System.out.println("Strong No. "+arr[i]+" at index "+i);				   
	}

    }  

}
