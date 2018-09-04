package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: ach */
public final class ach {
    /* renamed from: a */
    public final apr f226a = new apr();
    /* renamed from: b */
    public final apy f227b = new apy();
    /* renamed from: c */
    public final aea f228c = new aea();
    /* renamed from: d */
    private final akc f229d = new akc(this.f235j);
    /* renamed from: e */
    private final apw f230e = new apw();
    /* renamed from: f */
    private final aop f231f = new aop();
    /* renamed from: g */
    private final apt f232g = new apt();
    /* renamed from: h */
    private final apv f233h = new apv();
    /* renamed from: i */
    private final apu f234i = new apu();
    /* renamed from: j */
    private final iw f235j = ars.m659a();

    public ach() {
        List arrayList = new ArrayList(Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"}));
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f230e.m558a(arrayList);
    }

    /* renamed from: a */
    public final ach m104a(Class cls, adi adi) {
        this.f226a.m550a(cls, adi);
        return this;
    }

    /* renamed from: a */
    public final ach m105a(Class cls, adr adr) {
        this.f227b.m562a(cls, adr);
        return this;
    }

    /* renamed from: a */
    public final ach m106a(Class cls, Class cls2, adq adq) {
        m109a("legacy_append", cls, cls2, adq);
        return this;
    }

    /* renamed from: a */
    public final ach m107a(Class cls, Class cls2, akb akb) {
        this.f229d.m322a(cls, cls2, akb);
        return this;
    }

    /* renamed from: a */
    public final ach m109a(String str, Class cls, Class cls2, adq adq) {
        this.f230e.m557a(str, adq, cls, cls2);
        return this;
    }

    /* renamed from: a */
    public final List m111a() {
        List a = this.f232g.m551a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new aci();
    }

    /* renamed from: a */
    public final agk m110a(Class cls, Class cls2, Class cls3) {
        agk a = this.f234i.m553a(cls, cls2, cls3);
        if (apu.f839a.equals(a)) {
            return null;
        }
        if (a == null) {
            List arrayList = new ArrayList();
            for (Class cls4 : this.f230e.m559b(cls, cls2)) {
                for (Class cls5 : this.f231f.m529b(cls4, cls3)) {
                    arrayList.add(new afk(cls, cls4, cls5, this.f230e.m556a(cls, cls4), this.f231f.m527a(cls4, cls5), this.f235j));
                }
            }
            if (arrayList.isEmpty()) {
                a = null;
            } else {
                a = new agk(cls, cls2, cls3, arrayList, this.f235j);
            }
            apu apu = this.f234i;
            synchronized (apu.f840b) {
                Object obj;
                ih ihVar = apu.f840b;
                arp arp = new arp(cls, cls2, cls3);
                if (a == null) {
                    obj = apu.f839a;
                } else {
                    agk agk = a;
                }
                ihVar.put(arp, obj);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final List m112a(Object obj) {
        List a = this.f229d.m321a(obj);
        if (!a.isEmpty()) {
            return a;
        }
        throw new aci(obj);
    }

    /* renamed from: b */
    public final List m113b(Class cls, Class cls2, Class cls3) {
        List a = this.f233h.m554a(cls, cls2);
        if (a != null) {
            return a;
        }
        List arrayList = new ArrayList();
        for (Class b : this.f229d.m320a(cls)) {
            for (Class cls4 : this.f230e.m559b(b, cls2)) {
                if (!(this.f231f.m529b(cls4, cls3).isEmpty() || arrayList.contains(cls4))) {
                    arrayList.add(cls4);
                }
            }
        }
        apv apv = this.f233h;
        List unmodifiableList = Collections.unmodifiableList(arrayList);
        synchronized (apv.f842a) {
            apv.f842a.put(new arp(cls, cls2), unmodifiableList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final ach m103a(ImageHeaderParser imageHeaderParser) {
        this.f232g.m552a(imageHeaderParser);
        return this;
    }

    /* renamed from: a */
    public final ach m102a(adz adz) {
        this.f228c.m188a(adz);
        return this;
    }

    /* renamed from: a */
    public final ach m108a(Class cls, Class cls2, aoo aoo) {
        this.f231f.m528a(cls, cls2, aoo);
        return this;
    }
}
