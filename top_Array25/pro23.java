

class Barray23{

	 public static void main(String[] args){   
		     int N=4;
		     int M=4;
		     int sum=10;
		     int arr1[]={1,3,5,7};
		     int arr2[]={2,3,5,8};
                     int i=0;
		     int count=0;
		     int j=arr2.length-1;

		     while(i<arr1.length&&j>=0){
			      
			     int curr=arr1[i]+arr2[j];
			    
			     if(curr==sum){

				     count++;
				     i++;
				     j--;
	                     }
			     else if(curr<sum){

				     i++;
			}
			else{
				j--;
			}
                 }
	    System.out.println(count);
	 }
}

