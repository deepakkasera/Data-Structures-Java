package Algorithm;

import java.math.BigDecimal;
import java.util.*;
import java.math.BigInteger;

/**
 * Created by deepak on 14/7/17.
 */
public class EXPTREE {

    public static BigInteger gcd(BigInteger a,BigInteger b){
        if(b.longValue() == 0){
            return a;
        }
        return gcd( b , a.mod(b));
    }

    public static BigInteger modExpItr(BigInteger x,BigInteger n,BigInteger modulo) {
        BigInteger result = BigInteger.valueOf(1),y;
        System.out.println("n value " + n);
        System.out.println("x value " + x);
        while(n.longValue() > 0){
            if(n.mod(BigInteger.valueOf(2))==BigInteger.valueOf(1)){
                y = result.multiply(x);
                result = y;
                y = result.mod(modulo);
                result = y;
                System.out.println("result value " + result);
            }
            System.out.println("n value after " + n);
            n = n.divide(BigInteger.valueOf(2));
            System.out.println("result value " + result);
            y = x.multiply(x);
            x = y.mod(modulo);
        }
        System.out.println("result " + result);
        return result.mod(modulo);
    }

    public static  BigInteger mod1 = BigInteger.valueOf(1000000000+7);
    public static  BigInteger mod2 = BigInteger.valueOf(1000000000+9);
    public static  BigInteger mod3 = BigInteger.valueOf(1000000000+5);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases;
        testCases = sc.nextInt();
        while(testCases != 0){
            BigInteger n;
            n = sc.nextBigInteger();
            if(n.longValue() == 1) {
                System.out.println("0 0");
            }
            else{
//                System.out.println(gcd(BigInteger.valueOf(10),BigInteger.valueOf(30)));
              System.out.println("power " + modExpItr(BigInteger.valueOf(2),BigInteger.valueOf(3),BigInteger.valueOf(3)));
                BigInteger numerator1,numerator2,x,y;
                x = n.add(BigInteger.valueOf(-1));
                y = n.multiply(BigInteger.valueOf(2));
//                System.out.println("x " + x);
                numerator1 = n.multiply(x).divide(new BigInteger("2"));
//              numerator1 = numerator1.divide(BigInteger.valueOf(2));
                System.out.println(numerator1 + " num1");
//                numerator2 = n.multiply(n.add(BigInteger.valueOf(-1)));
                numerator2 = n.multiply(x).divide(BigInteger.valueOf(2));
                System.out.println(numerator2 + " num2");
//                numerator2 = numerator1.divide(BigInteger.valueOf(2));
                System.out.println(numerator2 + " num2");
                BigInteger denominator1,denominator2;
                denominator1 = y.add(BigInteger.valueOf(-3));
                denominator2 = y.add(BigInteger.valueOf(-3));
                System.out.println("den1 " + denominator1);
                System.out.println("den2 " + denominator2);
                BigInteger gcd1 = gcd(numerator1,denominator1);
                BigInteger gcd2 = gcd(numerator2,denominator2);
                numerator1.divide(gcd1);
                denominator1.divide(gcd1);
                numerator2.divide(gcd2);
                denominator2.divide(gcd2);
                BigInteger result1,result2;
                result1 = (numerator1.multiply(modExpItr(denominator1,mod3,mod1))).mod(mod1);
                result2 = (numerator2.multiply(modExpItr(denominator1,mod1,mod2))).mod(mod2);
                System.out.print(result1 + " " + result2);
                System.out.println();
                testCases-=1;
            }
        }

    }
}
