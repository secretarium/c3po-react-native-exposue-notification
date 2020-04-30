# @secretarium/react-native-exposure-notification

Secretarium Exposure Notification component for C3PO.
This component aims are providing Bluetooth based Exposure Notification (Contact Tracing) for react-native. It it coded in Kotlin for Android and Swift for iOS.

The original motivation for this package was the creation of a proof-of-concept and technological demonstration in confidential computing privacy-first application for mitigation of population risk in the dawn of the Covid-19 crisis.

The current package supports the following:

- [ ] Android Exposure Notification (Contact Tracing)
- [ ] iOS Exposure Notification (Contact Tracing)


## Installation

```sh
yarn install @secretarium/react-native-exposure-notification
```

### Setting up the Android Project

In `AndroidManifest.xml`, add Bluetooth permissions and update <uses-sdk/>:
```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android" package="...">
    <uses-permission android:name="android.permission.BLUETOOTH"/>
    <uses-permission android:name="android.permission.BLUETOOTH_ADMIN"/>
    <uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
    ...
</manifest>

```

### Setting up the iOS Project

On your `Info.plist` file, include: 
```xml
<dict>
    ...
    <key>NSBluetoothAlwaysUsageDescription</key>
    <string>We uses Bluetooth to scan other beacons around.</string>
    <key>UIBackgroundModes</key>
    <array>
        <string>bluetooth-central</string>
        <string>bluetooth-peripheral</string>
        ...
    </array>
    <key>UIRequiredDeviceCapabilities</key>
    <array>
        <string>bluetooth-le</string>
        ...
    </array>
</dict>
```

## Usage

```js
import C3POReactNativeExpoNotif from "@secretarium/react-native-exposure-notification";

await C3POReactNativeExpoNotif.setManufacturerId(0xFFFF);
```

## License

MIT
