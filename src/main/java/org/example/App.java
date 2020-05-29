package org.example;

import org.example.bean.Coach;
import org.example.bean.CricketCoach;
import org.example.bean.VolleyBallCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
 public static void main(String[] args)
 {
     ClassPathXmlApplicationContext context=
             new ClassPathXmlApplicationContext("applicationContext.xml");
     Coach myCoach=context.getBean("theCoach", CricketCoach.class);
     System.out.printf("%s",myCoach.getDailyWorkOut());
     System.out.printf("\nyour fortune of the day is %s",myCoach.getDailyFortune());

 }


}
