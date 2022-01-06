package ro.puiamarinel.mpbms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ro.puiamarinel.mpbms.service.DemoService;

@Slf4j
@Controller
public class DemoController {

    // == fields ==
    public final DemoService demoService;

    // == constructor ==
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    @GetMapping("demo")
    public String demo(Model model) {
        log.info("method welcome was called");
        model.addAttribute("message", demoService.getMessage());
        return "demo/demo";
    }

}
