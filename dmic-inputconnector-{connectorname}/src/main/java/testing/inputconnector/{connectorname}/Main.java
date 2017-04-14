package testing.inputconnector.{connectorname};

import org.dmic.inputconnector.{connectorname}.*;
import org.apache.flink.api.java.ExecutionEnvironment;

/* Classes in this package won't be uploaded to the connectors library */
public class Main {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

		// Test your input connector

		// execute program
		env.execute("Flink Batch Java API Skeleton");
	}
}
