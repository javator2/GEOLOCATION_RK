package pl.sdacademy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MapsService placeService = new MapsService("https://maps.googleapis.com/maps/api/geocode/json");
        String key = "AIzaSyA5RvGFoANDoau5hHclkS_SAgNILjfJONI";

        System.out.println("Podaj miejsce, którego wyszukać współrzędne: ");
        Scanner fraza = new Scanner(System.in);
        String addressplace = fraza.nextLine();

        //String addressplace = "Plac Rapackiego Toruń";

        System.out.println(placeService.getCoordinate(addressplace, key));
    }
}
