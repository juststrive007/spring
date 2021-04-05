package cn.study.spring;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;



public class SampleBean {
    //Lucy,Jack,
    public List<String> names;
    //beijing ,shanghai ,shenzhen
    public Set<String> cities;
    //JavaOOP ,javaSE ,MySQL ,JDBC
    public String[] skills;

    public Map<String,Object> session;

    //值来至配置文件
    public Properties jdbcConfig;

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
    public List<String> tools;

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public void setCities(Set<String> cities) {
        this.cities = cities;
    }

    public void setTools(List<String> tools) {
        this.tools = tools;
    }

    public void setJdbcConfig(Properties jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }
}
