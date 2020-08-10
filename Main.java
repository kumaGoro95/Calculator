import java.math.BigDecimal;
import java.util.Scanner;

public class Main{
  public static void main(String [] args){
    System.out.println("---------");
    System.out.println("電卓アプリ");
    System.out.println("---------");
    System.out.println("最初の数字を入力してください");
    Scanner scan1 = new Scanner(System.in);
    Double double1 = scan1.nextDouble();
    BigDecimal bigd1 = BigDecimal.valueOf(double1);
    System.out.println("演算子は？");
    System.out.println("[ 1: + 2: - 3: * 4: / ]");
    Scanner scan3 = new Scanner(System.in);
    String input3 = scan3.nextLine();
    int opera = Integer.parseInt(input3);
    System.out.println("2つ目の数字を入力してください");
    Scanner scan2 = new Scanner(System.in);
    Double double2 = scan2.nextDouble();
    BigDecimal bigd2 = BigDecimal.valueOf(double2);
    BigDecimal bigd3 = bigd1.add(bigd2);
    Calc(opera, bigd1, bigd2);
  }
  public static void Calc(int opera, BigDecimal bigd1, BigDecimal bigd2){
    switch(opera){
      case 1:
        BigDecimal result1 = bigd1.add(bigd2);
        System.out.println(bigd1+" + "+bigd2+" = "+result1);
        break;
      case 2:
        BigDecimal result2 = bigd1.subtract(bigd2);
        System.out.println(bigd1+" - "+bigd2+" = "+result2);
        break;
      case 3:
        BigDecimal result3 = bigd1.multiply(bigd2);
        System.out.println(bigd1+" * "+bigd2+" = "+result3);
        break;
      case 4:
        BigDecimal result4 = bigd1.divide(bigd2, 5, BigDecimal.ROUND_DOWN);
        System.out.println(bigd1+" / "+bigd2+" = "+result4);
        break;
    }
  }
}
