package com.github.flj.guavatest;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * *********************************************
 * User: lishuisheng
 * Date:18/8/8
 * Time:下午6:06
 * Description: ${添加描述}
 * *********************************************
 * </pre>
 */
public class MpGenerator {

    //项目目录.
//    private static String baseProjectPath = "/Users/lishuisheng/workspace/baibu/bb_order_server";
    private static String baseProjectPath = "E:/demo-workspace/guavatest";

    //基本包
    private static String basePackage="com.github.flj.guavatest";

    //作者
    private static String authorName="flj";

    //数据库配置.
    private static String driverName = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://baibudb02.mysql.rds.aliyuncs.com:3306/bb_core_order?characterEncoding=utf8";
    private static String username = "dev_core_order";
    private static String password = "TQ66T1fpV5MvmlD0ncCmSZLyT4O8Fj";

    private static String xmlPath = baseProjectPath + "/src/main/resources/com/github/flj/guavatest/mapper/";

    //mapper基类
    private static String supperMapper = "com.bb.platform.framework.dao.SuperMapper";

    private static String supperEntity = "com.bb.platform.framework.domain.SuperEntity";


    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // 选择 freemarker 引擎，默认 Veloctiy
        // mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir(baseProjectPath + "/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(false);// XML columList
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor(authorName);

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);

        dsc.setDriverName(driverName);
        dsc.setUsername(username);
        dsc.setPassword(password);
        dsc.setUrl(url);
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        //strategy.setTablePrefix(new String[] { "hd_"});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        // strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
//        strategy.setSuperEntityClass(supperEntity);
        // 自定义实体，公共字段
//        strategy.setSuperEntityColumns(new String[] { "id" });

        // 自定义 mapper 父类
//        strategy.setSuperMapperClass(supperMapper);

        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(basePackage);
        mpg.setPackageInfo(pc);

        //xml配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                Map<String, Object> map = new HashMap<String, Object>();
                map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                this.setMap(map);
            }
        };
        List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return xmlPath + tableInfo.getEntityName() + ".xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);

        mpg.setTemplateEngine(new FreemarkerTemplateEngine());



        // 调整 xml 生成目录演示


        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        tc.setXml(null);
        mpg.setTemplate(tc);



        // 执行生成
        mpg.execute();

    }
}
