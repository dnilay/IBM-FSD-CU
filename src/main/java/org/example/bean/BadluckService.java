package org.example.bean;

public class BadluckService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "today is your bad day";
    }
}
