// Calculating sum of distinct element in array 

import java.util.Arrays;
 class Barray11{

	   public static void main(String args[]){

		      int N=7;

		     int arr[]={1,12,2,2,5,5,5};
                     int sum=arr[0];

                     Arrays.sort(arr);
		     for(int i=1;i<N;i++){      
		        if(arr[i]!=arr[i-1]){
                               
				sum+=arr[i];
		       }
                         
                } 
		System.out.println(sum);
           }   

  }
			      

