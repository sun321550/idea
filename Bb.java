package com.hp.a;
// 像这样的 是有 私有的属性 和 get set 方法 叫做实体类
// 一般一个实体类对应一个数据库表！！！
public class Bb {
    private  double price;
    private  String color;
    private  String typeName;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Bb{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }

}
