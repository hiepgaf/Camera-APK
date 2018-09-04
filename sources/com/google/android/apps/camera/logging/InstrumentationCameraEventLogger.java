package com.google.android.apps.camera.logging;

import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import java.util.ArrayList;
import java.util.List;
import p000.epc;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationCameraEventLogger implements epc {
    /* renamed from: a */
    private static final Integer f12269a = Integer.valueOf(100);
    /* renamed from: b */
    private static final List f12270b = new ArrayList();

    @UsedByReflection
    public static List getAndClearEvents() {
        List arrayList;
        synchronized (f12270b) {
            arrayList = new ArrayList(f12270b);
            f12270b.clear();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo774a(eventprotos$CameraEvent eventprotos_cameraevent) {
        synchronized (f12270b) {
            if (f12270b.size() == f12269a.intValue()) {
                f12270b.remove(f12270b.size() - 1);
            }
            f12270b.add(eventprotos_cameraevent);
        }
    }
}
