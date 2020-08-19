package com.liuxz.good;

import com.liuxz.seata.common.DataSourceProxyAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

/**
 * @author liuxz
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class,scanBasePackages = "com.liuxz")
@Import(DataSourceProxyAutoConfiguration.class)
@MapperScan("com.liuxz.good.repo.mapper")
public class AccountServiceApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(AccountServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(AccountServiceApplication.class, args);
        logger.info("账户服务启动成功.");
    }
}
