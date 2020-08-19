package com.liuxz.good.repo.service.impl;

import com.gitee.hengboy.mybatis.enhance.mapper.EnhanceMapper;
import com.liuxz.good.repo.entity.Good;
import com.liuxz.good.repo.mapper.GoodMapper;
import com.liuxz.good.repo.service.GoodService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Service
public class GoodServiceImpl extends ServiceImpl<GoodMapper, Good> implements GoodService {

    @Override
    public Good findById(Integer goodId) {
        return baseMapper.selectById(goodId);
    }


    /**
     * {@link EnhanceMapper} 具体使用查看ApiBoot官网文档http://apiboot.minbox.io/zh-cn/docs/api-boot-mybatis-enhance.html
     * 扣除商品库存
     *
     * @param goodId {@link Good#getId()}
     * @param stock  扣除的库存数量
     */
    @Override
    public void reduceStock(Integer goodId, int stock) {
        Good good =findById(goodId);
        if (ObjectUtils.isEmpty(good)) {
            throw new RuntimeException("商品：" + goodId + ",不存在.");
        }
        if (good.getStock() - stock < 0) {
            throw new RuntimeException("商品：" + goodId + "库存不足.");
        }
        good.setStock(good.getStock() - stock);
        baseMapper.updateById(good);

    }
}
