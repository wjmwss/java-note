package cn.pattern.factory.abstract_factory.product;

/**
 * 产出物：三级水果
 *
 * @author:wjm
 * @date:2020/7/1 20:24
 */
public class FruitWorst implements Food{
    @Override
    public void description() {
        System.out.println("这是三级水果");
    }
}