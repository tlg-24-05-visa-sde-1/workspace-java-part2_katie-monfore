package com.entertainment;

import java.util.Objects;

public class Television implements Comparable<Television> {
    // FIELDS or INSTANCE VARIABLES (same same)
    private String brand;
    private int volume;

    //TELEVISION HAS-A TUNER (for all things related to channel changing)
    private final Tuner tuner = new Tuner(); // instantiated internally, NOT exposed

    //CONSTRUCTORS
    public Television() {
        super();
    }

    public Television(String brand, int volume) {
        super();
        setBrand(brand);
        setVolume(volume);
    }

    //BUSINESS OR ACTION METHODS
    public int getCurrentChannel() {
        return tuner.getChannel(); //delegate to contained Tuner object

    }

    public void changeChannel(int channel) {
        tuner.setChannel(channel);  //delegate to contained Tuner object
    }

    // ACCESSOR METHODS //
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != this.getClass()) return false;
        Television other = (Television) obj;
        return getVolume() == other.getVolume() && Objects.equals(getBrand(), other.getBrand());
    }

    @Override
    public int compareTo(Television o) {
        return 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getVolume());
    }

    @Override
    public String toString() {
        return String.format("%s: brand=%s, volume=%s, currentChannel=%s",
                getClass().getSimpleName(), getBrand(), getVolume(), getCurrentChannel());
    }
}
