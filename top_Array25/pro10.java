class Barray10{
               public static void main(String [] args){

                      int k=7;
		      int n=8;

		      int arr[]={2,3,3,3,3,3,2,2};
                      int frequncy [] =new int[k];
		      for(int i=0;i<n;i++){
                          
			     
			      frequncy[arr[i]]++;
		      } 
		       
		         int large =0;
			 int max=frequncy[0];
 			 for(int i=0;i<k;i++){
                             if(frequncy[i]>max){ 
		
				         large=i;
					 max=frequncy[i];
		
			     }
			 } 
			  boolean allSame = true;
                     for (int i = 0; i < k; i++) {
                                  if (frequncy[i] > 0 && frequncy[i] != max) {
                                            allSame = false;
                                              break;
                                         }
                      }

			     if(allSame){
                               System.out.println("all the element has same count in array"+ 0);
                             }else{
				  System.out.println(large);
			     }
		    }	
             }
