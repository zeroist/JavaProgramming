package restaurantTask;
public class Chef {
    private String name;
    private int employeeId;
    private double hourlyRate;
    private boolean isFullTime;
    public Chef(String name, int employeeId, double hourlyRate, boolean isFullTime) {
        setName(name);
        setEmployeeId(employeeId);
        setHourlyRate(hourlyRate);
        setFullTime(isFullTime);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    public boolean isFullTime() {
        return isFullTime;
    }
    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
    public void makeOrder(){
        System.out.println(name+" is making an order");
    }
    public void washDishes(){
        System.out.println(name+" is washing the dishes");
    }
    @Override
    public String toString() {
        return "Chef{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", isFullTime=" + (isFullTime?"full-time":"part-time") +
                '}';
    }
}
