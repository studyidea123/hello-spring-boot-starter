package org.jl.jlhellospringbootstarterconfigure.service;

import org.jl.jlhellospringbootstarterconfigure.bean.HelloProperties;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 纪磊
 * 2022/6/3 23:13
 * HelloService
 * 用途:
 * 版本： 1.0
 */

/**
 * 默认不放在容器中
 */
public class HelloService {

    @Autowired
    HelloProperties helloProperties;

    public String sayHello(String userName){

        return helloProperties.getPrefix()+":"+userName+">"+helloProperties.getSuffix();
    }
}
