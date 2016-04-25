package za.ac.cput.cardealershipparts.Domain;

import java.io.Serializable;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class Department implements Serializable{
    String buildName;
    String Street;
    String Area;
    String Floor;

    public String getBuildName() {
        return buildName;
    }

    public String getStreet() {
        return Street;
    }

    public String getArea() {
        return Area;
    }

    public String getFloor() {
        return Floor;
    }


    public Department(Builder cars) {

        this.buildName = cars.buildName;
        this.Street=cars.Street;
        this.Area=cars.Area;
        this.Floor=cars.Floor;
    }



    public static class Builder {
        String buildName;
        String Street;
        String Area;
        String Floor;


        public Builder (String buildName)
        {
            this.buildName = buildName;
        }

        public Builder Street(String Street)
        {
            this.Street = Street;
            return this;
        }

        public Builder Area(String Area)
        {
            this.Area = Area;
            return this;
        }

        public Builder Floor(String Floor)
        {
            this.Floor = Floor;
            return this;
        }


        public Builder copy(Department cars) {

            this.buildName = cars.buildName;
            this.Street=cars.Street;
            this.Area=cars.Area;
            this.Floor=cars.Floor;
            return this;
        }

        public Department build()
        {
            return new Department(this);
        }
    }
}
