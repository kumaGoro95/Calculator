import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;


public class Print{
  private ArrayList<BigDecimal> numberArr;
  private ArrayList<Character> operaArr;

  Print(ArrayList<BigDecimal> numberArr, ArrayList<Character> operaArr){
    this.numberArr = numberArr;
    this.operaArr = operaArr;
  }

  public ArrayList<BigDecimal> getNumberArr(){
    return this.numberArr;
  }

  public ArrayList<Character> getOperaArr(){
    return this.operaArr;
  }

  public void numberPrint(){
    operaSet();
    System.out.println();
    System.out.println("---------");
    System.out.println("計算結果");
    System.out.println("---------");
    System.out.println();
    for(int j = 0; j < operaArr.size(); j++){
      System.out.print(numberArr.get(j)+" ");
      System.out.print(operaArr.get(j)+" ");
    }
    System.out.print(numberArr.get(operaArr.size())+" ");
    System.out.print("= ");
  }


  public void operaSet(){
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf('1');
      if(index == -1){
        break;
      }
      operaArr.set(index, '+');
    }
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf('2');
      if(index == -1){
        break;
      }
      operaArr.set(index, '-');
    }
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf('3');
      if(index == -1){
        break;
      }
      operaArr.set(index, '×');
    }
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf('4');
      if(index == -1){
        break;
      }
      operaArr.set(index, '÷');
    }
    }
}
