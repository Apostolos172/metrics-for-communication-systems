import main.*;
  
public class Main {

	public static void main(String[] args) {
		
		// metrics for communication systems App
		new Operations_GUI(); 
		
		//test_chart();

		/*
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Give the dBm:");
		double dBm = keyboard.nextDouble();
		double watt = Math_of_communication.getdBmtoWatt(dBm);
		System.out.println("watt: " + watt);
		System.out.println("\n");
		
		System.out.println("Give the SNRtodB:");
		double SNRtodB = keyboard.nextDouble();
		double capacityperbandwidth = Math_of_communication.getCapacityPerbandwidthHavingSNRtodB(SNRtodB);
		System.out.println("capacityperbandwidth: " + capacityperbandwidth);
		System.out.println("\n");
		
		System.out.println("Give the capacityperbandwidth:");
		double capacityPERbandwidth = keyboard.nextDouble();
		double SNRclearnumber = Math_of_communication.getSNRclearNumberHavingCapacityPerBandwidth(capacityPERbandwidth);
		System.out.println("SNRclearnumber: " + SNRclearnumber);
		System.out.println("\n");
		
		keyboard.close();
		
		*/
	}

	private static void test_chart() {
		new Diagramm_test();
		new LineChartExample("test line chart");
	}
		
}
