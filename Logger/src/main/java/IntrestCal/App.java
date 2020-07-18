package IntrestCal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class calculate {
	public static final Logger LOGGER = LogManager.getLogger(App.class);

	calculate() throws IOException {
		LOGGER.info("class Calculate started");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		LOGGER.info("enter the value of principle amount");

		int p = Integer.parseInt(reader.readLine());
		LOGGER.info("enter the value of time period(in years)");

		int t = Integer.parseInt(reader.readLine());
		LOGGER.info("enter the rate of interest(in %)");

		double r = Integer.parseInt(reader.readLine());
		LOGGER.info("Choose \n1.Simple Interest\n2.Compound Interest");

		int type = Integer.parseInt(reader.readLine());

		if (type == 1) {
			double sI = (p * t * r) / 100;

			LOGGER.info("\nThe Intrest amount is " + sI + " Rupees");
		} else if (type == 2) {
			LOGGER.info("\nenter the no of times interest is compunded per year");

			int n = Integer.parseInt(reader.readLine());
			r = r / 100;
			double totalamountCi = p * Math.pow(1 + (r / n), n * t);

			double cI = totalamountCi - p;
			LOGGER.info("The interest amount is " + cI + " Rupees");

		} else {
			LOGGER.error("*****INVALID SELECTION*****");

		}

	}
}

public class App {
	public static final Logger LOGGER = LogManager.getLogger(App.class);
	public static void main(String[] args) throws IOException {
		LOGGER.info("Main App Execution Started");
		calculate c = new calculate();
	}
}