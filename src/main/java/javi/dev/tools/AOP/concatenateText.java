package javi.dev.tools.AOP;

import javi.dev.tools.model.VariableSet;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class concatenateText {

    @Before("execution(* ConcatText(*,*))")
    public void concatenateBefore(JoinPoint joinPoint) throws Throwable {
        log.info("AOP concatenateBefore");
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();

        String argumentName = joinPoint.getArgs()[0].toString();

        log.info("Executing {} with argument: {}",
                className + methodName, argumentName);


    }

    @AfterReturning(value = "execution(* ConcatText(*,*))", returning = "variableSet")
    public void concatenateAfter(VariableSet variableSet){
        log.info("AOP concatenateAfter");

    }

    //@Around("")
    public void concatenateAround(){

    }
}
