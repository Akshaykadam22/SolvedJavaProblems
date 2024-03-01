 //Product of maximum of first array an minimum of second array;
 
class Barray08{

	public static void main(String[] args){

		int arr[] ={5,7,9,3,6,2};
		int arr2[]={1,2,6,-1,0,9};

		int max=arr[0];
                int min=arr2[0];
                int product=1;
	       for(int i=1;i<arr.length;i++){
	        
	              if(arr[i]>max)
	                       max=arr[i];
               }
	     
	       for(int i=1;i<arr2.length;i++){
	             
	               if(arr2[i]<min)
		                min=arr2[i];
	  
	       }
	   
	       product=max*min;
               System.out.println(product);		
 
       }
  }
