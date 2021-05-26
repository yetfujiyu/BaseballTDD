package Baseball;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BaseballTest {
    @Test
    public void TestTeamName(){
        Team a = new Team("Aチーム");
        Team b = new Team("Bチーム");
        assertEquals("Aチーム",a.name);
    }

    @Test
    public void StrikeTest() {
        Team a = new Team("Aチーム");
        Player player1 = new Player(0,0,0);
        player1.strike = 2;
        player1.strilecount(a);
        assertEquals(1, a.out);
    }

//    @Test 必要なくなった
//    public void BallTest() {
//        Team a = new Team("Aチーム");
//        Player player1 = new Player(0,0,0);
//        player1.ball = 3;
//        player1.ballcount(a);
//        assertEquals(1, player1.hit);
//    }



    @Test
    public void HitTest(){
        Team a = new Team("Aチーム");
        Player player1 = new Player(0,0,0);
        player1.hitcount(a);
        assertEquals(1, a.score);
    }

    @Test
    public void RunTest(){
        Team a = new Team("Aチーム");
        Team b = new Team("Bチーム");
        Player player1 = new Player(0,0,0);
        a.score = 0;
        b.score = 0;
        Team.base[2] = true;
        player1.hitcount(a);
        assertEquals(1,a.score);
        System.out.println(Team.base[0]);
        System.out.println(Team.base[1]);
        System.out.println(Team.base[2]);
    }

    @Test
    public void FourBall(){
        Team teamA = new Team("Aチーム");
        Player player1 = new Player(0,0,0);
        player1.ball = 3;
        player1.ballcount(teamA);
        assertTrue(Team.base[0]);
    }
}