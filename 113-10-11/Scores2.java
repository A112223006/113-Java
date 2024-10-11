

import java.util.Arrays;

public class Scores2 {
    public static void main(String[] args) { //設定初始值
        int[] scores = new int[10];
        
        for(int s : scores) {   //for(int i =0; i<scores.length; i++)(做的事)
            System.out.printf("%2d", s);
        }
        System.out.println();

        Arrays.fill(scores, 60);
        for(int score : scores) {
            System.out.printf("%3d", score);
        }

        System.out.println();
        for(int i = 0; i<scores.length;i++ ) {
            scores[i] -= 30;
        }
        for(int score : scores) {
            System.out.printf("%3d", score);
        }

    }
}