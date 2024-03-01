import java.util.Arrays;


class Barray26{
	    
	        public static void main(String[] args){


			int arr[]={5,3,2,4,1};

                        Arrays.sort(arr);
			 
	                long mul=0;
                        long mod=10000007;
			for(int i=0;i<arr.length;i++){
                                  mul +=((long)arr[i] * i)%mod;
				 
				
			} 
			 System.out.println(mul);
		}
	}
