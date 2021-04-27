package create.singleten;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 3:41 下午
 */
public class Singleten {
    private static final Singleten INSTANCE = new Singleten();

    private Singleten() {
    }

    public static Singleten getInstance() {
        return INSTANCE;
    }
}
