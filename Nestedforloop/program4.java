import java.io.*;

class NestedDemo4{
        public static void main(String[] args)throws IOException {

                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

                System.out.println("enter start an end range");
                int start=Integer.parseInt(br.readLine());
                int end =Integer.parseInt(br.readLine());

                for(int i=start;i<=end;i++){

                        int product=i*i*i;
                        System.out.println(product);
                }

        }
}
