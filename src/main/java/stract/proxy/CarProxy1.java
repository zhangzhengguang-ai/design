package stract.proxy;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 4:56 下午
 */
public class CarProxy1 implements Car {

    private Car car;

    public CarProxy1(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("我是加油代理");
        car.move();
    }
}
