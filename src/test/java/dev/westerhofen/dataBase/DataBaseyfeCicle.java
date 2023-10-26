package dev.westerhofen.dataBase;

import java.util.HashMap;
import java.util.Map;

import org.testcontainers.containers.PostgreSQLContainer;

import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;

public class DataBaseyfeCicle implements QuarkusTestResourceLifecycleManager{

    private static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:9.6.12");

    @Override
    public Map<String, String> start() {
        postgres.start();
        Map<String, String> propriedades = new HashMap<>();
        propriedades.put("dev.quarkus.datasource.jdbc.url", postgres.getJdbcUrl());
        propriedades.put("dev.quarkus.datasource.username", postgres.getUsername());
        propriedades.put("dev.quarkus.datasource.password", postgres.getPassword());
        return propriedades;
    }

    @Override
    public void stop() {
        if (postgres != null) {
            postgres.stop();
        }
    }

}
