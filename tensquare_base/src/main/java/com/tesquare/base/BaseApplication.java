package com.tesquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

/**
 * @ProjectName: tensquare_parent53
 * @Package: com.tesquare.base
 * @ClassName: BaseApplication
 * @Author: Administrator
 * @Description: ${description}
 * @Date: 2018/12/20 22:10
 * @Version: 1.0
 */
/*暂时不知道有什么用, 先放着把*/
@SpringBootApplication
public class BaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class,args);

    }
    @Bean
    public IdWorker idWorker(){
        return new IdWorker(1,1);
    }
}
