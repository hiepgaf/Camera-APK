package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri.Builder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import java.util.Date;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: cqo */
public final class cqo implements err {
    /* renamed from: a */
    public static long f12528a = -1;
    /* renamed from: b */
    private static final ers f12529b = new exb().m10036d();
    /* renamed from: c */
    private final LayoutInflater f12530c;
    /* renamed from: d */
    private final Resources f12531d;
    /* renamed from: e */
    private final int f12532e;
    /* renamed from: f */
    private final eru f12533f;
    /* renamed from: g */
    private final ers f12534g;
    /* renamed from: h */
    private final awk f12535h;
    /* renamed from: i */
    private hfz f12536i;
    /* renamed from: j */
    private eri f12537j;
    /* renamed from: k */
    private kpw f12538k;
    /* renamed from: l */
    private View f12539l = null;

    static {
        bli.m862a("PlaceholderItem");
    }

    public cqo(int i, awk awk, int i2, int i3, LayoutInflater layoutInflater, Resources resources) {
        this.f12530c = (LayoutInflater) jri.m13152b((Object) layoutInflater);
        this.f12531d = (Resources) jri.m13152b((Object) resources);
        this.f12532e = i;
        this.f12535h = (awk) jri.m13152b((Object) awk);
        iqp iqp = new iqp(i2, i3);
        Date date = new Date(0);
        Date date2 = new Date(0);
        erj erj = new erj();
        erj.f4115a = true;
        this.f12537j = erj.m2030a();
        Builder builder = new Builder();
        String uuid = UUID.randomUUID().toString();
        builder.scheme("simple_view_data").appendPath(uuid);
        this.f12533f = new eru(f12528a, uuid, "", date, date2, "", builder.build(), false, kbg.m4745c(iqp), 0, 0, erx.f4174a, false);
        this.f12534g = f12529b;
        this.f12538k = kpw.m18056d();
    }

    /* renamed from: a */
    public final View mo1041a(kbg kbg, hfz hfz, boolean z, cpx cpx) {
        m8643b();
        View view = this.f12539l;
        if (view instanceof ImageView) {
            this.f12538k.mo3557a((ImageView) view);
        } else {
            this.f12538k.m17780a(new IllegalStateException("Image view future set in placeholder item that does not have an ImageView"));
        }
        this.f12536i = hfz;
        return this.f12539l;
    }

    /* renamed from: a */
    public final boolean mo1029a() {
        return false;
    }

    /* renamed from: b */
    private final synchronized void m8643b() {
        if (this.f12539l == null) {
            ikd.m12259a();
            this.f12539l = (ImageView) this.f12530c.inflate(R.layout.secure_album_placeholder, null);
            this.f12539l.setTag(R.id.mediadata_tag_viewtype, Integer.valueOf(go.ap - 1));
            this.f12539l.setContentDescription(this.f12531d.getString(R.string.accessibility_unlock_to_camera));
        }
    }

    /* renamed from: a */
    public final hio mo1042a(int i, int i2) {
        return new hio(kau.f19138a);
    }

    /* renamed from: f */
    public final ers mo1032f() {
        return this.f12534g;
    }

    /* renamed from: g */
    public final eru mo1033g() {
        return this.f12533f;
    }

    /* renamed from: h */
    public final iqp mo1034h() {
        return this.f12533f.m2079g();
    }

    /* renamed from: i */
    public final kpk mo1035i() {
        return this.f12538k;
    }

    /* renamed from: e */
    public final int mo1048e() {
        return this.f12532e;
    }

    /* renamed from: j */
    public final kbg mo1036j() {
        return kau.f19138a;
    }

    /* renamed from: k */
    public final eri mo1037k() {
        return this.f12537j;
    }

    /* renamed from: l */
    public final int mo1038l() {
        return this.f12533f.f4158k;
    }

    /* renamed from: a */
    public final boolean mo1030a(cfh cfh, cre cre) {
        awk awk = this.f12535h;
        awk.f980a.putExtra("filmstrip_index", this.f12536i.mo1016c() - 1);
        awk.m708a();
        return true;
    }

    /* renamed from: a */
    public final void mo1027a(View view) {
    }

    /* renamed from: c */
    public final err mo1045c() {
        return this;
    }

    /* renamed from: b */
    public final void mo1044b(View view) {
    }

    /* renamed from: c */
    public final void mo1046c(View view) {
    }

    /* renamed from: a */
    public final void mo1043a(View view, Bitmap bitmap) {
    }

    /* renamed from: d */
    public final void mo1047d(View view) {
    }

    /* renamed from: a */
    public final void mo1028a(eri eri) {
        this.f12537j = eri;
    }

    /* renamed from: b */
    public final void mo1031b(int i, int i2) {
    }

    /* renamed from: m */
    public final void mo1039m() {
    }
}
