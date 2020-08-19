package com.liuxz.good.controller;

import com.liuxz.good.repo.entity.Good;
import com.liuxz.good.repo.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品接口定义实现
 *
 * @author liuxz
 */
@RestController
public class GoodController{
    /**
     * 商品业务逻辑
     */
    @Autowired
    private GoodService goodService;

    /**
     * 查询商品信息
     *
     * @param goodId {@link Good#getId()}
     * @return
     */

    public Good findById(Integer goodId) {
        return goodService.findById(goodId);
    }

    /**
     * 扣减商品库存
     *
     * @param goodId {@link Good#getId()}
     * @param stock  减少库存的数量
     */
    public void reduceStock(Integer goodId, int stock) {
        goodService.reduceStock(goodId, stock);
    }
}
