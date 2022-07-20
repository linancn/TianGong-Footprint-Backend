package earth.tiangong.footprint.backend.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.sql.SQLException;
import java.util.Collections;

public class FastGenerator {

    /**
     * DB Config
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig.Builder("jdbc:postgresql://localhost:55436/footprint_calculator?currentSchema=public", "postgres", "1357_Qetu");

    /**
     * Run
     */
    public static void main(String[] args) throws SQLException {
        FastAutoGenerator.create(DATA_SOURCE_CONFIG).globalConfig(builder -> {
            builder.author("TianGongFootprint")
                    // .fileOverride() // force overwrite files
                    .outputDir("src/main/java/");
        }).packageConfig(builder -> {
            builder.parent("earth.tiangong.footprint.backend").pathInfo(Collections.singletonMap(OutputFile.mapperXml, "src/main/resources/mapper"));
        }).strategyConfig(builder -> {
            builder.enableSchema().addInclude("factor_material_process");
        }).templateEngine(new FreemarkerTemplateEngine()).execute();
    }
}
