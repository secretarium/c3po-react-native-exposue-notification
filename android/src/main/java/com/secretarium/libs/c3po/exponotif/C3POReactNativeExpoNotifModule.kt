package com.secretarium.libs.c3po.exponotif

import android.bluetooth.BluetoothAdapter
import android.bluetooth.le.*
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.ParcelUuid
import android.util.Log
import com.facebook.react.bridge.*
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter
import com.secretarium.libs.c3po.exponotif.C3POErrorTypes.*

class C3POReactNativeExpoNotifModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    companion object {
        const val displayName = "C3POReactNativeExpoNotif"
    }

    override fun getName(): String {
        return "C3POReactNativeExpoNotif"
    }

    private fun sendEvent(eventName: String, params: WritableMap?): Unit {
        reactApplicationContext
                .getJSModule(RCTDeviceEventEmitter::class.java)
                .emit(eventName, params)
    }
}