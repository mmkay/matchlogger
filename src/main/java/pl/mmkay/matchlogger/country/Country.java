package pl.mmkay.matchlogger.country;

import javax.persistence.*;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @Column(name = "alpha2_code")
    private String alpha2Code;
    @Column(name = "alpha3_code")
    private String alpha3Code;
    private String fifaCode;
    private String iocCode;
    private String flagPhoto;

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

    public String getAlpha2Code() {
        return alpha2Code;
    }

    public void setAlpha2Code(String alpha2Code) {
        this.alpha2Code = alpha2Code;
    }

    public String getAlpha3Code() {
        return alpha3Code;
    }

    public void setAlpha3Code(String alpha3Code) {
        this.alpha3Code = alpha3Code;
    }

    public String getFifaCode() {
        return fifaCode;
    }

    public void setFifaCode(String fifaCode) {
        this.fifaCode = fifaCode;
    }

    public String getIocCode() {
        return iocCode;
    }

    public void setIocCode(String iocCode) {
        this.iocCode = iocCode;
    }

    public String getFlagPhoto() {
        return flagPhoto;
    }

    public void setFlagPhoto(String flagPhoto) {
        this.flagPhoto = flagPhoto;
    }
}
