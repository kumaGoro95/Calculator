public class Main {
	public static void main(String[] args) {
		System.out.println("あなたの誕生日を８桁で入力してください。");
		int input = new java.util.Scanner(System.in).nextInt();
		String str = Integer.toString(input);   //入力された数値を文字列に変換
		String[] resultArray = new String[8];
		resultArray = str.split("");   //文字列を分割して配列化する
		int[] numbers = new int[8];
		for(int i = 0; i < resultArray.length; i++){
		  numbers[i] = Integer.parseInt(resultArray[i]);  //文字列を数値に戻す
		}
		int result = calc(numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7]);
		System.out.println("あなたの番号は"+result+"です。");
	}
	public static int calc(int a, int b, int c, int d, int e, int f, int g, int i) {
	    int result1 = a + b + c + d + e + f + g + i;
		if (result1 < 10){  //初回の結果が１桁の場合はここで終了
			return result1;
		} else {   //初回の計算結果が2桁になった場合は、もう一度計算する
	        String str2 = Integer.toString(result1);
	        String[] resultArray2 = new String[2];
	        resultArray2 = str2.split("");
	        int j = Integer.parseInt(resultArray2[0]);
	        int k = Integer.parseInt(resultArray2[1]);
	        int result2 = j + k;
			if ( result2 <= 9 ){ //2回目の結果が1桁ならここで終了
				return result2;
			}else {  //そうでない場合は、もう一度計算
				int result3 = 0;
				switch(result2){
				case 10:
					result3 = 1;
					break;
				case 11:
					result3 = 2;
					break;
				case 12:
					result3 = 3;
					break;
				}
				return result3;
			}
		}
	}
}
