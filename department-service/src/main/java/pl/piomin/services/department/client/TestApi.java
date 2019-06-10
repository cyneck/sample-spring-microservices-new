package pl.piomin.services.department.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piomin.services.department.config.FeignConfig;


/**
 * 直接精准定向路由
 */
@FeignClient(name = "employee-service", url = "http://127.0.0.1:9911", configuration = FeignConfig.class)
public interface TestApi {

    @GetMapping(value = "/test")
    String test(@RequestParam("id") String id);
}
