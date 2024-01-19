package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.InetAddress;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
  public String home() {
	  String SystemName;
	  try {
 
            // get system name
            
             SystemName = InetAddress.getLocalHost().getHostName();
 
            // SystemName stores the name of the system
            System.out.println("System Name : "
                               + SystemName);
        }
        catch (Exception E) {
            System.err.println(E.getMessage());
        }
    return SystemName;
  }
}
