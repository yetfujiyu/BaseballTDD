package Baseball;

import java.util.Random;
public class Player{
    int ball = 0;
    int strike = 0;
    int hit = 0;
    int result = 0;
    Player(int ball, int strike, int hit){
        this.ball = ball;
        this.strike = strike;
        this.hit = hit;
    }
    String[] atbatResult = {"ball","strike","out", "hit"};
    public void atbatA(Team a){
        Random rad = new Random();//0:ball 1:strike 2:out 3:hit
        result = rad.nextInt(4);
        switch (result){
            case 0:
                this.ball++;
                if(this.ball >=4){
                    this.ball = 0;
                    this.hit++;
                };
                break;
            case 1:
                this.strike++;
                if(this.strike >=3){
                    this.strike = 0;
                    this.ball = 0;
                    a.out++;
                }
                break;
            case 2:
                a.out++;
                this.ball = 0;
                this.strike = 0;
                break;
            case 3:
                this.hit++;
                if(this.hit >=4){
                    a.scoreA++;
                }
                this.ball = 0;
                this.strike = 0;
                break;
        }
        System.out.println("結果：" + atbatResult[result]);
        System.out.println("ボール：" + this.ball);
        System.out.println("ストライク：" + this.strike);
        System.out.println("アウト：" + a.out);
    }
    public void atbatB(Team b){
        Random rad = new Random();//0:ball 1:strike 2:out 3:hit
        result = rad.nextInt(4);
        switch (result){
            case 0:
                this.ball++;
                if(this.ball >=4){
                    this.ball = 0;
                    this.hit++;
                };
                break;
            case 1:
                this.strike++;
                if(this.strike >=3){
                    this.strike = 0;
                    this.ball = 0;
                    b.out++;
                }
                break;
            case 2:
                b.out++;
                this.ball = 0;
                this.strike = 0;
                break;
            case 3:
                this.hit++;
                if(this.hit >=4){
                    b.scoreB++;
                }
                this.ball = 0;
                this.strike = 0;
                break;
        }
        System.out.println("結果：" + atbatResult[result]);
        System.out.println("ボール：" + this.ball);
        System.out.println("ストライク：" + this.strike);
        System.out.println("アウト：" + b.out);
    }
}