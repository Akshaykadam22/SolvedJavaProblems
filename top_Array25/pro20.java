//findin floor an ceiling in given array 


class Barray20{

	    public static void main(String[] args){

		    int N=8;
		    int x=10;

		    int arr[]={5,6,8,9,6,5,5,6};

		    int  floor=Integer.MIN_VALUE;
		    int  Ceil=Integer.MAX_VALUE;

		    for(int i=0;i<N;i++){
                             
			  if(arr[i]<=x&&arr[i]>floor){
				        floor=arr[i];
			      }else if(arr[i]>=x&&arr[i]<Ceil){

				       Ceil=arr[i];
		             } 
			  }
                          
		      
		  if(floor==Integer.MIN_VALUE){
                               System.out.println("no Floor exist ");
		   }else{
	                 System.out.println("floor :"+floor);
		   }
		  if(Ceil==Integer.MAX_VALUE){
			  System.out.println("NO Ciel exist");
	          }else{
	                System.out.println("Ceil :"+Ceil);
	         }
	   }  
    }			     
