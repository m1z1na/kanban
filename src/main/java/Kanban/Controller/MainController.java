package Kanban.Controller;


import Kanban.Model.Scheduler;
import Kanban.Service.EmployeeService;
import Kanban.Service.SchedulerService;
import Kanban.Service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private final EmployeeService employeeService;
    @Autowired
    private final SchedulerService schedulerService;
    @Autowired
    private final TaskService taskService;

    public MainController(EmployeeService employeeService, TaskService taskService, SchedulerService schedulerService) {
        this.employeeService = employeeService;
        this.taskService = taskService;
        this.schedulerService = schedulerService;
    }




    @GetMapping(value = "/calendar")
    public String calendar(Model model) {
        return "calendar";
    }

    @ResponseBody
    @GetMapping(value = "/test")
    public List<Scheduler> test(Model model) {

        return schedulerService.getAll();
    }

    @GetMapping("/login")
    String login2() {
        return "login";
    }
    @GetMapping(value = "/")
    public String index(Model model) {
        model.addAttribute("employee", employeeService.getEmployeeInformation(1L));
        model.addAttribute("todo", 25);
        model.addAttribute("doing", 25);
        model.addAttribute("done", 50);
        model.addAttribute("todotasks", taskService.getAll());
        return "profile";
    }


    @GetMapping(value = "/addtask")
    public String addtask(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "addtask";
    }




    @GetMapping(value = "/profile")
    public String profile(Model model) {
        model.addAttribute("employee", employeeService.getEmployeeInformation(1L));
        model.addAttribute("todo", 25);
        model.addAttribute("doing", 25);
        model.addAttribute("done", 50);
        model.addAttribute("todotasks", taskService.getAll());
        return "profile";
    }

    @GetMapping(value = "/login2")
    public String login( ) {
        return "login";
    }
    @GetMapping(value = "/logout")
    public String logout( ) {
        return "login";
    }
    @GetMapping(value = "/registration")
    public String registration( ) {

        return "registration";
    }

    @PostMapping(value = "/registration")
    public String createUser( ) {

        return "registration";
    }
}
