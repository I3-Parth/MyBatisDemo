package com.example.MyBatisDemo.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
public class MessManagementDataSourceConfig {
    @Bean(name = "dataSource2")
    @ConfigurationProperties(prefix = "spring.datasource_management")
    public DataSource MessManagementDataSource(){
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://localhost:5432/messManagement")
                .username("postgres")
                .password("postgres").build();
    }

    @Bean(name = "sqlSessionFactory2")
    public SqlSessionFactory sqlSessionFactory2(@Qualifier("dataSource2")final DataSource dataSource2)throws Exception{
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource2);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mess-management/mapper/*.xml"));
        return factoryBean.getObject();
    }

    @Bean(name = "sqlSessionTemplate2")
    public SqlSessionTemplate sqlSessionTemplate2(@Qualifier("sqlSessionFactory2") final SqlSessionFactory sqlSessionFactory2) {
        return new SqlSessionTemplate(sqlSessionFactory2);
    }

    @Bean
    @ConfigurationProperties("spring.datasource_management")
    public DataSourceProperties secondDataSourceProperties() {
        return new DataSourceProperties();
    }
}
