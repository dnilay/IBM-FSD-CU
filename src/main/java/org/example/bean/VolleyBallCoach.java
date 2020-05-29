package org.example.bean;

public class VolleyBallCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getDailyWorkOut() {
        return "practice back-head today";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


}
