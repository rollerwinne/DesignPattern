package atguigu_shulou.factory.method;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        Pizza pizza= PizzaFactory.createPizza("greek");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}
