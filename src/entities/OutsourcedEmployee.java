package entities;

public class OutsourcedEmployee extends Employee{
    
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hoursWorked, Double valuePerHours, Double additionalCharge) {
        super(name, hoursWorked, valuePerHours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        Double payment = super.payment();
        double addition = additionalCharge * 1.1;
        return payment + addition;
    }   
}
