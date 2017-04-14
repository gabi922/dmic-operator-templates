package testing.operator.{operatorname};

import org.dmic.operator.{operatorname}.*;
import org.apache.flink.api.java.ExecutionEnvironment;

/* Classes in this package won't be uploaded to the operator library */
public class Main {

	public static void main(String[] args) throws Exception {
		final ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

		// Test your operator

		// execute program
		env.execute("Flink Batch Java API Skeleton");
	}
}
