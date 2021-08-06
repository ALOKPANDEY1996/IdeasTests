import javafx.util.Pair;

import java.util.Date;

public class HotelSearchEngine {

    public static void main(String args[]){
        HotelManager hotelManager = new HotelManager();
        HotelManager.init();
        Date startDate = new Date(2021,6,25);
        Date endDate =new Date(2021,6,28);
        Pair<Double,Hotel> cheapestHotel = hotelManager.getCheapestHotel(startDate,endDate);
        System.out.println("Cheapest hotel for requested duration is"+cheapestHotel.getValue().getName()
                +"which Costs"+cheapestHotel.getKey());
    }
}
