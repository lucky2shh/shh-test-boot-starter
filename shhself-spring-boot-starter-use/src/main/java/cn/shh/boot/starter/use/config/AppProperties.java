package cn.shh.boot.starter.use.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cn.shh.selfstarter")
public class AppProperties {
    private String prefix;
    private String suffix;

    public AppProperties() {
    }

    public AppProperties(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
