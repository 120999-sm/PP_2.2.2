package web.model;

public class Car {
    private String brand;
    private String model;
    private String yearOfRelease;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public Car() {

    }

    public Car (String brand,String model,String yearOfRelease) {
        this.brand = brand;
        this.model =model;
        this.yearOfRelease =yearOfRelease;
    }

    @Override
    public String toString() {
        return "Автомобиль - [ " +
                "Бренд: " + brand +
                ", Модель: " + model +
                ", Год выпуска: " + yearOfRelease +
                " ]";
    }
}
