/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanulhan.jms.broker;

/**
 *
 * @author uhansen
 */
public class BrokerSettings {
    private String jmxServiceURL;
    private String mBeanObjectName;
    private String brokerURL;
    private int sendTimeout;
    

    public String getJmxServiceURL() {
        return jmxServiceURL;
    }

    public void setJmxServiceURL(String jmxServiceURL) {
        this.jmxServiceURL = jmxServiceURL;
    }

    public String getmBeanObjectName() {
        return mBeanObjectName;
    }

    public void setmBeanObjectName(String mBeanObjectName) {
        this.mBeanObjectName = mBeanObjectName;
    }


    public String getBrokerURL() {
        return brokerURL;
    }

    public void setBrokerURL(String brokerURL) {
        this.brokerURL = brokerURL;
    }

    public int getSendTimeout() {
        return sendTimeout;
    }

    public void setSendTimeout(int sendTimeout) {
        this.sendTimeout = sendTimeout;
    }
}
