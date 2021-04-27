package stract.proxy;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 5:03 下午
 */
public class CarProxy2 implements Car {
    private Car car;

    public CarProxy2(Car car) {
        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("我是洗车代理");
        car.move();
    }
}
