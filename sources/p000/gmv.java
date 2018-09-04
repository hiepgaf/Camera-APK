package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gmv */
public final class gmv implements glq {
    /* renamed from: c */
    private static final String f17092c = bli.m862a("Photos1UpLauncher");
    /* renamed from: a */
    public final Set f17093a = new HashSet();
    /* renamed from: b */
    public final Map f17094b = new HashMap();

    /* renamed from: a */
    public final void mo580a(Uri uri) {
    }

    /* renamed from: a */
    public final void mo579a(Bitmap bitmap, int i) {
    }

    /* renamed from: a */
    public final void mo585a(Uri uri, List list) {
        if (this.f17093a.contains(uri)) {
            String str = f17092c;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("thumbnail not updated as of yet for uri ");
            stringBuilder.append(valueOf);
            bli.m869c(str, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo584a(Uri uri, hec hec, boolean z) {
    }

    /* renamed from: b */
    public final void mo587b(Uri uri) {
    }

    /* renamed from: a */
    public final void mo586a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo581a(Uri uri, int i) {
    }

    /* renamed from: a */
    public final void mo583a(Uri uri, hec hec) {
    }

    /* renamed from: a */
    public final void mo582a(Uri uri, glw glw, eqi eqi) {
        String str = f17092c;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
        stringBuilder.append("adding uri to processing items ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        this.f17093a.add(uri);
        if (eqi != null) {
            this.f17094b.put(uri, eqi);
            str = f17092c;
            valueOf = String.valueOf(uri);
            long b = eqi.mo1263b();
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 46);
            stringBuilder2.append(valueOf);
            stringBuilder2.append(" maps to mediastorerecord ");
            stringBuilder2.append(b);
            bli.m871d(str, stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    public final void mo578a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo588c(Uri uri) {
        String str = f17092c;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 56);
        stringBuilder.append("removing uri from processing items as we have thumbnail ");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        this.f17093a.remove(uri);
    }
}
