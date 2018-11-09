package com.platform.configure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component  
@ConfigurationProperties(prefix="server.timeout") 
public class ServiceTimeOutConfigure {

}
