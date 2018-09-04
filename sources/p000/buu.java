package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: buu */
final class buu implements glq {
    /* renamed from: a */
    private final /* synthetic */ but f11306a;

    buu(but but) {
        this.f11306a = but;
    }

    /* renamed from: a */
    public final void mo580a(Uri uri) {
        but but = this.f11306a;
        if (but.f11304e.containsKey(uri)) {
            ((buo) but.f11304e.get(uri)).close();
            but.f11304e.remove(uri);
        }
    }

    /* renamed from: a */
    public final void mo579a(Bitmap bitmap, int i) {
    }

    /* renamed from: a */
    public final void mo585a(Uri uri, List list) {
        bli.m869c(buk.f1597a, "onSessionDone");
        but but = this.f11306a;
        if (but.f11304e.containsKey(uri)) {
            ((buo) but.f11304e.get(uri)).close();
            but.f11304e.remove(uri);
        }
    }

    /* renamed from: a */
    public final void mo584a(Uri uri, hec hec, boolean z) {
        but but = this.f11306a;
        if (but.f11304e.containsKey(uri)) {
            ((buo) but.f11304e.get(uri)).close();
            but.f11304e.remove(uri);
        }
    }

    /* renamed from: b */
    public final void mo587b(Uri uri) {
    }

    /* renamed from: a */
    public final void mo586a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo581a(Uri uri, int i) {
        buo buo = (buo) this.f11306a.f11304e.get(uri);
        if (buo != null) {
            buo.mo2706a(i);
        }
    }

    /* renamed from: a */
    public final void mo583a(Uri uri, hec hec) {
    }

    /* renamed from: a */
    public final void mo582a(Uri uri, glw glw, eqi eqi) {
        if (eqi == null) {
            bli.m866b(buk.f1597a, "sessionUri has no MediaStore record.");
            return;
        }
        String str = buk.f1597a;
        long b = eqi.mo1263b();
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("onSessionQueued: MediaStoreId=");
        stringBuilder.append(b);
        bli.m869c(str, stringBuilder.toString());
        if (eqi == null) {
            stringBuilder = new StringBuilder(93);
            stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            stringBuilder.append(1);
            throw new NullPointerException(stringBuilder.toString());
        }
        this.f11306a.f11304e.put(uri, new buq(eqi));
        bve bve = bve.NONE;
        switch (glw.ordinal()) {
            case 4:
                bve = bve.BURSTS;
                break;
            case 5:
                bve = bve.PANORAMA;
                break;
            case 6:
                bve = bve.PHOTOSPHERE;
                break;
            case 7:
            case 8:
                bve = bve.REFOCUS;
                break;
            case 13:
                bve = bve.PORTRAIT;
                break;
        }
        this.f11306a.f11302c.mo591a(eqi.mo1263b(), bve);
    }

    /* renamed from: a */
    public final void mo578a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo588c(Uri uri) {
        buo buo = (buo) this.f11306a.f11304e.get(uri);
        String str;
        if (buo != null) {
            str = buk.f1597a;
            long b = buo.mo2708b().mo1263b();
            StringBuilder stringBuilder = new StringBuilder(51);
            stringBuilder.append("onSessionUpdated: MediaStoreId=");
            stringBuilder.append(b);
            bli.m869c(str, stringBuilder.toString());
            kbg c = this.f11306a.f11303d.mo1644c(uri);
            if (c.mo2084b()) {
                String str2 = buk.f1597a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder2.append("  get thumbnail DrawableResource from Storage with sessionUri=");
                stringBuilder2.append(valueOf);
                bli.m871d(str2, stringBuilder2.toString());
                buo.mo2707a((agn) c.mo2081a());
                Uri c2 = buo.mo2708b().mo1264c();
                str = buk.f1597a;
                str2 = String.valueOf(c2);
                stringBuilder = new StringBuilder(String.valueOf(str2).length() + 32);
                stringBuilder.append("  ContentResolver.notifyChange: ");
                stringBuilder.append(str2);
                bli.m869c(str, stringBuilder.toString());
                this.f11306a.f11301b.notifyChange(c2, null);
                return;
            }
            String str3 = buk.f1597a;
            str = String.valueOf(uri);
            StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 38);
            stringBuilder3.append("thumbnailDrawable not present for uri ");
            stringBuilder3.append(str);
            bli.m866b(str3, stringBuilder3.toString());
            return;
        }
        str3 = buk.f1597a;
        str = String.valueOf(uri);
        stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder3.append("onSessionUpdated but no media is found: sessionUri=");
        stringBuilder3.append(str);
        bli.m873e(str3, stringBuilder3.toString());
    }
}
