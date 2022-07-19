package entities;

public class Employee {
    
    private String name;
    private Integer hoursWorked;
    private Double valuePerHours;

    public Employee() {}

    public Employee(String name, Integer hoursWorked, Double valuePerHours) {
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }

    public Double payment() {
        return hoursWorked * valuePerHours;
    }
}
