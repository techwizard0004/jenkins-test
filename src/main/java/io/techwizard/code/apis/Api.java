package io.techwizard.code.apis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/backend")
public class Api {

    @GetMapping(path = "/add/{num1}/{num2}")
    public Integer add(@PathVariable Integer num1, @PathVariable Integer num2){
        return (num1 + num2);
    }
}
