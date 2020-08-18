import java.math.BigDecimal;
import java.util.Scanner;
import java.util.ArrayList;


public class Calc{
  private ArrayList<BigDecimal> numberArr;
  private ArrayList<Character> operaArr;

  Calc(ArrayList<BigDecimal> numberArr, ArrayList<Character> operaArr){
    this.numberArr = numberArr;
    this.operaArr = operaArr;
  }

  public ArrayList<BigDecimal> getNumberArr(){
    return this.numberArr;
  }

  public ArrayList<Character> getOperaArr(){
    return this.operaArr;
  }

  public void addAndSubtract(){  //足し算と引き算を行う
    for(int i = 0; i <= operaArr.size();){
      if(operaArr.isEmpty()){  //演算子がなくなれば終了
        break;
      }else if(operaArr.get(i) == '+'){  //'+'を見つけると足し算
        BigDecimal addResult = numberArr.get(i).add(numberArr.get(i+1));
        numberArr.set(i, addResult);  //結果を代入
        numberArr.remove(i+1);  //計算し終わった箇所は削除
        operaArr.remove(i);
      }else{  //それ以外は引き算
        BigDecimal subtractResult = numberArr.get(i).subtract(numberArr.get(i+1));
        numberArr.set(i,subtractResult);  //結果を代入
        numberArr.remove(i+1);  //計算し終わった箇所は削除
        operaArr.remove(i);
      }
    }
  }

  public void multiplyAndDivide(){  //掛け算割り算を行う
    for(int i = 0; i <= 100; i++){
      int index1 = operaArr.indexOf('×');  //'×'の位置を検索
      int index2 = operaArr.indexOf('÷');  //'÷'の位置を検索
      if((index1 < index2 && index1 != -1) || (index1 > index2 && index2 == -1)){  //手前から計算
        BigDecimal multiplyResult = numberArr.get(index1).multiply(numberArr.get(index1+1));
        numberArr.set(index1, multiplyResult);  //結果を代入
        numberArr.remove(index1+1);   //計算し終わった箇所は削除
        operaArr.remove(index1);
      }else{
        if(index2 == -1){
          break;
        }
        BigDecimal divideResult = numberArr.get(index2).divide(numberArr.get(index2+1), 3 , BigDecimal.ROUND_DOWN);
        numberArr.set(index2, divideResult);  //結果を代入
        numberArr.remove(index2+1);  //計算し終わった箇所は削除
        operaArr.remove(index2);
      }
    }
  }

  public void resultPrint(){  //計算結果を表示
    System.out.print(numberArr.get(0));
    System.out.println();
  }

}
