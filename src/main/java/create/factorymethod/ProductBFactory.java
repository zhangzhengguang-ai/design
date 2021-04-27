package create.factorymethod;

/**
 * @author zhangzhengguang
 * @date 2021/4/27 4:21 下午
 */
public class ProductBFactory implements AbstractFactory{
    @Override
    public Product getProduct(String type) {
        return ProductTypeEnum.getProduct(type);
    }

    enum ProductTypeEnum {
        /**
         * 产品A
         */
        PRODUCT_B1("B1", new ProductA1()),

        /**
         * 产品B
         */
        PRODUCT_B2("B2", new ProductA2());

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
            ProductAFactory.ProductTypeEnum[] values = ProductAFactory.ProductTypeEnum.values();
            for (ProductAFactory.ProductTypeEnum p : values) {
                if (p.getType().equals(type)) {
                    return p.getProduct();
                }
            }
            return null;
        }
    }
}
