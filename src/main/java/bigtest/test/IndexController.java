package bigtest.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String index() {
        log.info("wwwwwwwwwwww");
        return getClass().getName();
    }
    @PostMapping("/")
    public String index2() {
        log.info("qqqqqqqqqqqqq");
        return getClass().getName();
    }

}
