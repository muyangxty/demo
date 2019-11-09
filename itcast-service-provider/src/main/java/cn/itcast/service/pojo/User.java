package cn.itcast.service.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String userName;

    private String password;

//    private String name;
//    private String createdUser;

//    private Integer age;

//    private Integer sex;

//    private Date birthday;
}
