package za.ac.cput.cardealershipparts.Domain;

import java.io.Serializable;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class CarDealerShipShop implements Serializable{
    Long id;
    String dealerShopName;
    String location;
    String carAvailable;


    public Long getId() {return id;}

    public String getDealerShopName() {
        return dealerShopName;
    }

    public String getLocation() {return location;}

    public String getCarAvailable() {
        return carAvailable;
    }


    public CarDealerShipShop(Builder cars) {

        this.location = cars.location;
        this.dealerShopName=cars.dealerShopName;
        this.carAvailable=cars.carAvailable;
        this.id =cars.id;
    }



    public static class Builder {
        String dealerShopName;
        String location;
        String carAvailable;
        Long id;

        public Builder(String dealerShopName) {
            this.dealerShopName = dealerShopName;
        }

        public Builder location(String location) {
            this.location = location;
            return this;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder carAvailable(String carAvailable) {
            this.carAvailable = carAvailable;
            return this;
        }

        public Builder copy(CarDealerShipShop cars) {

            this.dealerShopName = cars.dealerShopName;
            this.location=cars.location;
            this.carAvailable=cars.carAvailable;
            this.id=cars.id;
            return this;
        }

        public CarDealerShipShop build()
        {
            return new CarDealerShipShop(this);
        }
    }

}
