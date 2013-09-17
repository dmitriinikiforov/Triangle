package triangle;
/**
 *
 * @author Dmitrii Nikiforov
 */
public class Triangle {
    public static void main(String[] args) {
        int max=1;
        int fst;
        int scnd;
        int thrd;
        int curDivNum;
        int num;
        for (int i=1; max<500 ; i+=2) {
            fst=divNumber(i);
            scnd=divNumber((i+1)/2);
            thrd=divNumber(i+2);
            curDivNum=fst*scnd;
            if (curDivNum>max) {
                max=curDivNum;
                if (max>500) {
                    num=i*(i+1)/2;
                    System.out.println(num);
                }
            }
            curDivNum=scnd*thrd;
            if (curDivNum>max) {
                max=curDivNum;
                if (max>500) {
                    num=(i+1)*(i+2)/2;
                    System.out.println(num);
                }
            }
        }
    }
    //method counts the number of divisors of an integer
    public static int divNumber(int num) {
        int divNum=0;
        int square=(int) Math.sqrt(num);
        for (int i=1; i<=square; i++) {
            if (num%i==0) divNum+=2;
        }
        if (square*square==num) divNum--;
        return divNum;
    }
}
