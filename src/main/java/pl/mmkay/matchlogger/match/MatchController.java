package pl.mmkay.matchlogger.match;

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
import pl.mmkay.matchlogger.team.TeamRepository;

@Controller
@RequestMapping("/match")
public class MatchController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MatchController.class);

    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private TeamRepository teamRepository;

    @GetMapping("list")
    public String list(Model model)
    {
        setModelAttributes(model);
        return "match/list";
    }

    @PostMapping("add")
    public String addMatch(@ModelAttribute Match match, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            LOGGER.warn("Add team errors: {}", bindingResult.getAllErrors());
        }

        matchRepository.save(match);
        setModelAttributes(model);

        return "match/list";
    }

    private void setModelAttributes(Model model) {
        model.addAttribute("matches", matchRepository.findAll());
        model.addAttribute("teams", teamRepository.findAll());
        model.addAttribute("newMatch", new Match());
    }
}
