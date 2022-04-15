# SpringWeb  

* [html download](https://www.newlecture.com/resource/customer/upload/html.zip)

* Add JSPer  
	+ [eclipse] Select Dependency > tomcat-embed-jasper  
	+ [mvnrepository](https://mvnrepository.com/artifact/org.apache.tomcat.embed/tomcat-embed-jasper) : Tomcat Embed Jasper  

* DevTools  
	+ [mvnrepository](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools) : Spring Boot DevTools  

* jsp: /WEB-INF/view/  

* View Resolver  
	+ Apply **application.properties** prefix, suffix  
	+ `return "` ~~WEB-INF/view~~`/customer/notice/list`~~.jsp~~"`;`  

* Tiles  
	+ file location : /WEB-INF/tiles.xml 
	+ dependencies : tiles-core-3.0.8.jar, jstl-1.2.jar
	+ [attic](https://attic.apache.org/), [tiles](https://attic.apache.org/projects/tiles.html), [tutorial](https://tiles.apache.org/framework/tutorial/basic/pages.html), [nesting-extending](https://tiles.apache.org/framework/tutorial/advanced/nesting-extending.html)  
	+ [mvnrepository](https://mvnrepository.com/artifact/org.apache.tiles/tiles-jsp) : Tiles JSP Support  
	+ jsp
	```jsp
	...
	<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
	...
	<tiles:insertAttribute name="header" />
	...
	<tiles:insertAttribute name="visual" />
	...
	<tiles:insertAttribute name="aside" />
	...
	<tiles:insertAttribute name="main" />
	...
	<tiles:insertAttribute name="footer" />
	...
	```
	+ controller
	```java
	return "WEB-INF/view/customer/notice/list.jsp";  
	return "/customer/notice/list"; // ResourceViewResolver  
	return "customer.notice.list"; // TilesViewResolver  
	```
  	+ TileConfig.java  
  	```java
	package com.sc.web.config;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
	import org.springframework.web.servlet.view.tiles3.TilesView;
	import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

	@Configuration
	public class TilesConfig {

		@Bean
		public TilesConfigurer tilesConfigurer() {
			TilesConfigurer tilesConfigurer = new TilesConfigurer();
			tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/tiles.xml"});
			tilesConfigurer.setCheckRefresh(true);
			return tilesConfigurer;
		}

		@Bean
		public TilesViewResolver tilesViewResolver() {
			TilesViewResolver viewResolver = new TilesViewResolver();
			viewResolver.setViewClass(TilesView.class);
			viewResolver.setOrder(1);
			return viewResolver;
		}
	}
	```
  
***

##### [[youtube lecture]](https://www.youtube.com/watch?v=4-0scAf5tpU&list=PLq8wAnVUcTFWVdN74gn8FksCqwfI_GuJY, "SpringWeb")
