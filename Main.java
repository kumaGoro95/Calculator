import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
  public static void main(String [] args){
    Scan a = new Scan();
    System.out.println();
    System.out.println("---------");
    System.out.println("電卓アプリ");
    System.out.println("---------");
    System.out.println();
    a.numberScan();
    Print b = new Print(a.getNumberArr(), a.getOperaArr());
    b.numberPrint();
    Calc c = new Calc(a.getNumberArr(), a.getOperaArr());
    c.multiply();
    c.divide();
    c.addAndSubtract();
    c.resultPrint();
  }
}
