package create.factorymethod;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 4:13 下午
 */
public interface AbstractFactory {
    /**
     * 获取对象
     * @return
     */
    Product getProduct(String type);
}
