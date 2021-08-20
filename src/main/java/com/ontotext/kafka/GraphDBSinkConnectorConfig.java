package com.ontotext.kafka;

import java.util.Map;

import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;

public class GraphDBSinkConnectorConfig extends AbstractConfig {

	public GraphDBSinkConnectorConfig(ConfigDef definition, Map<?, ?> originals,
			Map<String, ?> configProviderProps, boolean doLog) {
		super(definition, originals, configProviderProps, doLog);
	}

	public GraphDBSinkConnectorConfig(ConfigDef definition, Map<?, ?> originals) {
		super(definition, originals);
	}

	public GraphDBSinkConnectorConfig(ConfigDef definition, Map<?, ?> originals, boolean doLog) {
		super(definition, originals, doLog);
	}

	public static ConfigDef conf() {
		return new ConfigDef();
	}
}
