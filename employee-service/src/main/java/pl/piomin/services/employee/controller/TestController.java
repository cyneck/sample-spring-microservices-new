package pl.piomin.services.employee.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.piomin.services.employee.api.TestApi;

@RestController
public class TestController implements TestApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/test")
    public String test(@RequestParam("id") String id) {
        LOGGER.info("生产者");
        return "testing:" + id;
    }
}
