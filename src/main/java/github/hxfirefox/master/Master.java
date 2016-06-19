package github.hxfirefox.master;

public class Master {
    private final Wage wage;
    private String name;

    public Master(String name, Wage wage) {
        this.name = name;
        this.wage = wage;
    }

    public int pay(int salaryFactor, int bonusFactor) {
        return wage.calcWage(salaryFactor, bonusFactor);
    }

    public String getMasterName() {
        return this.name;
    }
}
