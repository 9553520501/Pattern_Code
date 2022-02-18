package String;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name=input.next();
        int mid=name.length()/2;
        name=name.substring(mid)+name.substring(0,mid);

        for (int i = 0; i < name.length(); i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }
    }
}
