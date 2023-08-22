package org.apache.cordova.nativeweb;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class NativeWebCommunicationPlugin extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("enviarDatosAlWeb".equals(action)) {
            String datosAEnviar = args.getString(0);

            // Crea un PluginResult y envíalo al lado JavaScript
            PluginResult result = new PluginResult(PluginResult.Status.OK, datosAEnviar);
            callbackContext.sendPluginResult(result);

            return true;
        }
        return false;
    }
}