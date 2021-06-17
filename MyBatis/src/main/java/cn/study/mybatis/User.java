package cn.study.mybatis;

import lombok.Data;

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private Integer age;
    private String phone;
    private String email;
    private String isDelete;
    private Integer departmentId;

}
