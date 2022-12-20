package Kanban.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/profile").setViewName("profile");
        registry.addViewController("/").setViewName("profile");
        registry.addViewController("/calendar").setViewName("calendar");
        registry.addViewController("/addtask").setViewName("addtask");
    }

}