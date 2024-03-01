import java.util.Scanner;
class Sd{
        public static void main(String[] args) {
                 Scanner sc=new Scanner(System.in);
                 StringBuffer sb=new StringBuffer();
                 int x;
                 do{
                  System.out.println("Enter 1 to create StringBuffer");
                  System.out.println("Enter 2 for Append to String");
                  System.out.println("Enter 3 for delete to String"); 
                  System.out.println("Enter 4 for insert at position to String");
                  System.out.println("Enter 5 for repalce the String");
                  System.out.println("Enter 6 to reverse the String");
                  System.out.println("Enter 7 to see length an Capacity of String");
                  System.out.println("Enter 8 for trimtosize: ");
                  System.out.println("Enter 9 to print String");
                  System.out.println("10 for Exit");
                  x=sc.nextInt();
                  sc.nextLine();
                  System.out.println();
                     switch (x) {
                        case 1: 
                               
                             System.out.println("String buffer is Created add your text now");
                            break;
                        case 2:
                              System.out.println("enter string to append:");
                               String aps=sc.nextLine();
                               sb.append(aps);
                               break;
                        case 3:
                              System.out.println("Enter start an end of delete: ");
                               int start=sc.nextInt();
                               int end=sc.nextInt();
                               sb.delete(start, end);
                               break;
                        case 4:
                               System.out.println("enter the postion: ");
                               int pos=sc.nextInt();
                               sc.nextLine();
                               System.out.println("enter the string to insert:");
                               String ins=sc.nextLine();
                               sb.insert(pos, ins);
                               break;
                        case 5:
                              System.out.println("enter Start:");
                              int startr=sc.nextInt();
                              System.out.println("enter end position:");
                              int endr =sc.nextInt();
                              sc.nextLine();
                              System.out.println("enter new String to replacr:");
                              String s=sc.nextLine();
                              sb.replace(startr, endr, s);
                              break;
                        case 6:
                              sb.reverse();
                              System.out.println();
                              break;

                        case 7:
                              int len=sb.length();
                              int cap=sb.capacity();
                              System.out.println("length ="+len);
                              System.out.println("Capacity ="+cap);
                              break;
                        case 8:
                               sb.trimToSize();
                               System.out.println("succfully trimed");
                               break;
                        case 9:
                               System.out.println("Your String : "+sb);
                               System.out.println();
                               break;
                        case 10:
                              System.out.println("Exiting....");
                              break;
                        default:
                               System.out.println("Invaild Numer intereted>>>>!!!");
                            break;
                     } 

                  }while(x!=10);
        }   
 }