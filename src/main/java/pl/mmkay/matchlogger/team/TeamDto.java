package pl.mmkay.matchlogger.team;

public class TeamDto {
    private String name;
    private int countryId;
    private String crestPhoto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getCrestPhoto() {
        return crestPhoto;
    }

    public void setCrestPhoto(String crestPhoto) {
        this.crestPhoto = crestPhoto;
    }
}
