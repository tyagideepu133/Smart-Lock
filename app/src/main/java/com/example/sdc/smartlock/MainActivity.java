package com.example.sdc.smartlock;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    public void onClickStart(View view) {
//
//        HashMap usbDevices = usbManager.getDeviceList();
//        if (!usbDevices.isEmpty()) {
//            boolean keep = true;
//            for (Map.Entry entry : usbDevices.entrySet()) {
//                device = entry.getValue();
//                int deviceVID = device.getVendorId();
//                if (deviceVID == 0x2341)//Arduino Vendor ID
//                {
//                    PendingIntent pi = PendingIntent.getBroadcast(this, 0,
//                            new Intent(ACTION_USB_PERMISSION), 0);
//                    usbManager.requestPermission(device, pi);
//                    keep = false;
//                } else {
//                    connection = null;
//                    device = null;
//                }
//
//                if (!keep)
//                    break;
//            }
//        }
//
//
//    }
//
//    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { //Broadcast Receiver to automatically start and stop the Serial connection.
//        @Override
//        public void onReceive(Context context, Intent intent) {
//            if (intent.getAction().equals(ACTION_USB_PERMISSION)) {
//                boolean granted =
//                        intent.getExtras().getBoolean(UsbManager.EXTRA_PERMISSION_GRANTED);
//                if (granted) {
//                    connection = usbManager.openDevice(device);
//                    serialPort = UsbSerialDevice.createUsbSerialDevice(device, connection);
//                    if (serialPort != null) {
//                        if (serialPort.open()) { //Set Serial Connection Parameters.
//                            setUiEnabled(true); //Enable Buttons in UI
//                            serialPort.setBaudRate(9600);
//                            serialPort.setDataBits(UsbSerialInterface.DATA_BITS_8);
//                            serialPort.setStopBits(UsbSerialInterface.STOP_BITS_1);
//                            serialPort.setParity(UsbSerialInterface.PARITY_NONE);
//                            serialPort.setFlowControl(UsbSerialInterface.FLOW_CONTROL_OFF);
//                            serialPort.read(mCallback); //
//                            tvAppend(textView,"Serial Connection Opened!\n");
//
//                        } else {
//                            Log.d("SERIAL", "PORT NOT OPEN");
//                        }
//                    } else {
//                        Log.d("SERIAL", "PORT IS NULL");
//                    }
//                } else {
//                    Log.d("SERIAL", "PERM NOT GRANTED");
//                }
//            } else if (intent.getAction().equals(UsbManager.ACTION_USB_DEVICE_ATTACHED)) {
//                onClickStart(startButton);
//            } else if (intent.getAction().equals(UsbManager.ACTION_USB_DEVICE_DETACHED)) {
//                onClickStop(stopButton);
//            }
//        };
//    };
}
