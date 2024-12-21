package com.javaperf.gcdemo.config;

// import io.micrometer.core.instrument.Clock;
// import io.micrometer.core.instrument.MeterRegistry;
// import io.micrometer.influx.InfluxConfig;
// import io.micrometer.influx.InfluxMeterRegistry;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import java.time.Duration;
// import org.springframework.boot.actuate.autoconfigure.metrics.export.influx.InfluxMetricsExportAutoConfiguration;
// import org.springframework.boot.autoconfigure.AutoConfigureBefore;
// import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
// import org.springframework.context.annotation.Primary;

// @Configuration
// @AutoConfigureBefore(InfluxMetricsExportAutoConfiguration.class)  // Add this
// @ConditionalOnMissingBean(InfluxMeterRegistry.class)             // Add this
// public class InfluxMetricsConfig {

//     @Value("${INFLUX_USERNAME:default_username}")
//     private String username;

//     @Value("${INFLUX_PASSWORD:default_password}")
//     private String password;

//     @Value("${INFLUX_DB:gcdemo}")
//     private String database;

//     @Value("${INFLUX_URI:http://localhost:8086}")
//     private String uri;

//     @Bean(name = "customInfluxMeterRegistry")
//     @Primary
//     public MeterRegistry influxMeterRegistry() {
//         InfluxConfig config = new InfluxConfig() {
//             @Override
//             public String get(String k) {
//                 return null;
//             }

//             @Override
//             public String db() {
//                 return database;
//             }

//             @Override
//             public String userName() {
//                 return username;
//             }

//             @Override
//             public String password() {
//                 return password;
//             }

//             @Override
//             public String uri() {
//                 return uri;
//             }

//             @Override
//             public Duration step() {
//                 return Duration.ofSeconds(10);
//             }

//             @Override
//             public boolean enabled() {
//                 return true;
//             }
//         };

//         return new InfluxMeterRegistry(config, Clock.SYSTEM);
//     }
// }

public class InfluxMetricsConfig {

}
