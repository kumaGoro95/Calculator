import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;

public class Scan{
    private ArrayList<BigDecimal> numberArr = new ArrayList<>(); //数字を入れる配列
    private ArrayList<Character> operaArr = new ArrayList<>();  //演算子を入れる配列


    public ArrayList<BigDecimal> getNumberArr(){
      return this.numberArr;
    }

    public ArrayList<Character> getOperaArr(){
      return this.operaArr;
    }

    public void numberScan(){
      System.out.println("数値を入力してください");
      Scanner scan1 = new Scanner(System.in);
      Double double1 = scan1.nextDouble();
      BigDecimal big1 = BigDecimal.valueOf(double1);
      numberArr.add(big1);
      System.out.println("演算子を選択してください");
      System.out.println("[ 1: + 2: - 3: * 4: / ]");
      Scanner scan3 = new Scanner(System.in);
      char opera = scan3.next().charAt(0);
      operaArr.add(opera);
      System.out.println("数値を入力してください");
      Scanner scan2 = new Scanner(System.in);
      Double double2 = scan2.nextDouble();
      BigDecimal big2 = BigDecimal.valueOf(double2);
      numberArr.add(big2);
      for(int i= 0; i < 100; i++){
        System.out.println("演算子を選択してください");
        System.out.println("終了する場合は5を入力してください");
        System.out.println("[ 1: + 2: - 3: * 4: / ]");
        Scanner scanA = new Scanner(System.in);
        char operaA = scanA.next().charAt(0);
        if(operaA == '5'){
          break;
        }
        operaArr.add(operaA);

        System.out.println("数値を入力してください");
        Scanner scanB = new Scanner(System.in);
        Double doubleA = scanB.nextDouble();
        BigDecimal bigA = BigDecimal.valueOf(doubleA);
        numberArr.add(bigA);
      }
    }
}
