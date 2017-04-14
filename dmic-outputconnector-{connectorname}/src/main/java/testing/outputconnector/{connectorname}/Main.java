package testing.outputconnector.{connectorname};

import org.dmic.outputconnector.{connectorname}.*;
import org.apache.flink.api.java.ExecutionEnvironment;

/* Classes in this package won't be uploaded to the connectors library */
public class Main {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

		// Test your output connector

		// execute program
		env.execute("Flink Batch Java API Skeleton");
	}
}
