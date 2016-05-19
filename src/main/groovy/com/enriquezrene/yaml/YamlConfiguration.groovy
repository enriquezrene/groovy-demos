package com.enriquezrene.yaml

import org.yaml.snakeyaml.Yaml

/**
 * Created by rene on 19/05/16.
 */
class YamlConfiguration {

    Configuration configuration

    void load() {
        Yaml yml = new Yaml()
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("configuration.yaml");
        configuration = yml.loadAs(inputStream, Configuration.class);
    }
}
