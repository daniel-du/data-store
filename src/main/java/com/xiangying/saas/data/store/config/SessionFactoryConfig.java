package com.xiangying.saas.data.store.config;

import java.io.IOException;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class SessionFactoryConfig {

	/** * mybatis 配置路径 */
//	private static String MYBATIS_CONFIG = "mybatis-config.xml";

	/** * mybatis mapper resource 路径 */
	private static String MAPPER_PATH = "mapper/**.xml";

	@Autowired
	private DataSource dataSource;

	private String typeAliasPackage = "com.xiangying.saas.data.store.model*";

	/**
	 * 创建sqlSessionFactoryBean 实例 并且设置configtion 如驼峰命名.等等 设置mapper 映射路径
	 * 设置datasource数据源
	 * 
	 * @return
	 */
	@Bean
	public SqlSessionFactoryBean createSqlSessionFactoryBean() throws IOException {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		/** 设置mybatis configuration 扫描路径 */
//		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(MYBATIS_CONFIG));
		/** 添加mapper 扫描路径 */
		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + MAPPER_PATH;
		sqlSessionFactoryBean.setMapperLocations(pathMatchingResourcePatternResolver.getResources(packageSearchPath));
		/** 设置datasource */
		sqlSessionFactoryBean.setDataSource(dataSource);
		/** 设置typeAlias 包扫描路径 */
		sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasPackage);
		return sqlSessionFactoryBean;
	}

	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		jsonConverter.setObjectMapper(objectMapper);
		return jsonConverter;
	}

	/*
	 * @Bean(autowire = Autowire.BY_NAME) public Scheduler
	 * getSchedulerFactoryBean() { Scheduler scheduler = null;
	 * 
	 * String isQuartzActive = System.getenv("QUARTZ_ACTIVE"); if
	 * (isQuartzActive != null && isQuartzActive.equalsIgnoreCase("true")) { //
	 * 通过schedulerFactory获取一个调度器 SchedulerFactory schedulerfactory = new
	 * StdSchedulerFactory(); try { // 通过schedulerFactory获取一个调度器 scheduler =
	 * schedulerfactory.getScheduler();
	 * 
	 * // 创建jobDetail实例，绑定Job实现类 // 指明job的名称，所在组的名称，以及绑定job类 JobDetail jobDetail
	 * = new JobDetail("dataCollectJob", "dataCollectJobGroup",
	 * DataCollectJob.class);
	 * 
	 * // 定义调度触发规则，每天上午10：15执行 CronTrigger cornTrigger = new
	 * CronTrigger("cronTrigger", "triggerGroup"); // 执行规则表达式
	 * cornTrigger.setCronExpression("0 30 3 * * ? *"); // 把作业和触发器注册到任务调度中
	 * scheduler.scheduleJob(jobDetail, cornTrigger);
	 * 
	 * // 启动调度 scheduler.start();
	 * 
	 * } catch (Exception e) {
	 * 
	 * } } return scheduler; }
	 */
}
