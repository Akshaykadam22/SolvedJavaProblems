// given string 00001 finding the last occrence index if '1' in given string 

class Barray12{
	    public static void main(String [] args){

		    String s="00001";

                    char arr[]=s.toCharArray();
                    int store=-1;
		    for(int i=0;i<arr.length;i++){
                   
			   
			    if(arr[i]=='1'){

				    store=i;
				 }
                    } 
		    if(store>=0){
		    System.out.println(store);
		    }else{
			    System.out.println(store);
	            }
          }
  }
