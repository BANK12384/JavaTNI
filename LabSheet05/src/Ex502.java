import javax.swing.*;

public class Ex502 {
    public static  int  intput_score(String massage , int limit_score){
        int score = Integer.parseInt(JOptionPane.showInputDialog(massage));
        while(score < 0 || score > limit_score){
            score = Integer.parseInt(JOptionPane.showInputDialog("Score must be in range between 0 and "
                    +limit_score+"\n"+massage));
        }
        return score;
    }
    public static  int cal_score(int Midterm, int Final){
        return  Midterm+Final;
    }

    public static  boolean  is_pass(int score){
        return score >= 50 ;
    }

    static void main(String[] args) {
        int Midtrem = intput_score("Enter midterm-score: ",35);
        int Final = intput_score("Enter final-score: ",65);

        JOptionPane.showMessageDialog(null, "Your score is "
                +cal_score(Midtrem,Final)
                +"\nYour result is "+(is_pass(cal_score(Midtrem,Final))?"PASS":"FAIL"
        ));
    }
}
