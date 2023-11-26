package com.example.coursespring.minio_service.service;


import java.time.Duration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration("spring.minio")
public class MinioConfigurationProperties {
    private String url = "http://127.0.0.1:9000";
    private String accessKey = "kLCT3SoXFtABCAd8o9r3";
    private String secretKey = "HeIDr6HaNf3LecD8lcdRd7nI2RODYrwKIijbc6qs";
    private boolean secure = false;
    private String bucket = "default-bucket";
    private String metricName = "minio.storage";
    private Duration connectTimeout = Duration.ofSeconds(10L);
    private Duration writeTimeout = Duration.ofSeconds(60L);
    private Duration readTimeout = Duration.ofSeconds(10L);
    private boolean checkBucket = true;
    private boolean createBucket = true;

    public MinioConfigurationProperties() {
    }

    public Duration getConnectTimeout() {
        return this.connectTimeout;
    }

    public void setConnectTimeout(Duration connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Duration getWriteTimeout() {
        return this.writeTimeout;
    }

    public void setWriteTimeout(Duration writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public Duration getReadTimeout() {
        return this.readTimeout;
    }

    public void setReadTimeout(Duration readTimeout) {
        this.readTimeout = readTimeout;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getBucket() {
        return this.bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public boolean isSecure() {
        return this.secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public boolean isCheckBucket() {
        return this.checkBucket;
    }

    public void setCheckBucket(boolean checkBucket) {
        this.checkBucket = checkBucket;
    }

    public boolean isCreateBucket() {
        return this.createBucket;
    }

    public void setCreateBucket(boolean createBucket) {
        this.createBucket = createBucket;
    }
}
