package kadai0419;
import java.util.Arrays;
import java.util.Calendar;
public class MethodPractice {
    public static void main(String[] args) {
        //isLeapYear(2024);
        //getSum(5);
        //isPrime(17);
        //factorial(5);
        //int[] max = {3,5,15,6,8};
        //findMax(max);
        //isPalindrome("あいう");
        //getAge(2023,3,20);
        //int[] array = {3,5,15,6,8,25,54,65};
        //sortArray(array);
        int[] index = {12,54,17,85,63,67,87};
        index = sortArray(index);
        getIndex(index,63,0,index.length);


    }

    // うるう年判定メソッド
    public static int isLeapYear(int leap) {

        if(leap % 4 == 0) {
            if(leap % 400 == 0){
                System.out.println("閏年です");
            } else if(leap % 100 == 0){
                System.out.println();
            } else {
                System.out.println("閏年です");
            }
        } else {
            System.out.println();
        }

        return leap;
    }

    // 合計値
    public static int getSum(int sum) {
        int i = 0;
        int j = 0;
        if (sum > 0) {
            for (i = 0; i <= sum; i++) {
                j += i ;
            }
        } else {
            j = 0;
        }

        System.out.println(j);

        return sum;
    }

    //　素数判断
    public static int isPrime(int prime) {

        if(prime > 1) {
            for (int i = 2; i < prime; i++) {
                if(prime % i == 0) {
                    System.out.println(prime + "は素数ではありません");
                    return prime;
                }
            }
            System.out.println(prime + "は素数です");
        } else {
            System.out.println(prime + "は素数ではありません");
        }
        return prime;
    }

    //　階乗
    public static int factorial(int fac) {
        int i = 0;

        for (i = fac - 1; i > 0; i--) {
            fac *= i;
        }
        System.out.println(fac);
        return fac;
    }

    //　配列の最大値
    public static int findMax(int[] fmax) {
        int max = fmax[0];

        for(int i = 0; i < fmax.length; i++) {
            if(max < fmax[i]) {
                max = fmax[i];
            }
        }

        System.out.println(max);

        return max;
    }

    //　回文
    public static String isPalindrome(String pal) {

        char[] yousosuu = pal.toCharArray();

        for(int i = 0; i < yousosuu.length / 2; i++) {
            if(yousosuu[i] != yousosuu[yousosuu.length - i - 1]){
                System.out.println("回文ではない");
            } else {
                System.out.println("回文である");
            }
        }

        return pal;
    }

    //　年齢取得
    public static int getAge(int year, int month, int day) {
        Calendar now = Calendar.getInstance();
        int nowyear = now.get(Calendar.YEAR);
        int nowmonth = now.get(Calendar.MONTH);
        int nowday = now.get(Calendar.DAY_OF_MONTH);
        int age = nowyear - year;
        System.out.println(nowyear); // 2023
        System.out.println(nowmonth); // 3
        System.out.println(nowday); // 20

        if (nowyear > year) {
            if (nowmonth/*3*/ > month) {
                System.out.println( (age) + "歳です");
            } else if (nowmonth == month) {
                if (nowday/*20*/ >= day) {
                    System.out.println( (age) + "歳です");
                } else {
                    System.out.println( (age - 1) + "歳です");
                }
            } else {
                System.out.println( (age - 1) + "歳です");
            }
        } else if (nowyear == year) {
            if (nowmonth/*3*/ > month) {
                System.out.println( (age) + "歳です");
            } else if (nowmonth == month) {
                if (nowday/*20*/ >= day) {
                    System.out.println( (age) + "歳です");
                } else {
                    System.out.println("入力しなおしてください");
                }
            } else {
                System.out.println("入力しなおしてください");
            }
        } else {
            System.out.println("入力しなおしてください");
        }

        return age;

    }

    //　配列のソート
    public static int[] sortArray(int[] array) {

        int[] scores = array;

        for(int i = 0; i < scores.length - 1; i++) {
            for(int j = scores.length - 1; j > 0 + i; j--) {
                if(scores[j-1] > scores[j]) {
                    int tmp = scores[j-1];
                    scores[j-1] = scores[j];
                    scores[j] = tmp;
                }
            }
        }

        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        return scores;

    }

    //　二分探索
    public static int getIndex(int[] index,int num,int start,int end) {

        int[] scores = index;

        int m = (start + end) / 2;

        if (scores[m] == num) {
            num = scores[m];
            System.out.println(num + "　は　" + (m + 1) + "番目の要素です");
            return m;
        } else if (scores[m] < num) {
            start = (m + 1);
            getIndex(scores,num,start,end);
        } else {
            end = (m - 1);
            getIndex(scores,num,start,end);
        }

        return num;

    }


}


