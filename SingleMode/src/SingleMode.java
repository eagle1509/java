/**
 * Created by wangce on 2017/2/13.
 */
//single类进内存，就已经创建好了对象（饿汉式）开发常用，安全简单
class SingleMode
{
    private static Single s = new Single();
    private Single (){}
    public static Single get Instance()
    {
        return s;
    }
}
//single类进内存时，对象还没有加载，只有调用了getInsatnce方法时，才建立对象（懒汉式）
class Single
{
    private static Single s = null;
    private Single(){}
    public static Single get Instance()
    {
        if(s==null)
            s = new Single();
        return s;
    }
}
