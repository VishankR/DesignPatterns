package com.vishank.j10.proxyPattern.protectionProxy.javaDynamicProxy;

public interface PersonBean_Subject {
    public String getName() ;

    public void setName(String name) ;

    public String getGender() ;

    public void setGender(String gender) ;

    public String getInterests() ;

    public void setInterests(String interests) ;

    public int getHotOrNotHotRating() throws IllegalAccessException ;

    public void setHotOrNotHotRating(int hotOrNotHotRating) throws IllegalAccessException;

}
