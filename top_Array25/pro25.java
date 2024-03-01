



class Barray25{
	 
	     public static void main(String[] args){

		       int arr[]={6,6,4,4};
		       int sum=0;
		       for(int i=0;i<arr.length;i++){

			    for(int j=i+1;j<arr.length;j++){

				       int diff=Math.abs(arr[i]-arr[j]);

				    if(diff >1){

					    sum+=arr[j]-arr[i];
		       	       	} 
		            }
		 	} System.out.println(sum);
                  }
           }

