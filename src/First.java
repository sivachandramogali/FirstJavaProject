import java.util.Scanner;

public class First {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Sting a");
        String a =sc.next();

        System.out.println("Enter Sting b");
        String b =sc.next();

        System.out.println("Sting concatination "+a+b);
        int count=0;
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++){
                if(a.charAt(i) != b.charAt(i)){
                    System.out.println(a.charAt(i));
                    count++;
                }

            }
        }
        System.out.println("Number of chareacter differnt in 2 stings \n"+count );
        if(a.length()<=b.length()){

        }
    }
}
