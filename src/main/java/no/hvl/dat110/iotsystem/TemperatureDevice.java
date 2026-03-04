package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

	private static final int COUNT = 10;

	public static void main(String[] args) {
        System.out.print("TemeratureDevice Starting!");
		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();

		// TODO - start
        Client client = new Client("sensor", Common.BROKERHOST, Common.BROKERPORT);

        if(client.connect()){
            for(int i = 0; i < COUNT; i++){
                int temp = sn.read();
                System.out.println("Temperatur lest er = " + temp);
                client.publish("Temperatur", String.valueOf(temp));
                try{
                    Thread.sleep(1000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
            client.disconnect();
        }

		// create a client object and use it to

		// - connect to the broker - user "sensor" as the user name
		// - publish the temperature(s)
		// - disconnect from the broker

		// TODO - end

		System.out.println("Temperature device stopping ... ");


	}
}
