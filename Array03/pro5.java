// Finding perfect number from array


import java.io.*;

class A035{
            public static void main(String[] args)throws IOException{

                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("enter size of array");
                    int size=Integer.parseInt(br.readLine());

                    int arr[]=new int[size];
                    for(int i=0;i<size;i++){
                           System.out.println("enter element to add : ");
                            arr[i]=Integer.parseInt(br.readLine());
                        }

                    for(int i=0;i<size;i++){
                        
                           int sum=0;
                            for(int j=1;j<arr[i];j++){

                                       if(arr[i]%j==0)
                                               sum=sum+j;
                                       

                                                   
                              } if(sum==arr[i])
                                       System.out.println("perfect: "+arr[i]+" index: "+i);
                 }
       }
}
