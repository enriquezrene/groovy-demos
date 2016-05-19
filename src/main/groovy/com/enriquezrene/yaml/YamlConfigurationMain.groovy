package com.enriquezrene.yaml

/**
 * Created by rene on 19/05/16.
 */
class YamlConfigurationMain {

    public static void main(String[] args) {
        YamlConfiguration yamlConfiguration = new YamlConfiguration()
        yamlConfiguration.load()
        println yamlConfiguration.configuration.url
    }
}
