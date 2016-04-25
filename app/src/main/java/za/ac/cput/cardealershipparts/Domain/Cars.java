package za.ac.cput.cardealershipparts.Domain;

import java.io.Serializable;

/**
 * Created by Mnisi Sibusiso 211183164 on 4/17/2016.
 */
public class Cars  implements Serializable {

    private Long id;
    private String Make;
    private String Model;
    private String Colour;
    private String year;
    private String RegistrationNumber;

    public Cars(Builder builder)
    {
        this.id=builder.id;
        this.Make=builder.Make;
        this.Model=builder.Model;
        this.Colour=builder.Colour;
        this.year=builder.year;
        this.RegistrationNumber =builder.RegistrationNumber;
    }

    public Long getId() {
        return id;
    }

    public String getMake() {
        return Make;
    }

    public String getModel() {
        return Model;
    }

    public String getColour() {
        return Colour;
    }

    public String getYear() {
        return year;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }



    public static class Builder {

        private Long id;
        private String Make;
        private String Model;
        private String Colour;
        private String year;
        private String RegistrationNumber;

        public Builder (String RegistrationNumber)
        {
            this.RegistrationNumber = RegistrationNumber;
        }

        public Builder Make(String Make)
        {
            this.Make = Make;
            return this;
        }

        public Builder Model(String Model)
        {
            this.Model = Model;
            return this;
        }

        public Builder Colour(String Colour)
        {
            this.Colour = Colour;
            return this;
        }

        public Builder year(String year)
        {
            this.year = year;
            return this;
        }

        public Builder id(long id)
        {
            this.id = id;
            return this;
        }

        public Builder copy(Cars cars) {

            this.id = cars.id;
            this.Make=cars.Make;
            this.Model=cars.Model;
            this.Colour=cars.Colour;
            this.year=cars.year;
            this.RegistrationNumber=cars.RegistrationNumber;


            return this;
        }

        public Cars build()
        {
            return new Cars(this);
        }


    }

}