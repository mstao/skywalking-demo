package me.mingshan.skywalking.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanjuntao walkerhan@126.com
 * @date 2021/7/11
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/{id}")
    public Object get(@PathVariable(value = "id") String id) {
        return new Object();
    }

    @PostMapping("/list")
    public List<Object> queryAll() {
        int i = 1 / 0;
        return new ArrayList<>();
    }
}
