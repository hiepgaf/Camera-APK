package p000;

import android.os.Environment;

/* compiled from: PG */
/* renamed from: guh */
final class guh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f5699a;
    /* renamed from: b */
    private final /* synthetic */ boolean f5700b;
    /* renamed from: c */
    private final /* synthetic */ gug f5701c;

    guh(gug gug, kpw kpw, boolean z) {
        this.f5701c = gug;
        this.f5699a = kpw;
        this.f5700b = z;
    }

    public final void run() {
        long j = -1;
        bli.m863a(gug.f17355a, "start calculating the available storage space");
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            String valueOf;
            StringBuilder stringBuilder;
            if (!this.f5701c.f17358d.mo1623a().exists()) {
                externalStorageState = gug.f17355a;
                valueOf = String.valueOf(this.f5701c.f17358d.mo1623a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
                stringBuilder.append("create the media folder: ");
                stringBuilder.append(valueOf);
                bli.m863a(externalStorageState, stringBuilder.toString());
                if (!(this.f5701c.f17358d.mo1623a().mkdirs() || this.f5701c.f17358d.mo1623a().exists())) {
                    externalStorageState = gug.f17355a;
                    valueOf = String.valueOf(this.f5701c.f17358d.mo1623a());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to create the media folder: ");
                    stringBuilder.append(valueOf);
                    bli.m873e(externalStorageState, stringBuilder.toString());
                    this.f5699a.mo3557a(Long.valueOf(-1));
                    return;
                }
            }
            if (!this.f5701c.f17358d.mo1623a().isDirectory()) {
                externalStorageState = gug.f17355a;
                valueOf = String.valueOf(this.f5701c.f17358d.mo1623a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("the media folder is not a folder: ");
                stringBuilder.append(valueOf);
                bli.m873e(externalStorageState, stringBuilder.toString());
                this.f5699a.mo3557a(Long.valueOf(-1));
                return;
            } else if (this.f5701c.f17358d.mo1623a().canWrite()) {
                long j2;
                gug gug = this.f5701c;
                long a = gug.f17359e.m2833a(gug.f17358d);
                if (this.f5700b) {
                    j2 = this.f5701c.f17357c;
                } else {
                    j2 = this.f5701c.f17356b;
                }
                if (a > j2) {
                    j = a - j2;
                }
                this.f5699a.mo3557a(Long.valueOf(j));
                return;
            } else {
                externalStorageState = gug.f17355a;
                valueOf = String.valueOf(this.f5701c.f17358d.mo1623a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("the media folder is not writable: ");
                stringBuilder.append(valueOf);
                bli.m873e(externalStorageState, stringBuilder.toString());
                this.f5699a.mo3557a(Long.valueOf(-1));
                return;
            }
        }
        this.f5699a.mo3557a(Long.valueOf(-1));
        String str = gug.f17355a;
        String valueOf2 = String.valueOf(externalStorageState);
        externalStorageState = "the current state of the primary shared/external storage media: ";
        if (valueOf2.length() == 0) {
            valueOf2 = new String(externalStorageState);
        } else {
            valueOf2 = externalStorageState.concat(valueOf2);
        }
        bli.m873e(str, valueOf2);
    }
}
