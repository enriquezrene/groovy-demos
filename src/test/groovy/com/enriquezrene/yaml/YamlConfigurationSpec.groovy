package com.enriquezrene.yaml

import spock.lang.Specification

class YamlConfigurationSpec extends Specification{

    def 'when the load method is invoked the Configuration POGO should be populated'(){
        given:
        YamlConfiguration yamlConfiguration = new YamlConfiguration()

        when:
        yamlConfiguration.load()

        then:
        yamlConfiguration.configuration.url == "www.google.com"
    }

}