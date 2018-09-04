package p000;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.text.DateFormat;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: cpy */
public abstract class cpy implements err {
    /* renamed from: a */
    private static final String f12511a = bli.m862a("FilmstripItemBase");
    /* renamed from: b */
    public static final DateFormat f12512b = DateFormat.getDateTimeInstance();
    /* renamed from: c */
    public final Context f12513c;
    /* renamed from: d */
    public final cqb f12514d;
    /* renamed from: e */
    public final eru f12515e;
    /* renamed from: f */
    public eri f12516f = eri.f4113a;
    /* renamed from: g */
    public final ers f12517g;
    /* renamed from: h */
    public iqp f12518h;
    /* renamed from: i */
    public kpw f12519i;

    public cpy(Context context, cqb cqb, eru eru, ers ers) {
        this.f12513c = (Context) jri.m13152b((Object) context);
        this.f12514d = (cqb) jri.m13152b((Object) cqb);
        this.f12515e = (eru) jri.m13152b((Object) eru);
        this.f12517g = (ers) jri.m13152b((Object) ers);
        this.f12518h = cqb.f2552b;
        this.f12519i = kpw.m18056d();
    }

    /* renamed from: a */
    public boolean mo1029a() {
        File file = new File(this.f12515e.f4154g);
        boolean delete = file.delete();
        file = file.getParentFile();
        if (file.exists() && file.isDirectory() && file.list().length == 0) {
            String b = gtu.m2823a().mo1624b();
            String absolutePath = file.getParentFile().getAbsolutePath();
            String str = f12511a;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 36) + String.valueOf(absolutePath).length());
            stringBuilder.append("CameraPathStr: ");
            stringBuilder.append(b);
            stringBuilder.append("  fileParentPathStr: ");
            stringBuilder.append(absolutePath);
            bli.m863a(str, stringBuilder.toString());
            if (absolutePath.equals(b) && !file.delete()) {
                b = f12511a;
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder2.append("Failed to delete: ");
                stringBuilder2.append(valueOf);
                bli.m863a(b, stringBuilder2.toString());
            }
        }
        return delete;
    }

    /* renamed from: a */
    protected static adl m8601a(eru eru) {
        long time;
        String str = eru.f4151d;
        if (str == null) {
            str = "";
        }
        Date date = eru.f4153f;
        if (date != null) {
            time = date.getTime() / 1000;
        } else {
            time = 0;
        }
        return new are(str, time, eru.f4158k);
    }

    /* renamed from: f */
    public final ers mo1032f() {
        return this.f12517g;
    }

    /* renamed from: a */
    public static long m8600a(err err) {
        if (err == null || err.mo1033g() == null) {
            return -1;
        }
        return err.mo1033g().f4152e.getTime();
    }

    /* renamed from: g */
    public final eru mo1033g() {
        return this.f12515e;
    }

    /* renamed from: h */
    public iqp mo1034h() {
        return this.f12515e.m2079g();
    }

    /* renamed from: i */
    public final kpk mo1035i() {
        return this.f12519i;
    }

    /* renamed from: j */
    public kbg mo1036j() {
        f12512b.setTimeZone(TimeZone.getDefault());
        cqd cqd = new cqd();
        cqd.m1405a(1, this.f12515e.f4150c);
        cqd.m1405a(5, Integer.valueOf(mo1034h().f7329a));
        cqd.m1405a(6, Integer.valueOf(mo1034h().f7330b));
        cqd.m1405a(200, this.f12515e.f4154g);
        cqd.m1405a(3, f12512b.format(this.f12515e.f4153f));
        long j = this.f12515e.f4157j;
        if (j > 0) {
            cqd.m1405a(10, Long.valueOf(j));
        }
        erx erx = this.f12515e.f4159l;
        if (!erx.equals(erx.f4174a)) {
            cqd.m1405a(4, erx.m2087a());
        }
        return kbg.m4745c(cqd);
    }

    /* renamed from: k */
    public final eri mo1037k() {
        return this.f12516f;
    }

    /* renamed from: l */
    public final int mo1038l() {
        return this.f12515e.f4158k;
    }

    /* renamed from: a */
    public boolean mo1030a(cfh cfh, cre cre) {
        return false;
    }

    /* renamed from: a */
    public void mo1027a(View view) {
        this.f12519i = kpw.m18056d();
    }

    /* renamed from: a */
    public static void m8602a(Uri uri, ImageView imageView, gsp gsp) {
        kbg c = gsp.mo1644c(uri);
        if (c.mo2084b()) {
            Drawable f = ((anq) c.mo2081a()).m6850f();
            if (f instanceof Animatable) {
                ((Animatable) f).start();
            }
            imageView.setImageDrawable(f);
            return;
        }
        imageView.setImageResource(cqb.f2549a);
    }

    /* renamed from: a */
    public final void mo1028a(eri eri) {
        this.f12516f = eri;
    }

    /* renamed from: b */
    public final void mo1031b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            bli.m873e(f12511a, "Suggested size was set to a zero area value!");
        } else {
            this.f12518h = new iqp(i, i2);
        }
    }

    /* renamed from: m */
    public final void mo1039m() {
    }
}
