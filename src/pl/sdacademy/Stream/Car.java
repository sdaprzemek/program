package pl.sdacademy.Stream;

public class Car {
    String marka;
    String model;
    String kolor;
    Integer predkosc;

    public Car(String marka, String model, String kolor, Integer predkosc) {
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.predkosc = predkosc;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public Integer getPredkosc() {
        return predkosc;
    }

    public void setPredkosc(Integer predkosc) {
        this.predkosc = predkosc;
    }
}
