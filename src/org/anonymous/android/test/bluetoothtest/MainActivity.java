package org.anonymous.android.test.bluetoothtest;

import android.app.Activity;
import android.bluetooth.BluetoothSocket;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	BluetoothSocket socket;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		View view3 = findViewById(R.id.button3);
		view3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				String number = "5556";
				String message = "Hello 5556. :D";
				SmsManager sm = SmsManager.getDefault();
				sm.sendTextMessage(number, null, message, null, null);
			}
		});
		
	
		/*
		View view = findViewById(R.id.button1);
		view.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (socket != null) {
					try {
						socket.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});

		View view2 = findViewById(R.id.button2);
		view2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (socket != null) {
					String text = "The quick brown fox jumps over the lazy dog.\n" +
							"This is the text sending to the printer.\n" +
							"Powered by POSTPBD :)\n" +
							"Feb 24, 2012";
					PrintUtils.INSTANCE.printText(text, socket);
				}

			}
		});

		final ArrayList<BluetoothDevice> devices = BluetoothUtils.INSTANCE
				.getPairedBluetoothDevices();

		ArrayList<String> deviceNames = BluetoothUtils.INSTANCE
				.getNamesForBluetoothDevices(devices);

		if (deviceNames != null && deviceNames.size() > 0) {

			DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {

				@Override
				public void onClick(DialogInterface dialog, int which) {
					BluetoothDevice device = devices.get(which);
					if (device != null) {
						socket = BluetoothUtils.INSTANCE
								.connectToBluetoothDevice(device);
						if (socket != null) {
							System.out.println("Successfully connected.");
						} else {
							System.out.println("Connection failed.");
						}
					}

				}
			};

			Dialog dialog = BluetoothUtils.INSTANCE
					.getSimpleDialogForBluetoothDeviceNames(this, deviceNames,
							listener);
			dialog.show();
		}*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
