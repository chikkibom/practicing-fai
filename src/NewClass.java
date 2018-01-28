import java.util.*;
public class NewClass {
    public static void main(String[] args){
    double tinggi;
    double lebar;
    double luas;
    int jawapan;
    
    Scanner input=new Scanner(System.in);
   do{
    System.out.print("Masukkan tinggi= ");
    tinggi=input.nextDouble();
    System.out.print("Masukkan lebar= ");
    lebar=input.nextDouble();
    
    luas=tinggi*lebar*0.5;
    System.out.println("Luas = "+luas);
    
    System.out.println("Adakah anda ingin mengulanginya? Jika ya sila taip 1, Jika tidak sila taip 2= ");
    jawapan=input.nextInt();
   }while(jawapan==1);
   System.out.print("Sistem tamat");
    }
}
