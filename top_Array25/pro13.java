// FInding product of max element in arr1 an mini element i arr2;




class Barray13{
            public static void main(String [] args){

                      int A[]={5,7,9,3,6,2};
                      int B[]={1,2,6,-1,0,9};
                      int min=Integer.MAX_VALUE;
		      int max=Integer.MIN_VALUE;
		     for(int i=0;i<A.length;i++){

                           if(A[i]>max){
                                max=A[i];
			   }
		       }
		       for(int i=0;i<B.length;i++){

                           if(B[i]<min){
                                min=B[i];
                           }
                       } 
		      // System.out.println(min);
		     System.out.println(max*min);
				    
          }
 }                                                                                            
