

class Barray24{

	      public static void main(String[] args){

		       int N=4;
		       int arr[]={1,3,6,7};
		       int k=4;
		       int closet=arr[0];
		       int small=Math.abs(arr[0]-k);

        	       for( int num :arr){ 

			       int diff=Math.abs(num-k);
				       if(diff<small||diff==small&&num>closet){ 
				           
					       closet=num;
					       small=diff;
					 }
                     
                       } System.out.println(closet);

                 }
	    }

