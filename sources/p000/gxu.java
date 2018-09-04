package p000;

import android.content.Context;
import android.graphics.Rect;
import android.util.Size;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxu */
public final class gxu {
    /* renamed from: a */
    private static final String f5778a = bli.m862a("CamBoxHelper");

    /* renamed from: a */
    private static int m2876a(float f) {
        return f >= 0.0f ? (int) f : 0;
    }

    /* renamed from: a */
    private static gxv m2879a(Size size, Size size2, hir hir, boolean z, Context context) {
        String str = f5778a;
        String valueOf = String.valueOf(size);
        String valueOf2 = String.valueOf(size2);
        String valueOf3 = String.valueOf(hir);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("Computing layout for window: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", and preview: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", orientation: ");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", isMultiWindow: ");
        stringBuilder.append(z);
        bli.m869c(str, stringBuilder.toString());
        if (z) {
            int width = size.getWidth();
            int height = size.getHeight();
            int a = height - hhz.m3152a(84.0f);
            int a2 = gxu.m2877a(context);
            gxv a3 = gxv.m2883i().m3003a(size).m3007e(new Rect(0, 0, width, height)).m3008f(new Rect(0, 0, width, a2)).m3006d(new Rect(0, 0, width, hhz.m3152a(72.0f))).m3002a(new Rect(0, a, width, height)).m3009g(new Rect(0, a2, width, a)).m3005c(new Rect(0, a - hhz.m3152a(44.0f), width, a)).m3004b(new Rect(0, 0, width, height)).m3001a();
            valueOf = f5778a;
            valueOf2 = String.valueOf(a3);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
            stringBuilder2.append("Computed layout: ");
            stringBuilder2.append(valueOf2);
            bli.m869c(valueOf, stringBuilder2.toString());
            return a3;
        }
        Size size3;
        Size a4 = gxu.m2878a(size, hir);
        Size a5 = gxu.m2878a(size2, hir);
        length = a4.getWidth();
        int height2 = a4.getHeight();
        int a6 = hhz.m3152a(48.0f);
        height = (length << 2) / 3;
        int a7 = gxu.m2877a(context);
        int a8 = hhz.m3152a(72.0f);
        int a9 = hhz.m3152a(44.0f);
        width = height + a7;
        if (height2 - width < hhz.m3152a(135.0f)) {
            width = height;
        }
        Rect rect = new Rect(0, a7, length, width);
        if (a5.getWidth() == 0) {
            rect = new Rect(0, 0, 0, 0);
        } else {
            a2 = (a5.getHeight() * a4.getWidth()) / a5.getWidth();
            if (a2 == a4.getHeight()) {
                rect = new Rect(0, 0, a4.getWidth(), a4.getHeight());
            } else if (a2 != rect.height()) {
                if (a2 <= rect.height() + a7) {
                    bli.m869c(f5778a, "Positioning the preview above the bottom bar");
                    rect = new Rect(0, 0, a4.getWidth(), a2);
                } else if (a4.getHeight() - a2 >= (a7 + a6) - ((int) (((float) a6) * 0.3f))) {
                    bli.m869c(f5778a, "Positioning the preview between the top bar and the navigation bar");
                    rect = new Rect(0, a7, a4.getWidth(), a2 + a7);
                } else {
                    bli.m866b(f5778a, "Cannot position preview using standard methods!");
                    rect = new Rect(0, 0, a4.getWidth(), a2);
                }
            }
        }
        gxv a10 = gxv.m2883i().m3003a(a4).m3008f(new Rect(0, 0, length, a7)).m3006d(new Rect(0, 0, length, a8)).m3002a(new Rect(0, width, length, height2)).m3005c(new Rect(0, width - a9, length, width)).m3009g(new Rect(0, a8, length, width)).m3007e(rect).m3004b(new Rect(0, 0, length, height2)).m3001a();
        Size h = a10.mo1682h();
        switch (hir.ordinal()) {
            case 0:
            case 3:
                size3 = h;
                break;
            case 1:
            case 2:
                size3 = new Size(h.getHeight(), h.getWidth());
                break;
            default:
                valueOf = String.valueOf(hir);
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder3.append("Unexpected UI Orientation: ");
                stringBuilder3.append(valueOf);
                throw new RuntimeException(stringBuilder3.toString());
        }
        a3 = gxv.m2883i().m3003a(size3).m3007e(gxv.m2882a(a10.mo1679e(), size3, hir)).m3009g(gxv.m2882a(a10.mo1681g(), size3, hir)).m3008f(gxv.m2882a(a10.mo1680f(), size3, hir)).m3006d(gxv.m2882a(a10.mo1678d(), size3, hir)).m3002a(gxv.m2882a(a10.mo1675a(), size3, hir)).m3005c(gxv.m2882a(a10.mo1677c(), size3, hir)).m3004b(gxv.m2882a(a10.mo1676b(), size3, hir)).m3001a();
        valueOf = f5778a;
        valueOf2 = String.valueOf(a3);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
        stringBuilder2.append("Computed layout: ");
        stringBuilder2.append(valueOf2);
        bli.m869c(valueOf, stringBuilder2.toString());
        return a3;
    }

    /* renamed from: a */
    public static gxv m2880a(gxw gxw, boolean z, Context context) {
        if (gxw.mo1687e()) {
            return gxu.m2879a(gxw.mo1686d(), gxw.mo1686d(), gxw.mo1683a(), z, context);
        }
        return gxu.m2879a(gxw.mo1686d(), gxw.mo1684b(), gxw.mo1683a(), z, context);
    }

    /* renamed from: a */
    private static Size m2878a(Size size, hir hir) {
        switch (hir.ordinal()) {
            case 0:
            case 3:
                return size;
            case 1:
            case 2:
                return new Size(size.getHeight(), size.getWidth());
            default:
                String valueOf = String.valueOf(hir);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Unknown UI orientation: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    private static int m2877a(Context context) {
        return context.getResources().getDimensionPixelSize(R.dimen.topbar_height);
    }

    /* renamed from: a */
    public static gyh m2881a(Size size, Rect rect, ipz ipz, boolean z, int i) {
        int height;
        Size size2;
        int i2 = 1;
        if (z) {
            int width = size.getWidth();
            height = size.getHeight();
            if (!(i == gcb.f5051a || i == gcb.f5052b)) {
                i2 = 0;
            }
            if (i2 != 0) {
                height = (int) (((float) size.getWidth()) * ipz.m4026b());
            } else {
                width = (int) (((float) size.getHeight()) * ipz.m4026b());
            }
            Size size3 = new Size(width, height);
            height = 17;
            size2 = size3;
        } else {
            size2 = new Size(-1, -1);
            height = 51;
        }
        return new gxt(size2, new Rect(gxu.m2876a((float) rect.left), gxu.m2876a((float) rect.top), size.getWidth() - gxu.m2876a((float) rect.right), size.getHeight() - gxu.m2876a((float) rect.bottom)), new Rect(0, 0, 0, 0), height);
    }
}
