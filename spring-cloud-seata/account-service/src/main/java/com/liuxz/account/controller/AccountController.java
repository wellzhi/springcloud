package com.liuxz.account.controller;

import com.liuxz.account.repo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * 账户接口实现
 *
 * @author liuxz
 */
@RestController
public class AccountController{
    /**
     * 账户业务逻辑
     */
    @Autowired
    private AccountService accountService;

    public void deduction(Integer accountId, Double money) {
        accountService.deduction(accountId, money);
    }
}
