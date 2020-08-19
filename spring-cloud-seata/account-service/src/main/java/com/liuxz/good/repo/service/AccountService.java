package com.liuxz.good.repo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.liuxz.good.repo.entity.Account;

/**
 * <p>
 * 账户信息表 服务类
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
public interface AccountService extends IService<Account> {

    void deduction(Integer accountId, Double money);

}
