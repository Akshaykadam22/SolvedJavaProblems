//Ovwels printing program!!

import java.util.*;

class A4{
         public static void main(String[] args){

                 Scanner sc=new Scanner(System.in);

                char arr[]=new char[7];

                for(int i=0;i<arr.length;i++){
                     System.out.print("enter element to add in array" +" ");
                     arr[i]=sc.next().charAt(0);                     
                  }
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
                                           		System.out.print("your ovwels is :"+arr[i]);
         }
    }
}


