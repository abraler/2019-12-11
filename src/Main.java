import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            String dd=in.nextLine();
            String []ddd=dd.split(" ");

            int n=Integer.valueOf(ddd[0]);
            int Comp=Integer.valueOf(ddd[1]);
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=in.nextInt();
            }
            for(int i=0;i<=Comp;i++){

                String s=in.nextLine();
                String []ss=s.split(" ");


                if(ss[0].equals(String.valueOf('Q'))){
                    int begin=Integer.valueOf(ss[1])-1;
                    int end=Integer.valueOf(ss[2]);
                    int MAX=-1;
                    for(int j=begin;j<end;j++){
                        if(a[j]>MAX){
                            MAX=a[j];
                        }
                    }
                    System.out.println(MAX);
                }
                else if(ss[0].equals(String.valueOf('U'))){
                    int updata=Integer.valueOf(ss[1]);
                    int num=Integer.valueOf(ss[2]);
                    a[updata-1]=num;
                }
            }
        }
    }
}