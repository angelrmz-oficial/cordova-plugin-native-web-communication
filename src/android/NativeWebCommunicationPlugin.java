package org.apache.cordova.nativeweb;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

public class NativeWebCommunicationPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("sendMessageToNative".equals(action)) {
            String message = args.getString(0);
            // Realiza acciones en la parte nativa con el mensaje recibido
            callbackContext.success("Message received by native");
            return true;
        }
        return false;
    }
}