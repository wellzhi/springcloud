package com.liuxz.feign.feign.fallback;

import com.liuxz.feign.feign.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiFallBack implements SchedualServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "sorry!" + name;
    }
}
