package pl.mmkay.matchlogger.user;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class UserApiController {
    @RequestMapping("user")
    public User user(@AuthenticationPrincipal User principal) {
        return principal;
    }
}
