package com.vishank.proxyPattern.protectionProxy.cglibProxy;

public class PersonImpl_RealSubject {

    public PersonImpl_RealSubject() {
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }
    public Integer lengthOfName(String name) {
        return name.length();
    }
}
