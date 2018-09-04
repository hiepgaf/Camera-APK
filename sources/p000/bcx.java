package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: bcx */
public final class bcx implements geu {
    /* renamed from: a */
    private static final String f10678a = bli.m862a("NewVideoBroadcastTask");
    /* renamed from: b */
    private Uri f10679b;

    public bcx(Uri uri) {
        this.f10679b = uri;
    }

    public final void addFinishedCallback(iqb iqb) {
    }

    public final get getSession() {
        return null;
    }

    public final void process(Context context) {
        String str = f10678a;
        String valueOf = String.valueOf(this.f10679b);
        String str2 = "android.hardware.action.NEW_VIDEO";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 23) + String.valueOf(valueOf).length());
        stringBuilder.append("Sending broadcast: ");
        stringBuilder.append(str2);
        stringBuilder.append(" -> ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        Intent intent = new Intent(str2, this.f10679b);
        intent.addFlags(1073741824);
        intent.addFlags(1);
        context.sendBroadcast(intent);
    }

    public final void removeFinishedCallback(iqb iqb) {
    }

    public final void resume() {
    }

    public final void suspend() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10679b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("NewVideoBroadcastTask{ uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
