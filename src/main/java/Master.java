public class Master {
    private final Wage wage;

    public Master(Wage wage) {
        this.wage = wage;
    }

    public int pay(int salaryFactor, int bonusFactor) {
        return wage.calcWage(salaryFactor, bonusFactor);
    }
}
