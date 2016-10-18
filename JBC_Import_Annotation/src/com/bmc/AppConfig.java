package com.bmc;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
 
@Configuration
@Import({ CustomerConfig.class, SchedulerConfig.class })
public class AppConfig {
 
}


/*
equivalent code in xml

<beans xmlns="http://www.springframework.org/schema/beans"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://www.springframework.org/schema/beans
http://www.springframework.org/schema/beans/spring-beans-4.0 xsd">

<import resource="config/customer.xml"/>
    <import resource="config/scheduler.xml"/>

</beans>

*/