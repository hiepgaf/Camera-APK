package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fsd */
final class fsd implements kaw {
    /* renamed from: a */
    private final /* synthetic */ List f16490a;
    /* renamed from: b */
    private final /* synthetic */ fsc f16491b;

    fsd(fsc fsc, List list) {
        this.f16491b = fsc;
        this.f16490a = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        obj = (Integer) obj;
        jri.m13152b(obj);
        int intValue = obj.intValue();
        int size = this.f16490a.size();
        if (intValue < 0 || intValue >= size) {
            String a;
            String str = "index";
            if (intValue < 0) {
                a = jri.m13141a("%s (%s) must not be negative", str, Integer.valueOf(intValue));
            } else if (size < 0) {
                StringBuilder stringBuilder = new StringBuilder(26);
                stringBuilder.append("negative size: ");
                stringBuilder.append(size);
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                a = jri.m13141a("%s (%s) must be less than size (%s)", str, Integer.valueOf(intValue), Integer.valueOf(size));
            }
            throw new IndexOutOfBoundsException(a);
        }
        fuc fuc = this.f16491b.f16488a;
        long longValue = ((Long) this.f16490a.get(obj.intValue())).longValue();
        synchronized (fuc.f4726d) {
            fub a2 = fuc.m2392a(longValue);
            jri.m13154b(a2.f4720g.mo2084b() ^ 1, (Object) "Base frame already selected!");
            a2.f4720g = kbg.m4745c(Long.valueOf(longValue));
        }
        return obj;
    }
}
