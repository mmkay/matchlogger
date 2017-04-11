package pl.mmkay.matchlogger.match;

import pl.mmkay.matchlogger.team.Team;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "match")
public class Match {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "first_team_id")
    private Team firstTeam;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "second_team_id")
    private Team secondTeam;
    private LocalDateTime matchDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Team getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(Team firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Team getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(Team secondTeam) {
        this.secondTeam = secondTeam;
    }

    public LocalDateTime getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDateTime matchDate) {
        this.matchDate = matchDate;
    }
}
