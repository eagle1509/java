import sun.jvm.hotspot.oops.InstanceKlass;

/**
 * Created by wangce on 2017/2/15.
 */

interface Inter
{
    void method();
}

class Test
{
    //通过匿名内部类补全代码
    /*
    static class Inner implements Inter
    {
        public void method()
        {
            System.out.print("hah");
        }
    }
    */

    static Inter function()
    {
        return new Inter()
        {
            public void method()
            {
                System.out.print("hah");
            }
        };
    }

}

public class InnerClassTest
{
    Test.function().method();
    //Test,function():Test中有一个静态的方法fuction
    //.method:fucntion这歌方法运行后结果为一个对象，而且是Inter类型的对象。
}
