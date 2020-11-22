package cn.pattern.创建型.factory.abstracts.product;

/**
 * 产出物：三级牛排
 *
 * @author wjm
 * @since 2020/7/1 20:24
 */
public class SteakWorst implements Food{
    @Override
    public void description() {
        System.out.println("这是三级牛排");
    }
}