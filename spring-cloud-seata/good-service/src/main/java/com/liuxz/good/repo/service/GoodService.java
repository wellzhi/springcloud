package com.liuxz.good.repo.service;

import com.liuxz.good.repo.entity.Good;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
public interface GoodService extends IService<Good> {

    Good findById(Integer goodId);

    void reduceStock(Integer goodId, int stock);
}
