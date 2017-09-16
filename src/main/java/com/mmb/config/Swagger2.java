package com.mmb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by hubin on 2017/9/15.
 */
@Configuration
@EnableSwagger2
@EnableWebMvc
public class Swagger2 extends WebMvcConfigurerAdapter {

    @Override   //Swagger2-UI
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.mmb.controller"))
            .paths(PathSelectors.any())
            .build();
    }
    private ApiInfo apiInfo() {
        Contact contact=new Contact("胡彬",
            "https://segmentfault.com/u/mumubin","given.hubin@foxmail.com");
        return new ApiInfoBuilder()
            .title("建筑行业")
            .description("众包平台")
            .contact(contact)
            .version("1.0")
            .build();
    }

}
