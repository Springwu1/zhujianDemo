package wjm.commonlibrary;

/**
 * <pre>
 *     author : wujiangming
 *     e-mail : jiangmingwu@ecarx.com.cn
 *     time   : 2019-08-01
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Userbean {
    private String name;
    private int age;

    public Userbean(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
