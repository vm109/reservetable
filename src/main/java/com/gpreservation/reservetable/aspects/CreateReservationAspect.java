package com.gpreservation.reservetable.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CreateReservationAspect {
    @Before(value = "execution(* com.gpreservation.reservetable.services.CreateReservation.createReservation(..) )")
    public void checkDate(JoinPoint joinPoint){
        for(Object obj : joinPoint.getArgs()){
            System.out.println(obj);
        }
    }
}
