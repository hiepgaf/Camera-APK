package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CameraManager.AvailabilityCallback;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bmp */
public final class bmp {
    /* renamed from: a */
    public final Object f1319a = new Object();
    /* renamed from: b */
    public kpw f1320b;
    /* renamed from: c */
    private final CameraManager f1321c;
    /* renamed from: d */
    private final irs f1322d;
    /* renamed from: e */
    private final Executor f1323e;

    public bmp(CameraManager cameraManager, irs irs, Executor executor) {
        this.f1321c = cameraManager;
        this.f1322d = irs;
        this.f1323e = executor;
    }

    /* renamed from: a */
    public final kpk m890a() {
        try {
            String[] cameraIdList = this.f1321c.getCameraIdList();
            if (cameraIdList != null && cameraIdList.length > 0) {
                return kow.m13617a(Boolean.valueOf(true));
            }
        } catch (CameraAccessException e) {
        }
        return m889c();
    }

    /* renamed from: b */
    final boolean m891b() {
        AvailabilityCallback bmr;
        InterruptedException e;
        AvailabilityCallback availabilityCallback;
        Throwable th;
        CameraAccessException e2;
        Object obj;
        AvailabilityCallback availabilityCallback2 = null;
        Log.w("CamDeviceVerify", "Attempting to reconnect to the camera service with a 7000ms timeout in 200ms increments.");
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        try {
            ikb ikb = new ikb();
            try {
                bmr = new bmr(atomicBoolean);
                try {
                    this.f1321c.registerAvailabilityCallback(bmr, ijy.m3789a(ikb, "PollUntilReconnect"));
                    int i = 0;
                    while (i < 35) {
                        String[] cameraIdList = this.f1321c.getCameraIdList();
                        if (cameraIdList == null || cameraIdList.length <= 0 || !atomicBoolean.get()) {
                            Thread.sleep(200, 0);
                            i++;
                        } else {
                            i = (i + 1) * 200;
                            StringBuilder stringBuilder = new StringBuilder(69);
                            stringBuilder.append("Camera Manager reconnect attempted and succeeded after ~");
                            stringBuilder.append(i);
                            stringBuilder.append("ms");
                            Log.w("CamDeviceVerify", stringBuilder.toString());
                            this.f1322d.mo1583a(irt.SUCCESS);
                            try {
                                ikb.close();
                                this.f1321c.unregisterAvailabilityCallback(bmr);
                                return true;
                            } catch (CameraAccessException e3) {
                                e = e3;
                                availabilityCallback = bmr;
                                bmr = e;
                                availabilityCallback2 = availabilityCallback;
                                try {
                                    Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
                                    this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
                                    if (availabilityCallback2 != null) {
                                        this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
                                    }
                                    return false;
                                } catch (Throwable th2) {
                                    availabilityCallback = availabilityCallback2;
                                    th = th2;
                                    bmr = availabilityCallback;
                                    if (bmr != null) {
                                        this.f1321c.unregisterAvailabilityCallback(bmr);
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException e4) {
                                e = e4;
                                availabilityCallback = bmr;
                                bmr = e;
                                availabilityCallback2 = availabilityCallback;
                                Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
                                this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
                                if (availabilityCallback2 != null) {
                                    this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
                                }
                                return false;
                            } catch (Throwable th3) {
                                th = th3;
                                if (bmr != null) {
                                    this.f1321c.unregisterAvailabilityCallback(bmr);
                                }
                                throw th;
                            }
                        }
                    }
                    Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.");
                    this.f1322d.mo1583a(irt.FAIL_TIMEOUT);
                    ikb.close();
                    this.f1321c.unregisterAvailabilityCallback(bmr);
                    return false;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th22) {
                th = th22;
                bmr = null;
                try {
                    throw th;
                } catch (CameraAccessException e5) {
                    e2 = e5;
                    availabilityCallback = bmr;
                    obj = e2;
                    availabilityCallback2 = availabilityCallback;
                    Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
                    this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
                    if (availabilityCallback2 != null) {
                        this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
                    }
                    return false;
                } catch (InterruptedException e6) {
                    e2 = e6;
                    availabilityCallback = bmr;
                    obj = e2;
                    availabilityCallback2 = availabilityCallback;
                    Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
                    this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
                    if (availabilityCallback2 != null) {
                        this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
                    }
                    return false;
                } catch (Throwable th5) {
                    th = th5;
                    if (bmr != null) {
                        this.f1321c.unregisterAvailabilityCallback(bmr);
                    }
                    throw th;
                }
            }
        } catch (CameraAccessException e7) {
            bmr = e7;
            Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
            this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
            if (availabilityCallback2 != null) {
                this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
            }
            return false;
        } catch (InterruptedException e8) {
            bmr = e8;
            Log.e("CamDeviceVerify", "Camera Manager reconnect failed, or there are no cameras on this device.", bmr);
            this.f1322d.mo1583a(irt.FAIL_EXCEPTION);
            if (availabilityCallback2 != null) {
                this.f1321c.unregisterAvailabilityCallback(availabilityCallback2);
            }
            return false;
        } catch (Throwable th222) {
            th = th222;
            bmr = null;
            if (bmr != null) {
                this.f1321c.unregisterAvailabilityCallback(bmr);
            }
            throw th;
        }
    }

    /* renamed from: c */
    private final kpk m889c() {
        Object obj;
        kpk kpk;
        synchronized (this.f1319a) {
            if (this.f1320b == null) {
                this.f1320b = kpw.m18056d();
                obj = 1;
            } else {
                obj = null;
            }
            kpk = this.f1320b;
        }
        if (obj != null) {
            this.f1323e.execute(new bmq(this));
        }
        return kpk;
    }
}
