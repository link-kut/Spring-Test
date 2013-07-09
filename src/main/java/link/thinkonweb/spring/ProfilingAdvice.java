package link.thinkonweb.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
@Aspect
public class ProfilingAdvice {
	@Pointcut("execution(public * link.thinkonweb.spring..*(..))")
	private void myTarget(){}
	
	@Around("myTarget()")
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println("[common  " + signatureString + "start!!!");
		
		Object obj = joinPoint.proceed();
		System.out.println("[common  " + signatureString + "end!!!");
		return obj;
	}
	
	@Before ("execution(public * link.thinkonweb.spring..*(..))")
	public void before() {
		System.out.println("before() - method");
	}
	
	@After ("execution(public * link.thinkonweb.spring..*(..))")
	public void after2() {
		System.out.println("after() - method");
	}
}
