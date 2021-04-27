package create.simplefactory;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 3:53 下午
 */
public class ProductFactory {

    public Product getProduct(String type) {
        return ProductTypeEnum.getProduct(type);
    }


    enum ProductTypeEnum {
        /**
         * 产品A
         */
        PRODUCT_A("A", new ProductA()),

        /**
         * 产品B
         */
        PRODUCT_B("A", new ProductA());

        String type;
        Product product;

        public String getType() {
            return type;
        }

        public Product getProduct() {
            return product;
        }

        ProductTypeEnum(String type, Product product) {
            this.type = type;
            this.product = product;
        }

        private static Product getProduct(String type) {
            ProductTypeEnum[] values = ProductTypeEnum.values();
            for (ProductTypeEnum p : values) {
                if (p.getType().equals(type)) {
                    return p.getProduct();
                }
            }
            return null;
        }
    }
}
