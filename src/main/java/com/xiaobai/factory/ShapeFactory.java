package com.xiaobai.factory;

/**
 * @paogram: com.xiaobai.factory
 * @description: a ShapeFactory class
 * @author: CodeXiaoBai
 * @createDate: 2022-07-24
 */

public class ShapeFactory {

    // 获取形状类型的对象
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
