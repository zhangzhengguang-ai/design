package create.prototype;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 3:45 下午
 */
public class Prototype implements Cloneable {
    private String name;
    private String age;

    public Prototype(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Prototype{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype("张三", "15");
        Prototype clone = (Prototype) prototype.clone();
        System.out.println(prototype == clone);
        System.out.println(prototype);
        System.out.println(clone);

    }
}
