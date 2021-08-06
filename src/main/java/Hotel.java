
public class Hotel {
    private String Name;
    private double weekDayRate;
    private double weekEndRate;

    public Hotel(String name, double weekDayRate,double weekEndRate){
        this.Name= name;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(double weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public double getWeekEndRate() {
        return weekEndRate;
    }

    public void setWeekEndRate(double weekEndRate) {
        this.weekEndRate = weekEndRate;
    }
}
