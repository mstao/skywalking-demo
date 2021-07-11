package me.mingshan.skywalking.order.controller;

import me.mingshan.skywalking.order.AccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanjuntao walkerhan@126.com
 * @date 2021/7/11
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private AccountClient accountClient;

    @GetMapping("/{id}")
    public Object get(@PathVariable(value = "id") String id) {
        accountClient.get("1");
        return new Object();
    }

    @PostMapping("/list")
    public List<Object> queryAllUser() {
        accountClient.queryAll();
        return new ArrayList<>();
    }
}
