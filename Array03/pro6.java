//Que:-WAP to find palindrome number from an array and return its index Take size from user and elements from user.


import java.io.*;

class A036{
          public static void main(String[] args)throws IOException{

                  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                  System.out.println("Enter size of array");
                  int size=Integer.parseInt(br.readLine());

                 int arr[] =new int[size];
                 for(int i=0;i<size;i++){
                     System.out.print("enter to add:");
                     arr[i]=Integer.parseInt(br.readLine());

                  }

                  for(int i=0;i<size;i++){
                          1::int temp=arr[i];
                        int rev=0;              
                        while(temp!=0){
                              int rem=temp%10;
			      rev=rev*10+rem;
			      temp=temp/10;
                         }
                         if(rev==temp)
                                   System.out.println("palindrome element: "+arr[i]+" found at index: "+i);
                } 
     }
}
