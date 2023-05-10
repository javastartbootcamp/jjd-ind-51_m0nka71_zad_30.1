package pl.javastart.validationtask;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("formData", new RegisterFormDto());
        return "home";
    }

    @PostMapping("/register")
    public String register(Model model, @Valid @ModelAttribute("formData")RegisterFormDto registerFormDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("formData", registerFormDto);
            return "redirect:/";
        }
        return "success";
    }

    @GetMapping("/sukces")
    public String success() {
        return "success";
    }
}
