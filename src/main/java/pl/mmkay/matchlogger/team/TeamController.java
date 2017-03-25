package pl.mmkay.matchlogger.team;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.mmkay.matchlogger.country.CountryRepository;

@Controller
@RequestMapping("/team")
public class TeamController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TeamController.class);

    @Autowired
    private TeamRepository teamRepository;
    @Autowired
    private CountryRepository countryRepository;

    @GetMapping("list")
    public String list(Model model)
    {
        model.addAttribute("teams", teamRepository.findAll());
        model.addAttribute("allCountries", countryRepository.findAll());
        model.addAttribute("newTeam", new TeamDto());
        return "team/list";
    }

    @PostMapping("add")
    public String addTeam(@ModelAttribute TeamDto teamDto, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            LOGGER.warn("Add team errors: {}", bindingResult.getAllErrors());
        }

        Team team = new Team();
        team.setName(teamDto.getName());
        team.setCountry(countryRepository.findOne(teamDto.getCountryId()));
        team.setCrestPhoto(teamDto.getCrestPhoto());
        teamRepository.save(team);

        model.addAttribute("teams", teamRepository.findAll());
        model.addAttribute("allCountries", countryRepository.findAll());
        model.addAttribute("newTeam", new TeamDto());
        return "team/list";
    }
}
