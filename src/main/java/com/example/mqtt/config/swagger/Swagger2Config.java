package com.example.mqtt.config.swagger;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author: Create by gsy
 * @Date: Create in 2020/4/3 10:41
 * @Description: swagger2Config
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Value ("${spring.port}")
    private String port;

    @Bean
    public Docket createRestApi() {

//        ParameterBuilder ticketPar = new ParameterBuilder();
//        List<Parameter> pars = new ArrayList<Parameter> ();
//        ticketPar.name("Authorization").description("user ticket")
//                .modelRef(new ModelRef ("string")).parameterType("header")
//                //header中的ticket参数非必填，传空也可以
//                .required(true).build();
//        //根据每个方法名也知道当前方法在设置什么参数
//        pars.add(ticketPar.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //为当前包路径
                .apis(RequestHandlerSelectors.basePackage("com.example.mqtt.controller"))
                .paths(PathSelectors.any())
                .build();
//                .globalOperationParameters(pars);
    }

    /**
     * 构建 api文档的详细信息函数,注意这里的注解引用的是哪个
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder ()
                //页面标题
                .title("接口文档")
                //创建人
                .contact(new Contact ("gushiyu", "http://localhost:" + port, "***"))
                //版本号
                .version("1.0")
                //描述
                .description("API 描述")
                .build();
    }
}
