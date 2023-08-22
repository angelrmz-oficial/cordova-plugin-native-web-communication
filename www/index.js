var exec = require('cordova/exec');

var NativeWebCommunicationPlugin = {
    enviarDatosAlWeb: function(successCallback, errorCallback, datos) {
        exec(successCallback, errorCallback, 'NativeWebCommunicationPlugin', 'enviarDatosAlWeb', [datos]);
    }
};

module.exports = NativeWebCommunicationPlugin;
