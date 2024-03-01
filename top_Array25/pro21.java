//finding maximum product of two elements in array 


class Barray21{

	    public static void main(String[] args){
		     
		     
		     int N=5;
		     int arr[]={1,100,42,4,23};
		     int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
		     int min=Integer.MAX_VALUE,min1=Integer.MAX_VALUE;

		     for(int i=0;i<N;i++){

			     if(arr[i]>max1){

				     max2=max1;
				     max1=arr[i];
			     }else if(arr[i]>max2){ 

				     max2=arr[i];
	                    
			     } 

                      
		     if(arr[i]<min){
			     min1=min;
			     min=arr[i];
			 }
		      else if(arr[i]>min&&arr[i]<min1){
			       min1=arr[i];

                 }
              }
            
		 max1=max1*max2;
		 min=min*min1;
		 if(max1>min){
			 System.out.println("product: "+max1);
	          }else{

			  System.out.println("product1: "+min); 
                   }
	}
}
		           
