package de.sdspring.test;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

  // tag::customLoginViewController[]
  @Override
  public void addViewControllers(ViewControllerRegistry registry) {
    registry.addViewController("/").setViewName("home");
    registry.addViewController("/abc").setViewName("home");
    registry.addViewController("/login").setViewName("login");
    
    //    registry.addViewController("/booklist").setViewName("booklist");
  }
  // end::customLoginViewController[]

}
