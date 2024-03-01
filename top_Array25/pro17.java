// finding K th time occuenrce of element in array


class Barray17{

	 public static void main(String[] args){

		 int arr[]={7,3,4,2,3,7,0};

		 int N=7;
		 int k=2;
		 int size=100001;
                 int countarr[]=new int[size];
		 for(int i=0;i<N;i++){

			 countarr[arr[i]]++;
			
		
			} 
		 for(int i=0;i<size;i++){

			 if(countarr[i]==k){

				 System.out.println(i);
				 break;
		         }

          	}
	 }
}


