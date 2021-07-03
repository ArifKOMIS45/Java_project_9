package School;

import java.util.ArrayList;

public class SchoolLocation {
    private static ArrayList<String> locationList= new ArrayList<>();
    private  String price, location;

    public SchoolLocation(String location) throws Exception {

        addLocation();
        setLocationList(location);
        setPrice(location);
    }

    public static void addLocation() {
        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
    }

    public static ArrayList<String> getLocationList() {
        return locationList;
    }

    public void setSchoolLocation(String location) {
        this.location = location;
    }

    public String setPrice(String location) throws Exception {
        if (location.equalsIgnoreCase("USA")) this.price = "$8000";
        else if (location.equalsIgnoreCase("England")) this.price = "$6500";
        else if (location.equalsIgnoreCase("France")) this.price = "$7200";
        else if (location.equalsIgnoreCase("Germany")) this.price = "$7000";
        else if (location.equalsIgnoreCase("Canada")) this.price = "$7500";
        else throw new Exception("This is not a valid location");
        return price;
    }

    public String getPrice() {
        return price;
    }

    public void setLocationList(String SchoolLocation) throws Exception {
        ArrayList<String> listOfLocations = getLocationList();
        if (listOfLocations.contains(SchoolLocation)) this.location = SchoolLocation;
        else throw new Exception("Location should be one of the following" + listOfLocations);

    }

    public String getLocation() {
        return location;
    }


}
