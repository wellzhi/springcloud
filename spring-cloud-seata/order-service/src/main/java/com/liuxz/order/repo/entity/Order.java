package com.liuxz.order.repo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.liuxz.seata.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单表
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("seata_order")
public class Order extends BaseEntity {

    private static final long serialVersionUID=1L;

    private Integer goodId;

    private Integer accountId;

    private Integer price;


}
