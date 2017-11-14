
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anup
 */
public class Class2 {
    public static void main(String []args)
    {
        int x,y,z;
        System.out.println("Enter two number");
        Scanner s=new Scanner(System.in);
        x=s.nextInt();
        y=s.nextInt();
        z=x+y;
        System.out.println("addition of two no is "+z);
    }
    
}
