package com.zhaoguhong.main;
import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProviderMain {
  public static void main(String[] args) throws IOException {
    // 读取配置文件
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
    context.start();
    System.in.read();
  }


}
