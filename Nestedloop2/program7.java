class NestedloopDemo7{
	public static  void main(String [] args){
		int row =5;
		int num=15;
		char ch='O';
	  for(int i=1;i<=row;i++){

             for(int j=1;j<=i;j++){

		    if((i%2==1&& row%2==1)||(i%2==1 && row%2==0)){
			  System.out.print((char)(64+num)+" ");
		    }
                   else{
			 System.out.print(num+" ");
			} 
		   num--;

	     } System.out.println();
	  }
     }
}
