public class BonusCalculator {

    private int dailyBonus = 1;
    private int vipBonus = 5;

    public BonusCalculator() {

    }

    public BonusCalculator(int dailyBonus) {
        this.dailyBonus = dailyBonus;
    }

    public int getBonus(User user) {
        int bonus = dailyBonus;
        if(user.isVip())
            bonus *= vipBonus;
        return bonus;
    }

    public int getDailyBonus() {
        return dailyBonus;
    }

    public void setDailyBonus(int dailyBonus) {
        this.dailyBonus = dailyBonus;
    }
}
