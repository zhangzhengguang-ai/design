package stract.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 5:25 下午
 */
public class JDKProxy {
    public static void main(String[] args) {
        BusCar busCar = new BusCar();
        Car proxy = (Car) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class[]{Car.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("我是洗车代理");
                method.invoke(busCar, args);
                return null;
            }
        });

        proxy.move();


        Enhancer enhancer = new Enhancer();
        enhancer.setClassLoader(busCar.getClass().getClassLoader());
        enhancer.setSuperclass(busCar.getClass());
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("我是加油代理");
                methodProxy.invoke(busCar, objects);
                return null;
            }
        });
        Car o = (Car) enhancer.create();
        o.move();

    }


}
