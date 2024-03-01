//Aranging numbers from array in such a way that it will form a large number;
//input :N=5 arr[]={9,0,1,3,0};
 
class Barray04{
	     public static void main(String args[]){

		     int N=5;
		     int arr[]={2,0,1,5,0};
                     
		     for(int i=0;i<N;i++){
			    
			     for(int j=1;j<N;j++){

			     if(arr[i]<arr[j]){
                               int temp=arr[i];
			       arr[i]=arr[j];
			       arr[j]=temp;
			     }
	              }
		   }
		 for(int i=0;i<N;i++){

		      System.out.print(arr[i]);
	           }
		 System.out.println();
     }              
  } 

