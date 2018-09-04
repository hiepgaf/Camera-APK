package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;
import android.util.LruCache;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.UUID;

@TargetApi(11)
/* compiled from: PG */
/* renamed from: gtr */
public final class gtr implements gsp {
    /* renamed from: a */
    public static final String f17329a = bli.m862a("StrgImpl");
    /* renamed from: c */
    private static HashMap f17330c = new HashMap();
    /* renamed from: d */
    private static HashMap f17331d = new HashMap();
    /* renamed from: e */
    private static final LruCache f17332e = new gts();
    /* renamed from: f */
    private static HashMap f17333f = new HashMap();
    /* renamed from: g */
    private static HashMap f17334g = new HashMap();
    /* renamed from: h */
    private static HashMap f17335h = new HashMap();
    /* renamed from: b */
    public final epw f17336b;
    /* renamed from: i */
    private final gsi f17337i;
    /* renamed from: j */
    private final gtf f17338j;

    gtr(gsi gsi, epw epw, gtf gtf) {
        this.f17337i = gsi;
        this.f17336b = epw;
        this.f17338j = gtf;
    }

    /* renamed from: a */
    public final void mo1640a(iqp iqp, long j, Uri uri) {
        int intValue;
        f17333f.put(uri, new Point(iqp.f7329a, iqp.f7330b));
        f17332e.remove(uri);
        Integer num = (Integer) f17334g.get(uri);
        HashMap hashMap = f17334g;
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 0;
        }
        hashMap.put(uri, Integer.valueOf(intValue));
        f17335h.put(uri, Long.valueOf(j));
    }

    /* renamed from: a */
    public final Uri mo1634a(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        Uri fromFile = Uri.fromFile(new File(str));
        intent.setData(fromFile);
        context.sendBroadcast(intent);
        return fromFile;
    }

    /* renamed from: a */
    private final Uri m11518a(ContentResolver contentResolver, String str, long j, kbg kbg, int i, String str2, int i2, int i3, ixx ixx) {
        File file = new File(str2);
        epy epy = new epy(this.f17336b);
        epy.f4067a = file;
        epy.f4068b = kbg;
        epy a = epy.m1995a(ixx);
        a.f4069c = iqm.m4037a(i);
        try {
            return contentResolver.insert(Media.EXTERNAL_CONTENT_URI, a.m1994a(new iqp(i2, i3)).m1993a(j).m1996a(str).m1992a().f4066a);
        } catch (Throwable th) {
            String str3 = f17329a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Failed to write MediaStore");
            stringBuilder.append(valueOf);
            bli.m866b(str3, stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo1639a(anq anq, long j, Uri uri) {
        f17335h.put(uri, Long.valueOf(j));
        mo1638a(uri, anq);
    }

    /* renamed from: a */
    private final Uri m11519a(ContentResolver contentResolver, String str, long j, kbg kbg, long j2, String str2, int i, int i2, ixx ixx) {
        File file = new File(str2);
        eqt eqt = new eqt(this.f17336b);
        eqt.f4089a = file;
        eqt.f4090b = kbg;
        try {
            return contentResolver.insert(Video.Media.EXTERNAL_CONTENT_URI, eqt.m2019a(ixx).m2018a(new iqp(i, i2)).m2017a(j2).m2021b(j).m2020a(str).m2016a().f4066a);
        } catch (Throwable th) {
            String str3 = f17329a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
            stringBuilder.append("Failed to write MediaStore");
            stringBuilder.append(valueOf);
            bli.m866b(str3, stringBuilder.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo1641a(Uri uri) {
        return f17333f.containsKey(uri);
    }

    /* renamed from: a */
    public final Uri mo1633a() {
        Builder builder = new Builder();
        builder.scheme("camera_session").authority("google.com").appendPath(UUID.randomUUID().toString());
        return builder.build();
    }

    /* renamed from: b */
    public final Uri mo1642b(Uri uri) {
        return (Uri) f17330c.get(uri);
    }

    /* renamed from: c */
    public final kbg mo1644c(Uri uri) {
        return kbg.m4744b((anq) f17332e.get(uri));
    }

    /* renamed from: d */
    public final Uri mo1645d(Uri uri) {
        return (Uri) f17331d.get(uri);
    }

    /* renamed from: e */
    public final Point mo1646e(Uri uri) {
        return (Point) f17333f.get(uri);
    }

    /* renamed from: f */
    public final long mo1647f(Uri uri) {
        if (!f17335h.containsKey(uri)) {
            String str = f17329a;
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
            stringBuilder.append("Using current time for session: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            f17335h.put(uri, Long.valueOf(System.currentTimeMillis()));
        }
        return ((Long) f17335h.get(uri)).longValue();
    }

    /* renamed from: a */
    private static File m11520a(gtf gtf, String str, ixx ixx) {
        File a = gtf.m2811a(str, ixx);
        int i = 1;
        while (a.exists()) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 12);
            stringBuilder.append(str);
            stringBuilder.append("_");
            stringBuilder.append(i);
            a = gtf.m2811a(stringBuilder.toString(), ixx);
            i++;
        }
        return a;
    }

    /* renamed from: g */
    public final boolean mo1648g(Uri uri) {
        return uri.getScheme().equals("camera_session");
    }

    /* renamed from: b */
    public final gsq mo1643b() {
        return new gsq(this);
    }

    /* renamed from: h */
    public final void mo1649h(Uri uri) {
        f17333f.remove(uri);
        f17332e.remove(uri);
        f17334g.remove(uri);
    }

    /* renamed from: a */
    public final void mo1638a(Uri uri, anq anq) {
        String str = f17329a;
        int size = f17332e.size();
        StringBuilder stringBuilder = new StringBuilder(38);
        stringBuilder.append("session bitmap cache size: ");
        stringBuilder.append(size);
        bli.m871d(str, stringBuilder.toString());
        if (anq.mo57d() > 20971520) {
            str = f17329a;
            size = anq.mo57d();
            stringBuilder = new StringBuilder(89);
            stringBuilder.append("place holder is too large to fit into the cache: expected=20971520 but actual=");
            stringBuilder.append(size);
            bli.m869c(str, stringBuilder.toString());
            return;
        }
        int intValue;
        Drawable f = anq.m6850f();
        f17333f.put(uri, new Point(f.getIntrinsicWidth(), f.getIntrinsicHeight()));
        f17332e.remove(uri);
        f17332e.put(uri, anq);
        Integer num = (Integer) f17334g.get(uri);
        HashMap hashMap = f17334g;
        if (num != null) {
            intValue = num.intValue() + 1;
        } else {
            intValue = 0;
        }
        hashMap.put(uri, Integer.valueOf(intValue));
    }

    /* renamed from: a */
    public final void mo1637a(Uri uri, Uri uri2) {
        String str = f17329a;
        String valueOf = String.valueOf(uri);
        String valueOf2 = String.valueOf(uri2);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 8) + String.valueOf(valueOf2).length());
        stringBuilder.append("map ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" to ");
        stringBuilder.append(valueOf2);
        bli.m869c(str, stringBuilder.toString());
        f17330c.put(uri2, uri);
        f17331d.put(uri, uri2);
    }

    /* renamed from: a */
    public final Uri mo1635a(Uri uri, ContentResolver contentResolver, String str, long j, kbg kbg, int i, kbg kbg2, InputStream inputStream, int i2, int i3, ixx ixx) {
        File a = gtr.m11520a(this.f17338j, str, ixx);
        if (ixx == ixx.JPEG) {
            this.f17337i.mo1613a(a, inputStream, kbg2);
        } else {
            this.f17337i.mo1613a(a, inputStream, kau.f19138a);
        }
        String absolutePath = a.getAbsolutePath();
        if (mo1648g(uri)) {
            Uri a2 = m11518a(contentResolver, str, j, kbg, i, absolutePath, i2, i3, ixx);
            mo1637a(a2, uri);
            return a2;
        }
        epy epy = new epy(this.f17336b);
        epy.f4067a = new File(absolutePath);
        epy.f4068b = kbg;
        epy = epy.m1995a(ixx);
        epy.f4069c = iqm.m4037a(i);
        contentResolver.update(uri, epy.m1994a(new iqp(i2, i3)).m1993a(j).m1996a(str).m1992a().f4066a, null, null);
        return uri;
    }

    /* renamed from: a */
    public final Uri mo1636a(Uri uri, ContentResolver contentResolver, String str, long j, kbg kbg, long j2, InputStream inputStream, int i, int i2, ixx ixx) {
        File a = gtr.m11520a(this.f17338j, str, ixx);
        this.f17337i.mo1612a(a, inputStream);
        String absolutePath = a.getAbsolutePath();
        if (mo1648g(uri)) {
            Uri a2 = m11519a(contentResolver, str, j, kbg, j2, absolutePath, i, i2, ixx);
            mo1637a(a2, uri);
            return a2;
        }
        eqt eqt = new eqt(this.f17336b);
        eqt.f4089a = new File(absolutePath);
        eqt.f4090b = kbg;
        contentResolver.update(uri, eqt.m2019a(ixx).m2018a(new iqp(i, i2)).m2017a(j2).m2021b(j).m2020a(str).m2016a().f4066a, null, null);
        return uri;
    }
}
