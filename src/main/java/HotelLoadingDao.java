import java.util.ArrayList;
import java.util.List;

public class HotelLoadingDao {

    public static List<Hotel> getHotelList(){
        List<Hotel> hotelList = new ArrayList<Hotel>();
        hotelList.add(new Hotel("Miami Beach",80.0,110.0));
        hotelList.add(new Hotel("Miami Downtown",120.0,90.0));
        hotelList.add(new Hotel("Miami Midtown",100.0,150.0));
        return hotelList;
    }
}
