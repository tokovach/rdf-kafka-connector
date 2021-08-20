package com.ontotext.kafka;

import java.util.Collection;
import java.util.Map;

import org.apache.kafka.connect.sink.SinkRecord;
import org.apache.kafka.connect.sink.SinkTask;

public class GraphDBSinkTask extends SinkTask {
	@Override
	public String version() {
		return null;
	}

	@Override
	public void start(Map<String, String> map) {

	}

	@Override
	public void put(Collection<SinkRecord> collection) {

	}

	@Override
	public void stop() {

	}
}
