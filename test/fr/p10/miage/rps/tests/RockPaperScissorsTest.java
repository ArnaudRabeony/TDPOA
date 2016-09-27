package fr.p10.miage.rps.tests;

import fr.p10.miage.rps.model.RPSEnum;
import fr.p10.miage.rps.model.Result;
import fr.p10.miage.rps.model.RockPaperScissors;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by arrabeon on 27/09/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @DataProvider(name = "winDataProvider")
    public static Object[][] createWinData()
    {
        return new Object[][] {
                {RPSEnum.PAPER, RPSEnum.ROCK},
                {RPSEnum.ROCK, RPSEnum.SCISSORS},
                {RPSEnum.SCISSORS, RPSEnum.PAPER}
        };
    }

    @DataProvider(name = "lostDataProvider")
    public static Object[][] createLostData()
    {
        return new Object[][] {
                {RPSEnum.ROCK, RPSEnum.PAPER},
                {RPSEnum.SCISSORS, RPSEnum.ROCK},
                {RPSEnum.PAPER, RPSEnum.SCISSORS}
        };
    }

    @DataProvider(name = "tieDataProvider")
    public static Object[][] createTieData()
    {
        return new Object[][] {
                {RPSEnum.PAPER, RPSEnum.PAPER},
                {RPSEnum.ROCK, RPSEnum.ROCK},
                {RPSEnum.SCISSORS, RPSEnum.SCISSORS}
        };
    }

    @BeforeClass
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception {
        rps = null;
    }

    @Test(dataProvider = "winDataProvider")
    public void testWinPlay(RPSEnum p1, RPSEnum p2) {
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @Test(dataProvider = "tieDataProvider")
    public void testTiePlay(RPSEnum p1, RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.TIE);
    }

    @Test(dataProvider = "lostDataProvider")
    public void testLostPlay(RPSEnum p1, RPSEnum p2)
    {
        assertEquals(rps.play(p1,p2),Result.LOST);
    }
}