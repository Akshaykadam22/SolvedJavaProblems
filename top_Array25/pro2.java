//2.Replacing 0 with 5 in array program


class Barray02{
	    public static void main(String args []){

		    int number=1004;
                    int Newnumber=0;
		    int multipler=1;
		    while(number!=0){
			    int rem=number%10;
			    if(rem==0){
				    Newnumber=Newnumber+5*multipler;
			     }else{
				     Newnumber=Newnumber+rem*multipler;
			       }
			    multipler=multipler*10;
			    number=number/10;
             	}
             System.out.println("Newnumber :"+Newnumber);
        }
}

