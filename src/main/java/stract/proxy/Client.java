package stract.proxy;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 5:04 下午
 */
public class Client {
    public static void main(String[] args) {
        Car car = new BusCar();
        CarProxy1 carProxy1 = new CarProxy1(new CarProxy2(car));
        carProxy1.move();
    }
}
