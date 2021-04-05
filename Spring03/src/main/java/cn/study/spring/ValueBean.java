package cn.study.spring;

public class ValueBean {
    //值：User类的对象中的name属性值
    public String name;

    //值：    SampleBean中names的第三个名字
    public String username;

    //值：SampleBean中cities的第二个值
    public String from;

    //值：SampleBean中Session的password值
    public String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
