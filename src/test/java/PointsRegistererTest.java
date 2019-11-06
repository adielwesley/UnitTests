import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PointsRegistererTest {

    private User user;
    private BonusCalculator bonusCalculator;
    private PointsRegisterer registerer;

    @Test
    public void giveLike_NotVipUserAndNoDailyPoints_shouldRegister2() {
        registerer.giveLike(user);
        Assert.assertEquals(2, user.getPoints());
    }

    @Test
    public void giveLike_NotVipUserAndHasDailyPointsEquals2_shouldRegister4() {
        bonusCalculator.setDailyBonus(2);
        registerer.giveLike(user);
        Assert.assertEquals(4, user.getPoints());
    }

    @Test
    public void giveLike_VipUserAndNoDailyPoints_shouldRegister10() {
        user.setVip(true);
        registerer.giveLike(user);
        Assert.assertEquals(10, user.getPoints());
    }

    @Test
    public void giveLike_VipUserAndHasDailyPointsEquals2_shouldRegister20() {
        user.setVip(true);
        bonusCalculator.setDailyBonus(2);
        registerer.giveLike(user);
        Assert.assertEquals(20, user.getPoints());
    }

    @Before
    public void setUp() {
        user = new User("George");
        bonusCalculator = new BonusCalculator();
        registerer = new PointsRegisterer(bonusCalculator);
    }

    @Test
    public void createCommentary_NotVipUserAndNoDailyPoints_shouldRegister3() {
        registerer.createCommentary(user);
        Assert.assertEquals(3, user.getPoints());
    }

    @Test
    public void createCommentary_NotVipUserAndHasDailyPointsEquals2_shouldRegister6() {
        bonusCalculator.setDailyBonus(2);
        registerer.createCommentary(user);
        Assert.assertEquals(6, user.getPoints());
    }

    @Test
    public void createCommentary_VipUserAndNoDailyPoints_shouldRegister15() {
        user.setVip(true);
        registerer.createCommentary(user);
        Assert.assertEquals(15, user.getPoints());
    }

    @Test
    public void createCommentary_VipUserAndHasDailyPointsEquals2_shouldRegister30() {
        user.setVip(true);
        bonusCalculator.setDailyBonus(2);
        registerer.createCommentary(user);
        Assert.assertEquals(30, user.getPoints());
    }

    @Test
    public void createTopic_NotVipUserAndNoDailyPoints_shouldRegister5() {
        registerer.createTopic(user);
        Assert.assertEquals(5, user.getPoints());
    }

    @Test
    public void createTopic_NotVipUserAndHasDailyPointsEquals2_shouldRegister10() {
        bonusCalculator.setDailyBonus(2);
        registerer.createTopic(user);
        Assert.assertEquals(10, user.getPoints());
    }

    @Test
    public void createCommentary_VipUserAndNoDailyPoints_shouldRegister25() {
        user.setVip(true);
        registerer.createTopic(user);
        Assert.assertEquals(25, user.getPoints());
    }

    @Test
    public void createTopic_VipUserAndHasDailyPointsEquals2_shouldRegister50() {
        user.setVip(true);
        bonusCalculator.setDailyBonus(2);
        registerer.createTopic(user);
        Assert.assertEquals(50, user.getPoints());
    }

}
