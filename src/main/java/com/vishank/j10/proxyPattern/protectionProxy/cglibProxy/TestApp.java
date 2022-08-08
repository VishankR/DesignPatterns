package com.vishank.j10.proxyPattern.protectionProxy.cglibProxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.FixedValue;
import net.sf.cglib.proxy.MethodInterceptor;

public class TestApp {
    public static void main(String[] args2) {
        Enhancer enhancer1 = new Enhancer();
        enhancer1.setSuperclass(PersonImpl_RealSubject.class);

        //Returning the Same Value
        enhancer1.setCallback((FixedValue) ()-> "Hello Tom!");
        PersonImpl_RealSubject proxy1 = (PersonImpl_RealSubject) enhancer1.create();
        String res = proxy1.sayHello(null);
        System.out.println(res);

        //Returning Value Depending on a Method Signature
        Enhancer enhancer2 = new Enhancer();
        enhancer2.setSuperclass(PersonImpl_RealSubject.class);
        enhancer2.setCallback((MethodInterceptor) (obj, method, args, proxy) -> {
            if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "Hello Tom!";
            } else {
                return proxy.invokeSuper(obj, args);
            }
        });
        PersonImpl_RealSubject proxy = (PersonImpl_RealSubject) enhancer2.create();
        System.out.println(proxy.lengthOfName("Mary"));
    }
}
