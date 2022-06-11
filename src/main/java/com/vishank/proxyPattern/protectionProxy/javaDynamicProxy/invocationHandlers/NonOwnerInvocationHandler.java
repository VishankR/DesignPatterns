package com.vishank.proxyPattern.protectionProxy.javaDynamicProxy.invocationHandlers;

import com.vishank.proxyPattern.protectionProxy.javaDynamicProxy.PersonBean_Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {

    PersonBean_Subject personBeanImpl_RealSubject;

    public NonOwnerInvocationHandler(PersonBean_Subject personBeanImpl_RealSubject) {
        this.personBeanImpl_RealSubject = personBeanImpl_RealSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("get")){
                return method.invoke(personBeanImpl_RealSubject, args);
            }
            else if(method.getName().startsWith("setHotOrNotHotRating")){
                return method.invoke(personBeanImpl_RealSubject, args);
            }
           else  if(method.getName().startsWith("set")){
                throw new IllegalAccessException();
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();;
        }
        return null;
    }
}
