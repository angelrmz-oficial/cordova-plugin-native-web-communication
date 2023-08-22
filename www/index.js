var exec = require('cordova/exec');

var NativeWebCommunicationPlugin = {
    sendMessageToNative: function(message, successCallback, errorCallback) {
        exec(successCallback, errorCallback, 'NativeWebCommunicationPlugin', 'sendMessageToNative', [message]);
    }
};

module.exports = NativeWebCommunicationPlugin;