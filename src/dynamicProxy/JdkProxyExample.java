package dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxyExample implements InvocationHandler {

	//真实对象
	private Object target = null;
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
