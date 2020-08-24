package com.zhaoguhong.dubbo.service.impl;

import com.zhaoguhong.dubbo.service.HelloService;

public class HelloServieImpl implements HelloService {

  @Override
  public String sysHello(String name) {
    System.out.println("provider sysHello:" + name);
    return "hello:" + name;
  }

}
