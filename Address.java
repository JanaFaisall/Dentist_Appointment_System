public final class Address {

    private String CityName;
    private String StreetName;
    private String buildingNum;

    public Address(String CityName, String StreetName, String buildingNum) {
        this.CityName = CityName;
        this.StreetName = StreetName;
        this.buildingNum = buildingNum;
    }

    public Address() {
        this(null, null, null);
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String CityName) {
        this.CityName = CityName;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String StreetName) {
        this.StreetName = StreetName;
    }

    public String getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(String buildingNum) {
        this.buildingNum = buildingNum;
    }

    @Override
    public String toString() {
        return "City: " + CityName + "\nStreet: " + StreetName + "\nBuilding number: " + buildingNum;
    }

}
