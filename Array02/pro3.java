import java.io.*;

class A3{

        public static void main(String[] args)throws IOException{

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                System.out.println("enter the size of array");
                int n=Integer.parseInt(br.readLine());

                int arr[] =new int[n];
                int evencount=0;
                int oddcount=0;
                System.out.println("enter the element to add in array ");
                for(int i=0;i<arr.length;i++){

                      arr[i]=Integer.parseInt(br.readLine());
                   }
                for(int i=0;i<arr.length;i++){

                        if(arr[i]%2==0){
                                 evencount=evencount+arr[i];
                        }else{
                                oddcount=oddcount+arr[i];
                        }
               }

                System.out.println(" sum of evenNumbers  :"+evencount);
                System.out.println(" sum of oddNumbers  :"+oddcount);

    }
  }
