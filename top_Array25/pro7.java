//Finding maximum odd sum from array 


class Barray07{

	public static void main(String[] args){
                int N=4;
		int arr[]={4,-3,3,-5};
                int sum=0;
		int i;
		for(i=0;i<N;i++){

			if(arr[i]>=0){
                               sum=sum+arr[i];
			     }
		}
		if(sum%2==1){
			System.out.println("oddsum :"+sum);
                 }else{
			 int max;
			 int smallest=0;
			 for(int j=0;j<N;j++){
                                
				 if(arr[j]>0){

					 if(arr[j]%2==1){
						  max=arr[j];
					 
				         if(arr[j]<=max){
							 smallest=arr[j];

					    }
                                     }
			        }

			} 
			if(smallest==0){
				System.out.println("NO small odd this sum:");
			}else{
				sum=sum-smallest;
				System.out.println("odd sum1:"+sum);

		}
				
           }
   }	   

}
