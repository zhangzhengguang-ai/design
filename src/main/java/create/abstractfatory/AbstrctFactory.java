package create.abstractfatory;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 4:25 下午
 */
public interface AbstrctFactory {
    /**
     * 获取A类产品
     *
     * @param type
     * @return
     */
    ProductA getProductA(String type);

    /**
     * 获取B类产品
     *
     * @param type
     * @return
     */
    ProductB getProductB(String type);
}
