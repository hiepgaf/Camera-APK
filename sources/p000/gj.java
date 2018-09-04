package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: gj */
public final class gj {
    /* renamed from: a */
    public final IntentFilter f5261a;
    /* renamed from: b */
    public final BroadcastReceiver f5262b;
    /* renamed from: c */
    public boolean f5263c;

    public gj(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f5261a = intentFilter;
        this.f5262b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        stringBuilder.append(this.f5262b);
        stringBuilder.append(" filter=");
        stringBuilder.append(this.f5261a);
        if (this.f5263c) {
            stringBuilder.append(" DEAD");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
