package com.example.epidemic;

import com.example.epidemic.utils.PassUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EpidemicApplicationTests {

    @Test
    void contextLoads() {
        String pass = PassUtils.aesenc("V1oI3GzV3xkqhQsBmaYapw==","123456");
        System.out.println(pass);
    }

}
