// Even occaerence of elemenets in array checking program
// input: N=11


class Barray05{

	  public static void main(String[] args){

		  int N=12;
                 
	 	  int arr[]={12,23,9,9,10,12,12,15,23,14,12,15};
            
		  for(int i=0;i<N;i++){

                        if(arr[i]!= -1){
                              int flag=1; 
			  for(int j=i+1;j<N;j++){

				  if(arr[i]==arr[j]){
					      flag++;
		               	              arr[j]=-1;
		     	          }
                          }
			  if(flag%2==0){
     				  System.out.print(arr[i] +" ");
               	          } 
                  }			  
        }
  } 
}

