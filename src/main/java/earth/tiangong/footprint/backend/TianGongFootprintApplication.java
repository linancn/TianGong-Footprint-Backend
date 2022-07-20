package earth.tiangong.footprint.backend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("earth.tiangong.footprint.backend.mapper")
public class TianGongFootprintApplication {

	public static void main(String[] args) {
		SpringApplication.run(TianGongFootprintApplication.class, args);
	}

}
