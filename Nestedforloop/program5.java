import java.io.*;

class NestedDemo5{
        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter start an end range");
                int start=Integer.parseInt(br.readLine());
                int end =Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){

                        int p=0;
                    for(int j=1;j<i;j++){

			   if(i%j==0){				
		                 p=p+j;
		         }
		    }
			        if(p==i){
				    System.out.println(i);
		                   
	              }
		   }
             		   
                }

        }

