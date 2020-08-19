package com.liuxz.good.repo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.liuxz.seata.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 商品信息
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("seata_good")
public class Good extends BaseEntity {

    private static final long serialVersionUID=1L;

    private String name;

    private Integer stock;

    private BigDecimal price;


}
