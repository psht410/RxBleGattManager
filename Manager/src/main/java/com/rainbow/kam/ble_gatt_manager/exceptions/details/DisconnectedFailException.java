package com.rainbow.kam.ble_gatt_manager.exceptions.details;

import com.rainbow.kam.ble_gatt_manager.exceptions.GattException;

/**
 * Created by Kang Young Won on 2016-05-12.
 */
public class DisconnectedFailException extends GattException {
    private final String macAddress;


    public DisconnectedFailException(String macAddress, String subMessage) {
        super(subMessage);
        this.macAddress = macAddress;
    }


    @Override public String toString() {
        return "DisconnectedFailException{ " +
                "macAddress -> '" + macAddress + '\'' +
                "subMessage -> '" + getMessage() + '\'' +
                '}';
    }
}