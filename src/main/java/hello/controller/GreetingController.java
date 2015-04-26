package hello.controller;

import hello.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by anshulsharma on 24/04/15.
 */

@Controller
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public
    @ResponseBody
    String greeting(@RequestParam(value = "name", required = true, defaultValue = "Anshul") String name, Model model) {
        model.addAttribute("name", name);
        return greetingService.getGreeting("Anshul");
    }

}
