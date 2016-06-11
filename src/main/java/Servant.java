public class Servant {
    private String name;
    private Salary salary;
    private Bouns bouns;

    public Servant(String name, Salary salary, Bouns bouns) {
        this.name = name;
        this.salary = salary;
        this.bouns = bouns;
    }

    public int getSalary(int month) {
        return salary.getSalary(month);
    }
}
