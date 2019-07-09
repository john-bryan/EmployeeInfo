package sg.edu.rp.c346.employeeinfo;

public class EmployeeInfo {

    private String name;
    private String job;
    private String salary;

    public EmployeeInfo(String name, String job, String salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getSalary() {
        return salary;
    }

    public void setName(String x) {
        name = x;
    }

    public void setJob(String x) {
        job = x;
    }

    public void setSalary(String x) {
        salary = x;
    }

    @Override
    public String toString() {
        return name + job + salary ;
    }
}
