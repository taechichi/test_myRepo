package com.example.demo;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class PersonController {

    // 이거 service 안하면 에러남..
    private final PersonService personService;

    @GetMapping({"test"})
    public String test() {
        log.debug("test Method Passed");

        personService.test();

        return "redirect:/";
    }

    @GetMapping({"save"})
    public String save() {
        log.debug("save Method Passed");
        return "save";
    }

    @PostMapping({"saveInfo"})
    public String saveInfo(
            @ModelAttribute PersonDTO personDTO
    ) {
        log.debug("saveInfo Method Passed");

        personService.personInfo(personDTO);
        return "redirect:/";
    }
}
