package com.haierbiomedical.deviceaidl.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import androidx.annotation.Nullable;

import com.haierbiomedical.deviceaidl.IMyAidlInterface;
import com.haierbiomedical.deviceaidl.bean.DoorBean;
import com.haierbiomedical.deviceaidl.bean.FingerBean;

import java.util.List;

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return stub;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    private final IMyAidlInterface.Stub stub = new IMyAidlInterface.Stub() {
        @Override
        public String openDoor(DoorBean door) throws RemoteException {
            return "open door";
        }

        @Override
        public String getDoorStatus(DoorBean door) throws RemoteException {
            return "get door status";
        }

        @Override
        public List<DoorBean> getAllDoorStatus() throws RemoteException {
            Log.d("MyService","GetAllDoorstatus");
            return null;
        }

        @Override
        public String openFinger() throws RemoteException {
            return "open finger";
        }

        @Override
        public String stopFinger() throws RemoteException {
            return "stop finger";
        }

        @Override
        public String seartFinger(FingerBean finger) throws RemoteException {
            return "search finger";
        }

        @Override
        public String removeFinger(FingerBean finger) throws RemoteException {
            return "remove finger";
        }

        @Override
        public String removeAllFinger() throws RemoteException {
            return "remove all fingers";
        }
    };
}
