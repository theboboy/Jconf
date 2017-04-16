package com.github.wenbo2018.jconf.client.config;

import com.github.wenbo2018.jconf.client.extension.ExtensionLoader;
import org.apache.log4j.Logger;

/**
 * Created by shenwenbo on 2017/4/16.
 */
public class ConfigManagerLoader {
    private static final Logger logger = Logger.getLogger(ConfigManagerLoader.class);
    private static ConfigManager configManager = ExtensionLoader.getExtension(ConfigManager.class);

    public static void init(){
        if (configManager == null) {
            configManager = new PropertiesFileConfigManager();
        }
        logger.debug("config manager init:" + configManager);
        configManager.init();
    }

    public static ConfigManager getConfigManager() {
        return configManager;
    }
}
