package com.rms.framework.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@EnableWebMvc
@ComponentScan("com.rms")
@PropertySource("classpath:messages.properties")
public class WebAppConfig extends WebMvcConfigurerAdapter {

	/*
	 * @Bean public UrlBasedViewResolver setupViewResolver() {
	 * InternalResourceViewResolver resolver = new
	 * InternalResourceViewResolver(); resolver.setPrefix("/WEB-INF/doc_root/");
	 * resolver.setSuffix(".jsp"); resolver.setViewClass(JstlView.class); return
	 * resolver; }
	 */

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/access").setViewName("login");
	}

	// Maps resources path to webapp/resources
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/js/**").addResourceLocations("/js/");
		registry.addResourceHandler("/css/**").addResourceLocations("/css/");
		registry.addResourceHandler("/html/**").addResourceLocations("/html/");
		registry.addResourceHandler("/img/**").addResourceLocations("/img/");
		registry.addResourceHandler("/extras/**").addResourceLocations(
				"/extras/");
		registry.addResourceHandler("/resources/**").addResourceLocations(
				"/resources/");
	}

	// Provides internationalization of messages
	@Bean
	public MessageSource messageSource() {

		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasenames("classpath:messages", "classpath:messages");
		// if true, the key of the message will be displayed if the key is not
		// found, instead of throwing a NoSuchMessageException
		messageSource.setUseCodeAsDefaultMessage(true);
		messageSource.setDefaultEncoding("UTF-8");
		// # -1 : never reload, 0 always reload
		messageSource.setCacheSeconds(0);
		return messageSource;
	}

	/**
	 * ViewResolver configuration required to work with Tiles2-based views.
	 */
	@Bean
	public ViewResolver viewResolver() {
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setViewClass(TilesView.class);
		return viewResolver;
	}

	/**
	 * Configures Tiles at application startup.
	 */
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer configurer = new TilesConfigurer();
		configurer
				.setDefinitions(new String[] { "/WEB-INF/doc_root/tiles.xml" });
		configurer.setCheckRefresh(true);
		return configurer;
	}

}
