package pl.piomin.services.department.client;

import org.springframework.cloud.openfeign.FeignClient;
import pl.piomin.services.department.config.FeignConfig;
import pl.piomin.services.employee.api.TestApi;


/**
 * 直接精准定向路由
 */
@FeignClient(url = "http://127.0.0.1:9911", configuration = FeignConfig.class)
public interface TenentServiceClient extends TestApi {
}
