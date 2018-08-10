/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        long left=1,right=n;
        while(true){
            int a=guess((int)(left+right)/2);
            if(a==0)break;
            else if(a==1) left =(left+right)/2+1;
            else right=(left+right)/2-1;
        }
        return (int)(left+right)/2;
    }
}