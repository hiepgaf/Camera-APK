package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: ezr */
public final class ezr implements eyu {
    /* renamed from: a */
    private final /* synthetic */ File f15812a;
    /* renamed from: b */
    private final /* synthetic */ eyu f15813b;

    public ezr(File file, eyu eyu) {
        this.f15812a = file;
        this.f15813b = eyu;
    }

    /* renamed from: a */
    public final void mo1290a() {
        String valueOf = String.valueOf(this.f15812a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
        stringBuilder.append("Microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" was cancelled by the trimmer.");
        Log.d("MvLogging", stringBuilder.toString());
        this.f15813b.mo1290a();
    }

    /* renamed from: a */
    public final void mo1291a(long j) {
        String valueOf = String.valueOf(this.f15812a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
        stringBuilder.append("Microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" ended at ");
        stringBuilder.append(j);
        Log.d("MvLogging", stringBuilder.toString());
        this.f15813b.mo1291a(j);
    }
}
