package org.example.bean;

public class LuckyService implements FortuneService {
    @Override
    public String getDailyFortune() {
        return "today is your lucky day";
    }
}
