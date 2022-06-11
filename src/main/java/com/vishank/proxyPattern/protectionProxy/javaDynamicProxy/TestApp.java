package com.vishank.proxyPattern.protectionProxy.javaDynamicProxy;

import com.vishank.proxyPattern.protectionProxy.javaDynamicProxy.invocationHandlers.NonOwnerInvocationHandler;
import com.vishank.proxyPattern.protectionProxy.javaDynamicProxy.invocationHandlers.OwnerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * Hello world!
 *
 */
public class TestApp
{
    public TestApp() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        System.out.println("Initializing Database");
    }

    public static void main(String[] args ) throws  IllegalAccessException{
        TestApp app = new TestApp();
        app.test();
    }

    private void test() throws  IllegalAccessException{
        PersonBean_Subject ps = new PersonBeanImpl_RealSubject("Vishank Rajput", "Male", "Gaming", 5, 10);
        PersonBean_Subject proxy = getOwnerProxy(ps);
        System.out.println("Name : " + proxy.getName());
        System.out.println("Gender : " + proxy.getGender());
        System.out.println("Interests : " + proxy.getInterests());
        System.out.println("Hot or Not Hot Rating : " + proxy.getHotOrNotHotRating());
        try{
            proxy.setHotOrNotHotRating(3);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private PersonBean_Subject getOwnerProxy(PersonBean_Subject realSubject){
        return (PersonBean_Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new OwnerInvocationHandler(realSubject));
    }

    private PersonBean_Subject getNonOwnerProxy(PersonBean_Subject realSubject){
        return (PersonBean_Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), new NonOwnerInvocationHandler(realSubject));
    }
}
