package org.jl.jlhellospringbootstarterconfigure.auto;

import org.jl.jlhellospringbootstarterconfigure.bean.HelloProperties;
import org.jl.jlhellospringbootstarterconfigure.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 纪磊
 * 2022/6/3 23:19
 * HelloServiceConfigure
 * 用途:
 * 版本： 1.0
 */

@Configuration
@EnableConfigurationProperties(HelloProperties.class)//默认helloProperties放在容器中
public class HelloServiceConfiguration {

    @ConditionalOnMissingBean(HelloService.class)
    @Bean
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        return helloService;
    }
}
