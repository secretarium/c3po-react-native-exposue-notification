#import <Foundation/Foundation.h>
#import <React/RCTBridgeModule.h>
#import <React/RCTEventEmitter.h>

@interface RCT_EXTERN_MODULE(C3POReactNativeExpoNotif, RCTEventEmitter)

    + (BOOL)requiresMainQueueSetup
    {
        return YES;
    }
    
    RCT_EXTERN_METHOD(
        supportedEvents:
    )

@end
    
