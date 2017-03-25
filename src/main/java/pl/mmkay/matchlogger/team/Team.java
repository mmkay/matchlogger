package pl.mmkay.matchlogger.team;

import pl.mmkay.matchlogger.country.Country;

import javax.persistence.*;

@Entity
@Table(name = "team")
public class Team {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String crestPhoto;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "country_id")
    private Country country;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrestPhoto() {
        return crestPhoto;
    }

    public void setCrestPhoto(String crestPhoto) {
        this.crestPhoto = crestPhoto;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
