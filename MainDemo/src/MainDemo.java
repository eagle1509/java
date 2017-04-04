/**
 * Created by wangce on 2017/2/12.
 */

/*public static void main(String[] args)
主函数：是一个特殊函数，作为函数入口，可以被java调用。

public：代表该函数访问权限是最大的。
static：代表主函数随着类的加载就已经存在。
void：主函数没有返回值。
main：不是关键字，是一个特殊的可以被jvm识别的单词
函数的参数：（String【】arr）函数的参数：参数类型是一个数组，数组中的元素是字符串。

主函数是固定格式的。
jvm在调用主函数时，传入的是new string[0];
 */

public class MainDemo {
    public static void main(String[] args)//new String[]
    {
        System.out.println(args.length);
        String[] arr = {"1","2","3","4"};
        MainTest.main(arr);
    }
}

class MainTest
{
    public static void main(String[] args)
    {
        for(int x = 0; x<args.length; x++)
            System.out.println(args[x]);
    }
}