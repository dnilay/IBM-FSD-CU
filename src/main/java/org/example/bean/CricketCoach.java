package org.example.bean;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkOut() {
        return "practice spin bowling today";
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}
