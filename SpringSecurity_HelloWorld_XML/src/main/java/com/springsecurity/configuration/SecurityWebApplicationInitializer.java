package com.springsecurity.configuration;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityWebApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
	
}

/*
 * 
 * il file xml sarebbe stato:
 * <filter>
 *  <filter-name>springSecurityFilterChain</filter-name>
 *  <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
 *</filter>
 *
 *	<filter-mapping>
 *   <filter-name>springSecurityFilterChain</filter-name>
 *   <url-pattern>/*</url-pattern>
 *</filter-mapping>
 * 
 */
