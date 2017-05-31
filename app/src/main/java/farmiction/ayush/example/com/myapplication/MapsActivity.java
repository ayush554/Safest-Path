package farmiction.ayush.example.com.myapplication;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.location.Location;
import android.os.AsyncTask;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginException;

import Modules.DirectionFinder;
import Modules.DirectionFinderListener;
import Modules.Route;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, DirectionFinderListener {

    private GoogleMap mMap;
    private Button btnFindPath;
    private EditText etOrigin;
    private EditText etDestination;
    private List<Marker> originMarkers = new ArrayList<>();
    private List<Marker> destinationMarkers = new ArrayList<>();
    private List<Polyline> polylinePaths = new ArrayList<>();
    private ProgressDialog progressDialog;
    int distancevariable;
    String startinglatitude;
    String startinglongitude;
    String endinglatitude;
    String endinglongitude;
    double midlatitude;
    double midlongitude;
    private ArrayList<LatLng> MarkerPoints;
    private MarkerOptions options;
    private ArrayList<String> nameList;
    private ArrayList<Double> locationLatList;
    private ArrayList<Double> locationLngList;
    private String routedistance;
    private ArrayList<LatLng> polylinepoints;
    private ArrayList<Double> polylinelat;
    private ArrayList<Double> polylinelon;
    private int sum;
    private GoogleMap globalMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btnFindPath = (Button) findViewById(R.id.btnFindPath);
        etOrigin = (EditText) findViewById(R.id.etOrigin);
        etDestination = (EditText) findViewById(R.id.etDestination);
        nameList = new ArrayList<>();
        polylinepoints= new ArrayList<>();
        polylinelat= new ArrayList<>();
        polylinelon= new ArrayList<>();
        locationLatList = new ArrayList<>();
        locationLngList = new ArrayList<>();
        btnFindPath.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                sum = 0;
                sendRequest();
            }
        });

    }

    private void sendRequest() {
        globalMap.clear();
        polylinelat.clear();
        polylinelon.clear();
        polylinepoints.clear();
        nameList.clear();
        locationLngList.clear();
        locationLngList.clear();
        String origin = etOrigin.getText().toString();
        String destination = etDestination.getText().toString();
        if (origin.isEmpty()) {
            Toast.makeText(this, "Please enter origin address!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (destination.isEmpty()) {
            Toast.makeText(this, "Please enter destination address!", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            new DirectionFinder(this, origin, destination).execute();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        globalMap = mMap;
        LatLng hcmus = new LatLng(12.970724,79.163611);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(hcmus, 18));
        originMarkers.add(mMap.addMarker(new MarkerOptions()
                .title("Your Current Location")
                .position(hcmus)));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);


    }

    private String getUrl(LatLng origin, String type1) {


        String str_origin = "location=" + midlatitude + "," + midlongitude;
        // Output format
        String output = "json";
        String radius[] = routedistance.split(" ");
        // Building the url to the web service

        String url = "https://maps.googleapis.com/maps/api/place/nearbysearch/" + output + "?" + str_origin + "&radius=" + (Double.parseDouble(radius[0]) * 1000) + "&type=hospital|police|airport|mosque|bus_station|park|church|shopping_mall|fire_station|train_station|zoo|hindu_temple" + "&key=" + getString(R.string.google_maps_key);
        Log.e("URL", "getUrl:" + url);
        Log.e("URL", "getUrl: " + radius[0]);
        return url;
    }


    private class FetchUrl extends AsyncTask<String, Void, String> {

        @Override
        protected String doInBackground(String... url) {

            // For storing data from web service
            String data = "";

            try {
                // Fetching the data from web service
                data = downloadUrl(url[0]);
                Log.d("Background Task data", data.toString());
            } catch (Exception e) {
                Log.d("Background Task", e.toString());
            }
            return data;
        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            try {
                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();
                DataParser dataParser = gson.fromJson(result, DataParser.class);
                List<DataParser.ResultsBean> list = dataParser.getResults();
int x=0;
                for (int i = 0; i < list.size(); i++) {

                    nameList.add(dataParser.getResults().get(i).getName());
                    locationLatList.add(dataParser.getResults().get(i).getGeometry().getLocation().getLat());
                    locationLngList.add(dataParser.getResults().get(i).getGeometry().getLocation().getLng());
                    String type = dataParser.getResults().get(i).getTypes().get(0);
                    Log.e("TYPE OF PLACE BRO", "onPostExecute:"+type );
                    for (int k = 0; k < locationLngList.size(); k++) {
                        options.position(new LatLng(locationLatList.get(k), locationLngList.get(k)));

                       for (int l = 0;l<polylinepoints.size();l++) {
                           //Log.e("LATITUDE", "onPostExecute:" + polylinelat.get(l)+"::"+polylinelon.get(l));
                           final int R = 6371; // Radius of the earth

                           Double latDistance = Math.toRadians(locationLatList.get(k) - polylinelat.get(l));
                           Double lonDistance = Math.toRadians(locationLngList.get(k) - polylinelon.get(l));
                           Double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                                   + Math.cos(Math.toRadians(polylinelat.get(l))) * Math.cos(Math.toRadians(locationLatList.get(k)))
                                   * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
                           Double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
                           double distance = R * c * 1000; // convert to meters

                           //double height = el1 - el2;

                           distance = Math.pow(distance, 2) + Math.pow(0.0, 2);

                           double d = Math.sqrt(distance);
                           if (d<400){
                               options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)).title(nameList.get(k));
                               mMap.addMarker(options);
                               x++;
                               switch (type){
                                   case "hindu_temple":
                                       sum=sum+5;
                                       break;
                                   case "police":
                                       sum=sum+12;
                                       break;
                                   case "hospital":
                                       sum=sum+8;
                                       break;
                                   case "airport":
                                       sum=sum+10;
                                       break;
                                   case "train_station":
                                       sum=sum+9;
                                       break;
                                   case "mosque":
                                       sum=sum+5;
                                       break;
                                   case "bus_station":
                                       sum=sum+8;
                                       break;
                                   case "park":
                                       sum=sum+5;
                                       break;
                                   case "church":
                                       sum=sum+5;
                                       break;
                                   case "shopping_mall":
                                       sum=sum+7;
                                       break;
                                   case"fire_station":
                                       sum=sum+11;
                                       break;
                                   case "zoo":
                                       sum=sum+6;
                                       break;
                               }

                           }
                       }/*


                            Location.distanceBetween(polylinelat.get(l),polylinelon.get(l), locationLatList.get(k),locationLngList.get(k),polyresult);
                            if(polyresult[0]<600){*/

                            //}
                        //}

                    }
                }
                double safe=(Double.valueOf(sum)/Double.valueOf(x*12))*100;
                Toast.makeText(MapsActivity.this, "This Path is "+safe+"% safe", Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    private String downloadUrl(String strUrl) throws IOException {
        String data = "";
        InputStream iStream = null;
        HttpURLConnection urlConnection = null;
        try {
            URL url = new URL(strUrl);

            // Creating an http connection to communicate with url
            urlConnection = (HttpURLConnection) url.openConnection();

            // Connecting to url
            urlConnection.connect();

            // Reading data from url
            iStream = urlConnection.getInputStream();

            BufferedReader br = new BufferedReader(new InputStreamReader(iStream));

            StringBuffer sb = new StringBuffer();

            String line = "";
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            data = sb.toString();
            Log.d("downloadUrl", data.toString());
            br.close();

        } catch (Exception e) {
            Log.d("Exception", e.toString());
        } finally {
            iStream.close();
            urlConnection.disconnect();
        }
        return data;
    }


    @Override
    public void onDirectionFinderStart() {
        progressDialog = ProgressDialog.show(this, "Please wait.",
                "Finding direction..!", true);

        if (originMarkers != null) {
            for (Marker marker : originMarkers) {
                marker.remove();
            }
        }

        if (destinationMarkers != null) {
            for (Marker marker : destinationMarkers) {
                marker.remove();
            }
        }

        if (polylinePaths != null) {
            for (Polyline polyline : polylinePaths) {
                polyline.remove();
            }
        }
    }

    @Override
    public void onDirectionFinderSuccess(List<Route> routes) {
        progressDialog.dismiss();
        polylinePaths = new ArrayList<>();
        originMarkers = new ArrayList<>();
        destinationMarkers = new ArrayList<>();

        for (Route route : routes) {
            double latitude1 = route.startLocation.latitude;
            double longitude1 = route.startLocation.longitude;
            double latitude2 = route.endLocation.latitude;
            double longitude2 = route.endLocation.longitude;


            startinglatitude = String.valueOf(route.startLocation.latitude);
            startinglongitude = String.valueOf(route.startLocation.longitude);
            endinglatitude = String.valueOf(route.endLocation.latitude);
            endinglongitude = String.valueOf(route.endLocation.longitude);

            double dLon = Math.toRadians(longitude2 - longitude1);
            latitude1 = Math.toRadians(latitude1);
            latitude2 = Math.toRadians(latitude2);
            longitude1 = Math.toRadians(longitude1);

            double Bx = Math.cos(latitude2) * Math.cos(dLon);
            double By = Math.cos(latitude2) * Math.sin(dLon);
            double lat3 = Math.atan2(Math.sin(latitude1) + Math.sin(latitude2), Math.sqrt((Math.cos(latitude1) + Bx) * (Math.cos(latitude1) + Bx) + By * By));
            double lon3 = longitude1 + Math.atan2(By, Math.cos(latitude1) + Bx);

            //print out in degrees
            midlatitude = Math.toDegrees(lat3);

            midlongitude = Math.toDegrees(lon3);
            ;
            Log.d("mid point latitude", String.valueOf(midlatitude));
            Log.d("mid point longitude", String.valueOf(midlongitude));
//            Location.distanceBetween(route.startLocation.latitude,route.startLocation.longitude,route.endLocation.latitude,route.endLocation.longitude,distancetomid);
            routedistance = route.distance.text;


            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(route.startLocation, 16));
            ((TextView) findViewById(R.id.tvDuration)).setText(route.duration.text);
            distancevariable = (route.distance.value) / 2;
            ((TextView) findViewById(R.id.tvDistance)).setText(route.distance.text);

            originMarkers.add(mMap.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.start_blue))
                    .title(route.startAddress)
                    .position(route.startLocation)));
            destinationMarkers.add(mMap.addMarker(new MarkerOptions()
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.end_green))
                    .title(route.endAddress)
                    .position(route.endLocation)));

            PolylineOptions polylineOptions = new PolylineOptions().
                    geodesic(true).
                    color(Color.BLUE).
                    width(10);

            for (int i = 0; i < route.points.size(); i++) {
                polylineOptions.add(route.points.get(i));
               polylinepoints.add(route.points.get(i));
                String x = String.valueOf(route.points.get(i));
                String y[] = x.split(",");
                String z[] = y[0].split("\\(");
                String w[] = y[1].split("\\)");
                polylinelat.add (Double.parseDouble(z[1]));
                polylinelon.add(Double.parseDouble(w[0]));
            }

            polylinePaths.add(mMap.addPolyline(polylineOptions));

            LatLng point = new LatLng(midlatitude, midlongitude);
            //mMap.clear();
            MarkerPoints = new ArrayList<>();
            MarkerPoints.add(point);
            options = new MarkerOptions();

            // Setting the position of the marker
            options.position(point);
            options.title("CENTER OF THE PATH");
            options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
            // Add new marker to the Google Map Android API V2
            mMap.addMarker(options);
            LatLng origin = MarkerPoints.get(0);
            String url = getUrl(origin, "police");
            Log.d("onMapClick", url.toString());
            FetchUrl FetchUrl = new FetchUrl();

            // Start downloading json data from Google Directions API
            FetchUrl.execute(url);

        }
    }
}
