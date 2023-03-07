package cn.shh.boot.starter.autoconfig.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("cn.shh.selfstarter")
public class SelfStarterProperties {
    private String prefix;
    private String suffix;

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
