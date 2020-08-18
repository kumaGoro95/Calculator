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
    a.numberScan();  //計算式を入力
    Print b = new Print(a.getNumberArr(), a.getOperaArr());
    b.numberPrint();  //入力した式を表示
    Calc c = new Calc(a.getNumberArr(), a.getOperaArr());
    c.multiplyAndDivide();  //最初に掛け算と割り算
    c.addAndSubtract();  //最後に足し算と引き算
    c.resultPrint();  //結果を表示
  }
}
