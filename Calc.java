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

  public void addAndSubtract(){
    for(int i = 0; i <= operaArr.size();){
      if(operaArr.isEmpty()){
        break;
      }else if(operaArr.get(i) == 1){
        BigDecimal addResult = numberArr.get(i).add(numberArr.get(i+1));
        numberArr.set(i, addResult);
        numberArr.remove(i+1);
        operaArr.remove(i);
      }else{
        BigDecimal subtractResult = numberArr.get(i).subtract(numberArr.get(i+1));
        numberArr.set(i,subtractResult);
        numberArr.remove(i+1);
        operaArr.remove(i);
      }
    }
  }

  public void multiply(){
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf(3);
      if(index == -1){
        break;
      }
      BigDecimal multiplyResult = numberArr.get(index).multiply(numberArr.get(index+1));
      numberArr.set(index, multiplyResult);
      numberArr.remove(index+1);
      operaArr.remove(index);
    }
  }

  public void divide(){
    for(int i = 0; i < operaArr.size(); i++){
      int index = operaArr.indexOf(4);
      if(index == -1){
        break;
      }
      BigDecimal divideResult = numberArr.get(index).divide(numberArr.get(index+1), 3 , BigDecimal.ROUND_DOWN);
      numberArr.set(index, divideResult);
      numberArr.remove(index+1);
      operaArr.remove(index);
    }
  }


  public void resultPrint(){
    System.out.print(numberArr.get(0));
  }

}
