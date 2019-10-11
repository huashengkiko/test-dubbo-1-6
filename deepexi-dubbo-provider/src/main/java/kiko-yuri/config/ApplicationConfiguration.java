package kiko-yuri.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.InitializingBean;
import kiko-yuri.util.ConverterUtils;
import org.springframework.core.convert.ConversionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration implements InitializingBean {
    
    @Autowired
    private ConversionService conversionService;

    @Override
    public void afterPropertiesSet() {
        ConverterUtils.setConversionService(conversionService);
    }
            
    

}

