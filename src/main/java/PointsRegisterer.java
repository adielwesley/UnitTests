public class PointsRegisterer {

    private BonusCalculator bonusCalculator;

    public PointsRegisterer (BonusCalculator bonusCalculator) {
        this.bonusCalculator = bonusCalculator;
    }

    public void giveLike(User user) {
        user.setPoints(user.getPoints() + 2*bonusCalculator.getBonus(user));
    }

    public void createCommentary(User user) {
        user.setPoints(user.getPoints() + 3*bonusCalculator.getBonus(user));
    }

    public void createTopic(User user) {
        user.setPoints(user.getPoints() + 5*bonusCalculator.getBonus(user));
    }
}
