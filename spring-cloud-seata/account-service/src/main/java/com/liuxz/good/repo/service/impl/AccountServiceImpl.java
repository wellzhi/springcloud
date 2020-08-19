package com.liuxz.good.repo.service.impl;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.liuxz.good.repo.entity.Account;
import com.liuxz.good.repo.mapper.AccountMapper;
import com.liuxz.good.repo.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.math.BigDecimal;

/**
 * <p>
 * 账户信息表 服务实现类
 * </p>
 *
 * @author liuxz
 * @since 2020-08-19
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public void deduction(Integer accountId, Double money) {
        Account account = baseMapper.selectOne(Wrappers.<Account>lambdaQuery().eq(Account::getId, accountId));
        if (ObjectUtils.isEmpty(account)) {
            throw new RuntimeException("账户：" + accountId + "，不存在.");
        }
        BigDecimal value = account.getMoney().subtract(BigDecimal.valueOf(money));
        if (value.intValue() < 0) {
            throw new RuntimeException("账户：" + accountId + "，余额不足.");
        }
        account.setMoney(value);

        baseMapper.updateById(account);
    }
}
