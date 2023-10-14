package calculators.combinatorics;


public class СalculatorOfCombinatorics {

    public static long getFactorial(int n){

    long result = 1l;
    if((n == 1)){
        return result;
    }
        result = n * getFactorial(n-1);

        return result;
    }

    public static long getP(int n){
        return getFactorial(n);
    }

    public static long getA(int n, int k){
        return getFactorial(n)/getFactorial(n-k);
    }

    public static long getC(int n, int k){
        long result = getFactorial(n)/(getFactorial(k) * getFactorial(n-k));
        return result;
    }

}
