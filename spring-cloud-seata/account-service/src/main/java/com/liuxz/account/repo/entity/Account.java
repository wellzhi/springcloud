package com.liuxz.account.repo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.liuxz.seata.common.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 账户信息表
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("seata_account")
public class Account extends BaseEntity {

    private static final long serialVersionUID=1L;

    /**
     * 余额
     */
    private BigDecimal money;

    /**
     * 备注信息
     */
    private String mark;


}
