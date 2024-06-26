package com.capivarafinance.CapivaraFinance.config;

import com.capivarafinance.CapivaraFinance.converter.StringToDateConverter;
import com.capivarafinance.CapivaraFinance.converter.StringToEnumConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new StringToEnumConverter());
        registry.addConverter(new StringToDateConverter());
    }
}
