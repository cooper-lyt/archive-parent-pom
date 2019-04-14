package cc.coopersoft.archives.room;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringCloudApplication
@EnableEurekaClient
@EnableResourceServer
public class Application {


    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
