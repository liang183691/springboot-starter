package com.liang.framework.springmqstarter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @brief:   Swagger属性配置
 * @author:  hongzhen.chang
 * @date:    2019-07-13
 * Company： China Unicom Software Research Institute
 */

@Data
@ConfigurationProperties(prefix = "rabbit.mq")
public class RabbitMqProperties {

	private String host = "";

	private int port = 5672;

	private String username = "";

	private String password = "";

	//private boolean confirms = true;
}
