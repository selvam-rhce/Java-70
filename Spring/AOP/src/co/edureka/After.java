package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class After implements AfterReturningAdvice {
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("After the execution of "+method.getName()+" with "+args.length+" parameters");
	}
}
