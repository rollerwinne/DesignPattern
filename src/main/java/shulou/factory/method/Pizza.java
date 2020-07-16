package shulou.factory.method;

public abstract class Pizza {
    protected String name;

    public abstract void prepare();

    public Pizza(String name){
        this.name=name;
    }

    public Pizza(){}

    public void bake() {
        System.out.println(name + " baking;");
    }

    public void cut() {
        System.out.println(name + " cutting;");
    }

    public void box() {
        System.out.println(name + " boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }
}
