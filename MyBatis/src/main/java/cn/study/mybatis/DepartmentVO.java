package cn.study.mybatis;

import lombok.Data;

import java.util.List;

@Data
public class DepartmentVO {
    private Integer id;
    private String name;
    private List<User> users;
}
