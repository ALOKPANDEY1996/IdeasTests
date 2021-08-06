import javafx.util.Pair;

import java.util.Date;
import java.util.List;

public class HotelManager {
    static List<Hotel> availableHotels;

    public static void init(){
        availableHotels = HotelLoadingDao.getHotelList();

    }

    public Pair<Double,Hotel> getCheapestHotel(Date startDate,Date endDate){
        long weekends = countWeekendDays(startDate,endDate);
        long weekDays = (endDate.getTime() - startDate.getTime())/(1000*60*60*24);
        Pair<Double,Hotel> minCostHotel = new Pair<Double, Hotel>(Double.MAX_VALUE,availableHotels.get(0));
        for (Hotel hotel: availableHotels
             ) {
            Double cost = hotel.getWeekDayRate()*weekDays + hotel.getWeekEndRate()*weekends;
            if(cost<minCostHotel.getKey())
                minCostHotel = new Pair<Double, Hotel>(cost,hotel);
        }
        return minCostHotel;
    }

    private long countWeekendDays(Date startDate,Date endDate){
        int weekends=0;
        while (startDate.compareTo(endDate)<=0){
            if(startDate.getDay() ==0 ||startDate.getTime() ==6)
                weekends++;
            startDate.setDate(startDate.getDate()+1);
        }
        return weekends;
    }
}
