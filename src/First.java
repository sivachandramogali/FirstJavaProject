import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a1[]=new int[10];
        int b1[]=new int[10];

        System.out.println("Enter String a");
        String a =args[0];

        System.out.println("Enter String b");
        String b =args[1];
        /*System.out.println("Enter String c");
        String c =sc.next();*/

        System.out.println("Sting concatination "+a+b);
        int count=0;
        if(a.length()==b.length() )
        {
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) != b.charAt(i)){
                    System.out.println(a.charAt(i));
                    count++;
                }

            }
        }
        System.out.println("Number of chareacter differnt in 2 stings \n"+count );
        if(a.length()>=b.length()){
            System.out.println("greater than condition");
            for(int i=0;i<a.length();i++){
                count=0;
                for( int j=0;j<b.length();j++){
                    if(a.charAt(i) == b.charAt(j)){
                        count++;
                    }
                    a1[i]=count;
                }
            }

            for(int k = 0; k <b.length(); k++){
                count=0;
                for(int j = 0; j<a.length(); j++){
                    if(b.charAt(k) == a.charAt(j)){
                        count++;
                    }
                    b1[k]=count;
                }
            }
            System.out.println("counts assigned to respective array");

            int n=0;
            count=0;
            for(int m = 0; m <b.length(); m++){
                    if(b1[m]==0&&a1[n]==0){
                        count++;
                        System.out.println("Number operation performed for sting converter"+count);
                        n++;

                    }
                    else if (b1[m]!=0&&a1[n]==0){
                        n++;
                        m--;
                        count++;
                        System.out.println("Number operation performed for sting converter"+count);

                        /*if(a1[n]!=0&&b.charAt(m)==a.charAt(n)){
                            count++;
                            System.out.println("Number operation performed for sting converter"+count);
                        }*/
                    }
                    else if(b1[m]!=0&&a1[n]!=0){
                        System.out.println("not 0 not 0 condition...."+a.charAt(n)+"..... "+b.charAt(m));
                        if(a.charAt(n)!=b.charAt(m))
                        {
                            m--;
                            count++;
                            n++;
                            System.out.println("Number operation performed for sting converter"+count);
                        }
                        else if(a.charAt(n)==b.charAt(m)){
                            n++;
                            System.out.println("eqUAL CONDITION");
                        }
                    }
            }
            System.out.println("Number operation performed for sting converter"+count);



        }
    }
}
