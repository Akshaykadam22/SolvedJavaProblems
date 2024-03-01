class Barray14{
            public static void main(String [] args){

                      int A[]={1,4,20,3,10,5};
                      int sum =33;
                      
                      int curr=0, start=0;

		      for(int i=0;i<A.length;i++){
                             if(i<A.length){
			      curr+=A[i];
                             }
			     while(curr>sum&&start<i-1){
                                 
                                    curr-=A[start];
				     start++;
				  }
			     if(curr==sum){
                                   int end=i-1;
				  System.out.println("at Index" +start+"to"+end);
				  break;
				}
			     
				  
		      }
		}
	 }

