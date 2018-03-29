package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties("cmdb")
public class CmdbProperties {
    private String resourceUrl;

    private List<Integer> resourcePort;

    private Integer resourceCount;

    private Integer resourceTest;

    @Override
    public String toString() {

        return "resourceUrl: "+ this.resourceUrl+"\n"
                + "resourcePort: "+this.resourcePort+"\n"
                + "resourceCount: "+this.resourceCount+"\n"
                + "test: "+this.resourceTest+"\n";
    }

    public String getResourceUrl() {
        return resourceUrl;
    }
    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }
    public List<Integer> getResourcePort() {
        return resourcePort;
    }
    public void setResourcePort(List<Integer> resourcePort) {
        this.resourcePort = resourcePort;
    }

    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public Integer getResourceTest() {
        return resourceTest;
    }

    public void setResourceTest(Integer resourceTest) {
        this.resourceTest = resourceTest;
    }
}
