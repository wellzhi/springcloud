package com.liuxz.order.repo.service.impl;

import com.liuxz.order.repo.entity.Order;
import com.liuxz.order.repo.mapper.OrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.liuxz.order.repo.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
