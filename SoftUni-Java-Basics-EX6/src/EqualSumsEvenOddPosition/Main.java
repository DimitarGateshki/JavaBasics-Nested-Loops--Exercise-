package EqualSumsEvenOddPosition;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int s=Integer.parseInt(scan.nextLine());

        for (int i=n;i<=s;i++){
            String numb=""+i;
            int odd=0;
            int even=0;
            for (int j = 0; j <numb.length() ; j++) {
                int digital=Integer.parseInt(""+numb.charAt(j));
                if (j%2==0){
                    even+=digital;
                }else if (j%2!=0){
                    odd+=digital;
                }
            }
            if (odd==even){
                System.out.printf("%d ",i);
            }
        }
    }
}
