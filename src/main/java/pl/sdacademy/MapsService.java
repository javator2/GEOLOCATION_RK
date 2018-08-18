package pl.sdacademy;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import pl.sdacademy.model.GoogleMaps;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.Charset;

public class MapsService {
    private String finalUrl;

    public MapsService(String url) {
        finalUrl = url;
    }

    public GoogleMaps getCoordinate(String address, String key){
        GoogleMaps place = new GoogleMaps();
        String encodeUrl = null;

        try {
            encodeUrl = URLEncoder.encode(address, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        String reqUrl = finalUrl + "?address=" + encodeUrl + "&key=" + key;

        JSONObject json = null;
        try {
            json = new JSONObject(IOUtils.toString(new URL(reqUrl), Charset.forName("UTF-8")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        place.setAddress(address);
        place.setLat(json.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lat"));
        place.setLng(json.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getDouble("lng"));
        place.setFormatted_address(json.getJSONArray("results").getJSONObject(0).getString("formatted_address"));


        //json.getJSONArray("results").getJSONObject(0).getJSONObject("geometry").getJSONObject("location").getJSONObject("lat");

        return place;
    }
}
