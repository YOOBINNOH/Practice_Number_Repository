package Practice_number_repository.Practice_number_repository.controller;




import Practice_number_repository.Practice_number_repository.dto.Integration_member;
import Practice_number_repository.Practice_number_repository.dto.Join_member;
import Practice_number_repository.Practice_number_repository.dto.login_member;
import Practice_number_repository.Practice_number_repository.dto.test_member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controllers {



    @GetMapping("home")
    public String home(){
        return "index";
    }

    @GetMapping("login")
    public String login(){
        return "login";
    }

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("join")
    public String join(){
        return "join";
    }




    @PostMapping("join_register")
    public String join_register(Join_member join){
        join.add_number();
        return "redirect:/";


    }

    @PostMapping("login_register")
    public String login_register(login_member form){
        System.out.println(form.toString());
        return "";
    }

    @PostMapping("test_register")
    public String test_register(test_member form){
        System.out.println(form.toString());
        return "";
    }









}
