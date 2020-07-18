package ConstructionCal;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class cost {
	public static final Logger LOGGER = LogManager.getLogger(Construction.class);

	cost() throws IOException {

		LOGGER.info("class construct Cost started");
		int total = 0;

		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		LOGGER.info("enter the area of the house(In square feets)");
		int area = Integer.parseInt(read.readLine());

		LOGGER.info(
				"Welcome to My Constructions \\nPlease Select the type of material from the following \n1.standard materials \n2.above standard materials \n3.high standard material \n4.Fully automated House");
		int m = Integer.parseInt(read.readLine());

		if (m == 1) {
			total = 1200 * area;
			LOGGER.info("Estimated Cost " + total + " ruppes");
		} else if (m == 2) {
			total = 1500 * area;
			LOGGER.info("Estimated Cost " + total + " ruppes");
		} else if (m == 3) {
			total = 1800 * area;
			LOGGER.info("Estimated Cost " + total + " ruppes");
		} else if (m == 4) {
			total = 2500 * area;
			LOGGER.info("Estimated Cost " + total + " ruppes");
		} else {
			LOGGER.error("choose valid type of material");
		}

	}
}

public class Construction{
	public static final Logger LOGGER = LogManager.getLogger(Construction.class);

	public static void main(String[] args) throws IOException {
		LOGGER.info("main class started executing");
		cost c = new cost();

	}
}