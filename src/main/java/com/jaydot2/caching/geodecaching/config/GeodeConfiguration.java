package com.jaydot2.caching.geodecaching.config;

import com.jaydot2.caching.geodecaching.model.Patient;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableClusterConfiguration;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableEntityDefinedRegions(
        basePackageClasses = Patient.class
)
@ClientCacheApplication
@EnableClusterConfiguration(useHttp = true)
@EnableGemfireRepositories
@Configuration
public class GeodeConfiguration {
}
