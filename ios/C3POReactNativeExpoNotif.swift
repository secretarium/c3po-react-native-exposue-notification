//
//  C3POReactNativeExpoNotif.swift
//  C3POReactNativeExpoNotif
//
//  Created by Florian Guitton on 15/04/2020.
//

import Foundation

@objc(C3POReactNativeExpoNotif)
open class C3POReactNativeExpoNotif: RCTEventEmitter {

    public override static func moduleName() -> String! {
        return "C3POReactNativeExpoNotif"
    }

    @objc
    open override func supportedEvents() -> [String] {
        return ["onDeviceFound", "onBluetoothStateChange"]
    }
}
