package RGR.Ggr.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/login")
    public String login (Model model)
    {
        return "login";
    }

    @GetMapping("/messages")
    public String messages (Model model)
    {
        return "messages";
    }

    @GetMapping("/friends")
    public String friends (Model model)
    {
        return "friends";
    }

    @GetMapping("/chat")
    public String chat (Model model)
    {
        return "chat";
    }

    @GetMapping("/profile")
    public String profile (Model model)
    {
        return "profile";
    }

}
