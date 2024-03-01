//exceptional odd ocerenece of element in array 



class Barray18{

	 public static void main(String[] args){
                 int N=7;
                 int n=100000;
		 int arr[]={1,2,6,2,6,1,6};
                 int fq[]=new int[n];

		 for(int i=0;i<N;i++){

			  fq[arr[i]]++;
		    }
		 for(int i=0;i<8;i++){
                         if(fq[i]%2==1){
			 System.out.println(i);
		        }
	         } 
           }
}


