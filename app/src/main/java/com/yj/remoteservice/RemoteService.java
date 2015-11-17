package com.yj.remoteservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

public class RemoteService extends Service {
    private final String TAG = "RemoteService";

    public RemoteService() {
    }

    @Override
    public void onCreate() {
        Log.i(TAG, "onCreate()");
        super.onCreate();
    }

    @Override
    public IBinder onBind(Intent intent) {
        Log.i(TAG, "onBind");
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
        return new myConn();


    }

    public class myConn extends myService.Stub {

        @Override
        public void callMethodInService() throws RemoteException {
            printSomething();
        }
    }

    /**
     * 服务里的一个方法
     */
    public void printSomething() {
        Log.i(TAG, "调用printSomething成功");
    }
}
