package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fst */
final class fst implements kov {
    /* renamed from: a */
    private final /* synthetic */ fsq f16503a;

    fst(fsq fsq) {
        this.f16503a = fsq;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
    }

    public final /* synthetic */ void b_(Object obj) {
        obj = (fsm) obj;
        jri.m13152b(obj);
        for (fsn fsn : this.f16503a.f4693a) {
            String str;
            List arrayList = new ArrayList();
            for (fsl a : fsn.f4688a) {
                ftn a2 = a.mo1422a(obj);
                arrayList.add(a2);
                if (a2.f4710b.isEmpty()) {
                    iqz iqz = fsn.f4690c;
                    String valueOf = String.valueOf(a2.f4709a);
                    str = "Valid image created:";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    iqz.mo518d(valueOf);
                }
            }
            iqz iqz2 = fsn.f4690c;
            str = String.valueOf(arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
            stringBuilder.append("ImageSaverTrace does not match any valid strategy: ");
            stringBuilder.append(str);
            iqz2.mo516c(stringBuilder.toString());
            iqz2 = fsn.f4690c;
            str = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
            stringBuilder.append("Trace = ");
            stringBuilder.append(str);
            iqz2.mo516c(stringBuilder.toString());
            if (fsn.f4691d != bku.RELEASE) {
                str = String.valueOf(obj);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 62);
                stringBuilder.append("Image Saver Trace did not match any valid ImageSaverStrategy: ");
                stringBuilder.append(str);
                fsn.f4689b.execute(new fso(new IllegalStateException(stringBuilder.toString())));
            }
        }
    }
}
