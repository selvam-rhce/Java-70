package co.edureka;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class Before implements MethodBeforeAdvice {
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before the execution of "+method.getName()+" with "+args.length+" parameters");
	}
}
