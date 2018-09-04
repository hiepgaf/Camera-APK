package p000;

import com.google.android.apps.refocus.processing.FocusSettings;

/* compiled from: PG */
/* renamed from: hrx */
public final class hrx {
    /* renamed from: a */
    public FocusSettings f6531a;

    /* renamed from: a */
    public static hrx m3318a(FocusSettings focusSettings) {
        hrx hrx = new hrx();
        hrx.f6531a = focusSettings;
        return hrx;
    }

    /* renamed from: a */
    public static hrx m3319a(wd wdVar) {
        if (wdVar == null) {
            return null;
        }
        hrx.m3320a();
        if (!wdVar.mo2525b("http://ns.google.com/photos/1.0/focus/", "FocalDistance") || !wdVar.mo2525b("http://ns.google.com/photos/1.0/focus/", "BlurAtInfinity")) {
            return null;
        }
        FocusSettings focusSettings = new FocusSettings();
        try {
            focusSettings.focalDistance = wdVar.mo2532h("http://ns.google.com/photos/1.0/focus/", "FocalDistance").floatValue();
            focusSettings.blurAtInfinity = wdVar.mo2532h("http://ns.google.com/photos/1.0/focus/", "BlurAtInfinity").floatValue();
            if (wdVar.mo2525b("http://ns.google.com/photos/1.0/focus/", "DepthOfField")) {
                try {
                    focusSettings.depthOfField = wdVar.mo2532h("http://ns.google.com/photos/1.0/focus/", "DepthOfField").floatValue();
                } catch (Throwable e) {
                    kqg.f8420a.mo2210b(e);
                }
            }
            if (wdVar.mo2525b("http://ns.google.com/photos/1.0/focus/", "FocalPointX") && wdVar.mo2525b("http://ns.google.com/photos/1.0/focus/", "FocalPointY")) {
                try {
                    focusSettings.focalPointX = wdVar.mo2532h("http://ns.google.com/photos/1.0/focus/", "FocalPointX").floatValue();
                    focusSettings.focalPointY = wdVar.mo2532h("http://ns.google.com/photos/1.0/focus/", "FocalPointY").floatValue();
                } catch (Throwable e2) {
                    kqg.f8420a.mo2210b(e2);
                }
            }
            return hrx.m3318a(focusSettings);
        } catch (Throwable e3) {
            kqg.f8420a.mo2210b(e3);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3320a() {
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/focus/", "GFocus");
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }
}
