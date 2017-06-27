package com.laoma.springtest.ioc01_xml配置Bean;

/**
 * @Auther: laoma
 * @create: 2017-06-27 下午1:38
 * xml获取bean
 */
public class XmlBean {

    private String beanName;
    private String beanInfo;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanInfo() {
        return beanInfo;
    }

    public void setBeanInfo(String beanInfo) {
        this.beanInfo = beanInfo;
    }

    @Override
    public String toString() {
        return "XmlBean{" +
                "beanName='" + beanName + '\'' +
                ", beanInfo='" + beanInfo + '\'' +
                '}';
    }
}
