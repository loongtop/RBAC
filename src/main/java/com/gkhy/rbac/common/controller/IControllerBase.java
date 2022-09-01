package com.gkhy.rbac.common.controller;

import com.gkhy.rbac.common.controller.helper.EntityIsEnabled;
import com.gkhy.rbac.common.result.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IControllerBase<T, E> {
    Result findAll();

    Result add(@RequestBody Object o);

    Result save(@RequestBody T t);

    Result getById(@PathVariable E id);

    Result update(@PathVariable E id, @RequestBody EntityIsEnabled o);

    Result remove(@PathVariable E id);

    Result removeByIds(@PathVariable List<E> idList);

    Result delete(@PathVariable E id);

    Result deleteByIds(@PathVariable List<E> idList);

    Result getByPage(@PathVariable int current, @PathVariable int limit);
}
