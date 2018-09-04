package p000;

import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: PG */
/* renamed from: ejx */
public final class ejx extends Thread {
    /* renamed from: c */
    private static final String f3703c = bli.m862a("IncrementalAligner");
    /* renamed from: a */
    public final ArrayBlockingQueue f3704a = new ArrayBlockingQueue(50);
    /* renamed from: b */
    public boolean f3705b = false;
    /* renamed from: d */
    private emc f3706d = null;
    /* renamed from: e */
    private Boolean f3707e = Boolean.valueOf(false);

    public final void interrupt() {
        this.f3704a.add("Poison Pill");
    }

    public final void run() {
        while (!isInterrupted()) {
            boolean z;
            ArrayList arrayList = new ArrayList();
            try {
                String str = (String) this.f3704a.take();
                this.f3705b = true;
                arrayList.add(str);
                while (!this.f3704a.isEmpty()) {
                    arrayList.add((String) this.f3704a.take());
                }
            } catch (InterruptedException e) {
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                str = (String) arrayList.get(i);
                if (!"Poison Pill".equals(str)) {
                    if (this.f3707e.booleanValue()) {
                        z = true;
                        break;
                    }
                    str = String.valueOf(str);
                    String str2 = "Processing file ";
                    if (str.length() == 0) {
                        str = new String(str2);
                    } else {
                        str2.concat(str);
                    }
                    LightCycle.m1290a();
                    i = i2;
                } else {
                    z = true;
                    break;
                }
            }
            z = false;
            this.f3705b = false;
            if (z) {
                break;
            }
        }
        bli.m863a(f3703c, "Incremental aligner shutting down. Firing callback ...");
        emc emc = this.f3706d;
        if (emc != null) {
            emc.mo1141a(null);
        }
        bli.m863a(f3703c, "Incremental aligner thread shut down. Bye.");
    }

    /* renamed from: a */
    public final synchronized void m1817a(emc emc) {
        if (isInterrupted() || !isAlive()) {
            throw new RuntimeException("IncrementalAligner is already shut down.");
        }
        this.f3706d = emc;
        this.f3707e = Boolean.valueOf(true);
        super.interrupt();
    }
}
