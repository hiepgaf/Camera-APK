package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjr */
public final class jjr extends jip {
    /* renamed from: d */
    private final jiv f21860d;
    /* renamed from: e */
    private final List f21861e;

    public jjr(jiv jiv, List list, String str, int i, long j) {
        super(str, i, j);
        jri.m13152b((Object) jiv);
        jri.m13152b((Object) list);
        this.f21860d = jiv;
        this.f21861e = list;
    }

    /* renamed from: a */
    private final int[] m16278a(int i) {
        jiv jiv = this.f21860d;
        int i2 = jiv.f7857a;
        int i3 = jiv.f7858b;
        if (i2 < i3) {
            i3 = Math.round((((float) i2) * ((float) i)) / ((float) i3));
        } else {
            int round = Math.round((((float) i3) * ((float) i)) / ((float) i2));
            i3 = i;
            i = round;
        }
        return new int[]{i3, i};
    }

    /* renamed from: a */
    public final /* synthetic */ jxn mo2016a(jrg jrg) {
        return m16279c();
    }

    /* renamed from: c */
    private final jwx m16279c() {
        int[] a = m16278a(2500);
        return new jwx(this.f18840a, GDepthUtil.MIME_JPEG, this.f18842c, a[0], a[1]);
    }

    /* renamed from: a */
    public final Collection mo3170a() {
        Collection arrayList = new ArrayList();
        for (jkq jkq : this.f21861e) {
            arrayList.add(Long.valueOf(jkq.f7895b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final jaq mo2015a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        return m16277a(this.f21861e, jrg, jqo, 2500, executor).mo1973a(executor, jkm.m12896a(jxo, m16279c()));
    }

    /* renamed from: a */
    public final jaq mo2014a(jrg jrg, Context context, Executor executor, jqo jqo) {
        return m16277a(this.f21861e, jrg, jqo, 640, executor).mo1973a(executor, jkm.m12895a(jqo, context));
    }

    /* renamed from: a */
    private final jaq m16277a(List list, jrg jrg, jqo jqo, int i, Executor executor) {
        boolean z;
        if (this.f21860d.f7862f.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jiv jiv = this.f21860d;
        int max = Math.max(jiv.f7857a, jiv.f7858b);
        int[] a = m16278a(i);
        Object a2 = jqp.m4612a(jqo, jzp.m4713a(a[0], a[1]), "collage canvas");
        return jli.m12947b((Iterable) list, executor, new jjs(jrg, ((float) i) / ((float) max), jqo, a2)).mo1973a(executor, ion.m3941a(a2));
    }
}
