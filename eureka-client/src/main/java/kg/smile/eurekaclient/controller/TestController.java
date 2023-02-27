package kg.smile.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Value("${eureka.instance.instance-id}")
    private String id;

    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok(id);
    }
}
