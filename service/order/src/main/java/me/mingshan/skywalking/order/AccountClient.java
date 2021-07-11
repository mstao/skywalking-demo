package me.mingshan.skywalking.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hanjuntao walkerhan@126.com
 * @date 2021/7/11
 */
@FeignClient(name = "account", contextId = "account", path = "/account")
public interface AccountClient {
    @GetMapping("/{id}")
    Object get(@PathVariable(value = "id") String id);

    @PostMapping("/list")
    List<Object> queryAll();
}
