package com.me.test.reqeustlog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mt
 * @date 2020/3/1
 */
@RestController
@Slf4j
public class LogController {


    @PostMapping("log")
    public String logger(String data) {
        log.info("data：" + data);
        return data;

    }
}

