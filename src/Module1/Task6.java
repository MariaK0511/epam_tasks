package Module1;

public class Task6 {
    /*6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров молока
    в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?. */
    public static  void main ( String [] args){
        int n = 4;
        double nSum = 80;
        int m = 6;
        double mDifferencePerOne = 12.0;
        double mSum = m * (mDifferencePerOne + (nSum / n));
        System.out.println(" при n = " + n + "," + " m = " + m + " mSum = " + mSum );


    }
}
