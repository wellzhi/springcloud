package com.liuxz.good;

import com.liuxz.seata.common.DataSourceProxyAutoConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

/**
 * @author liuxz
 */
@SpringBootApplication
@Import(DataSourceProxyAutoConfiguration.class)
public class GoodServiceApplication {
    /**
     * logger instance
     */
    static Logger logger = LoggerFactory.getLogger(GoodServiceApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GoodServiceApplication.class, args);
        logger.info("商品服务启动成功.");
    }
}
