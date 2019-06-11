package pl.piomin.services.employee.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piomin.services.employee.controller.TestController;

public interface TestApi {

    @GetMapping("/test")
    public String test(@RequestParam("id") String id);
}
