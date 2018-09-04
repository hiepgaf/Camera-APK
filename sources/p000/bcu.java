package p000;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: bcu */
public final class bcu implements geu {
    /* renamed from: a */
    private static final String f10675a = bli.m862a("NewImageBroadcaster");
    /* renamed from: b */
    private Uri f10676b;

    public bcu(Uri uri) {
        this.f10676b = uri;
    }

    public final void addFinishedCallback(iqb iqb) {
    }

    public final get getSession() {
        return null;
    }

    public final void process(Context context) {
        String str = f10675a;
        String valueOf = String.valueOf(this.f10676b);
        String str2 = "android.hardware.action.NEW_PICTURE";
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str2).length() + 23) + String.valueOf(valueOf).length());
        stringBuilder.append("Sending broadcast: ");
        stringBuilder.append(str2);
        stringBuilder.append(" -> ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        Intent intent = new Intent(str2, this.f10676b);
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
        String valueOf = String.valueOf(this.f10676b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 29);
        stringBuilder.append("NewImageBroadcastTask{ uri=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" }");
        return stringBuilder.toString();
    }
}
