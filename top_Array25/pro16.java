//calculating the sum of each of two element in array which is equal to given sum
//By using Two pointer technique we can solve this ;


import java.util.Arrays;

class Barray16{

	public static void main(String[] args){

		 int arr[]={1,-2,1,0,5};
                 int sum=0;
                  Arrays.sort(arr);		 

                  int left=0;
	          int right=arr.length-1;
		  while(left<right){

	           int csum=arr[left]+arr[right];

		  if(csum==sum){
                         System.out.println("Yes "+"found at "+left+" an "+right);
			 break;
	           }
		  else if(csum<sum){
			   left++;
		  }else{
			  right--;
	         } 
	     } 
             System.out.println("NOT Found "+sum);	     
  	  }
}	



