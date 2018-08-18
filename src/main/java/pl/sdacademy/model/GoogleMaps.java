package pl.sdacademy.model;

public class GoogleMaps {
    private String address;
    private double lat;
    private double lng;
    private String formatted_address;

    public GoogleMaps() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getFormatted_address() {
        return formatted_address;
    }

    public void setFormatted_address(String formatted_address) {
        this.formatted_address = formatted_address;
    }

    @Override
    public String toString() {
        return "Wyszukiwane miejsce \n" +
                "wpisana fraza = " + address + "\n" +
                "szerokość = " + lat + "\n" +
                "długość = " + lng + "\n" +
                "adres: " + formatted_address;
    }
}
