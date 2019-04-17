package com.sakazoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringWebFluxSample {

  public static void main(String[] args) {

    SpringApplication.run(SpringWebFluxSample.class, args);

    GreetingWebClient gwc = new GreetingWebClient();
    System.out.println(gwc.getResult());
  }

}
