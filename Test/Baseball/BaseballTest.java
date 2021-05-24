package Baseball;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BaseballTest {
    @Test
    public void TestTeamName(){
        Team a = new Team("Aチーム");
        Team b = new Team("Bチーム");
        assertEquals("ソフトバンク",a.name);
    }
    @Test
    public void StrikeTest() {
        Team a = new Team("Aチーム");
        Player p1 = new Player();
        p1.strike = 2;
        p1.strikecount(a, p1);
        assertEquals(1, a.out);
    }
}