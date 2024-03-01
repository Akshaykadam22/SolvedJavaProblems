


class Barray22{ 
	 
	  public static void main(String args[]){

		  int N=4;
		  int arr[]={-3,2,-4,1};

		  for(int i=0;i<N;i++){

			  if(i%2==0){

				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}

		for(int i=0;i<N;i++){

			System.out.print(arr[i]+" ");
	          }
	}
}
