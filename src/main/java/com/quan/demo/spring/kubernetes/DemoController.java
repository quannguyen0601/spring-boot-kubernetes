package com.quan.demo.spring.kubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.MessageFormat;

@RequestMapping("/api")
@RestController
public class DemoController {

    @Value("${hello.message}")
    private String message;

    @GetMapping("/hello")
    public String getHostName() throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();

        return MessageFormat.format("HostName: {0}, HostAddress: {1}", inetAddress.getHostName(), inetAddress.getHostAddress());
    }

    @GetMapping("/say")
    public String sayHello() throws UnknownHostException {
        return message;
    }
}
