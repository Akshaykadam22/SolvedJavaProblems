//Array numbers rang checking program
//arr[]={1.2,4,4,3,2,5,};
//input:N=7,A=2,B=5;  we have to check is array contain elements whitin the rang A&B;
 

class Barray03{
	    public static void main(String args[]){
                        
		   int N=7;
                   int A=1;
		   int B=15;
		  
                   int flag=0;
		   int arr[]={1,4,5,2,3,7,8,9};

		   for(int i=0;i<N;i++){

                       if(arr[i]<A||arr[i]>B){
                           System.out.println("array does not contains all elements in given "+A+" "+B+" range");
			          break;
                        }else{
				flag++;
			}
		 }
		 if(flag>=1)
			 System.out.println("YES array all elements in specified Range");
	}
}


			       

		   


