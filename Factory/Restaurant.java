import RestaurantFactory.RestaurantAbstractFactory;
import RestaurantFactory.RestaurantFactoryProducer;

public class Restaurant {
    public static void main(String[] args) {
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        RestaurantAbstractFactory restaurantAbstractFactory2 = restaurantFactoryProducer.getRestaurantAbstractFactory(2);
        RestaurantAbstractFactory restaurantAbstractFactory = restaurantFactoryProducer.getRestaurantAbstractFactory(1);
        System.out.println(restaurantAbstractFactory.getFastFood("hamburguer"));
        System.out.println(restaurantAbstractFactory1.getDrink("soda"));
        System.out.println(restaurantAbstractFactory2.getDrink("soda"));
    }    
}