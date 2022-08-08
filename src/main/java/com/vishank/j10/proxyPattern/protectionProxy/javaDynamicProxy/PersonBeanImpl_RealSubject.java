package com.vishank.j10.proxyPattern.protectionProxy.javaDynamicProxy;

public class PersonBeanImpl_RealSubject implements PersonBean_Subject{
    private String name;
    private String gender;
    private String  interests;
    private int hotOrNotHotRating;
    private int ratingCount;

    public int getRatingCount() {
        return ratingCount;
    }
    public void setRatingCount(int ratingCount) {
        this.ratingCount = ratingCount;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setName(String name) {
    }
    @Override
    public String getGender() {
        return this.gender;
    }
    @Override
    public void setGender(String gender) {
    }

    public PersonBeanImpl_RealSubject(String name, String gender, String interests, int hotOrNotHotRating, int ratingCount) {
        this.name = name;
        this.gender = gender;
        this.interests = interests;
        this.hotOrNotHotRating = hotOrNotHotRating;
        this.ratingCount = ratingCount;
    }

    @Override
    public String getInterests() {
        return this.interests;
    }
    @Override
    public void setInterests(String interests) {
    }
    @Override
    public int getHotOrNotHotRating() {
        return this.hotOrNotHotRating;
    }
    @Override
    public void setHotOrNotHotRating(int hotOrNotHotRating) {
    }
}
