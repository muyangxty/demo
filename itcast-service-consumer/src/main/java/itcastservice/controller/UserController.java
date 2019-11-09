package itcastservice.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import itcastservice.client.UserClient;
import itcastservice.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
@RequestMapping("consumer/user")
//定义全局的熔断方法
//@DefaultProperties(defaultFallback = "FallbackMethod")
public class UserController {

    @Autowired
    private UserClient userClient;

    /*@Autowired
    private RestTemplate restTemplate;*/

//    @Autowired
//    //包含了拉取的所有服务信息
//    private DiscoveryClient discoveryClient;

    @GetMapping
    @ResponseBody
    //声明熔断的方法
    @HystrixCommand
    public String queryUserById(@RequestParam("id") Long id){
//        if (id == 1){
//            throw new RuntimeException();
//        }
////       List<ServiceInstance> instance = discoveryClient.getInstances("service-provider");
////        ServiceInstance instanceList =  instance.get(0);
//       return this.restTemplate.getForObject("http://service-provider/user/" + id, String.class);
        return this.userClient.queryUserById(id).toString();
    }

}
