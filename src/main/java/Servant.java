public class Servant {
    private String name;
    private Salary salary;
    private Bonus bonus;

    public Servant(String name, Salary salary, Bonus bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getSalary(int month) {
        return salary.getSalary(month);
    }

    public int getBonus(int month) {
        return bonus.getBonus(month);
    }
}
