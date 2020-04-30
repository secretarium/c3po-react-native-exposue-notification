package com.secretarium.libs.c3po.exponotif

enum class C3POErrorTypes(val meaning: String) {

    ECOMPINVALID("Invalid company ID"),
    ECNTSCAN("Couldn't start scanning"),
    ECNTBROAD("Couldn't start broadcasting"),
    EBLNAVAILABLE("Bluetooth unavailable"),
    EBLDISABLED("Bluetooth disabled"),
    ESCNAVAILABLE("Scanner unavailable"),
    EADNAVAILABLE("Advertiser unavailable"),
    EADNSUPPORTED("Advertiser > This feature is not supported on this platform."),
    EADNINSTANCE("Advertiser > No advertising instance is available."),
    EADARUNNING("Advertiser > Advertising is already started."),
    EADDTOOLARGE("Advertiser > Broadcasted data bigger than 31 bytes."),
    EADINTERROR("Advertiser > Internal error.")
}
