import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RestaurantService {
    private static final List<Restaurant> restaurants = new ArrayList<>();

    public Restaurant findRestaurantByName(String restaurantName) throws restaurantNotFoundException {
        for(Restaurant search_restaurant:restaurants){
            if(Objects.equals(search_restaurant.getName(), restaurantName)){
                return search_restaurant;
            }
        }
        //DELETE ABOVE STATEMENT AND WRITE CODE HERE
        restaurantNotFoundException restaurantNotFoundException;
        throw restaurantNotFoundException=new restaurantNotFoundException(restaurantName);
    }


    public Restaurant addRestaurant(String name, String location, LocalTime openingTime, LocalTime closingTime) {
        Restaurant newRestaurant = new Restaurant(name, location, openingTime, closingTime);
        restaurants.add(newRestaurant);
        return newRestaurant;
    }

    public Restaurant removeRestaurant(String restaurantName) throws restaurantNotFoundException {
        Restaurant restaurantToBeRemoved = findRestaurantByName(restaurantName);
        restaurants.remove(restaurantToBeRemoved);
        return restaurantToBeRemoved;
    }

     public List<Restaurant> getRestaurants() {
        return restaurants;
    }


}
