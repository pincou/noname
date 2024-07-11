package csu.noname.system_backend;

import com.github.jeffreyning.mybatisplus.conf.EnableMPP;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableMPP
@SpringBootApplication

public class SystemBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemBackendApplication.class, args);
    }

}
