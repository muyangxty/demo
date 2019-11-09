package itcastservice.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Long uid;

    private String userName;

    private String password;

    private Long salt;

    private Integer gender;

    private String phone;

    private String email;

//
//    private String name;
//
//    private Integer age;
//
//    private Integer sex;
//
//    private Date birthday;


}
