package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: fnc */
final class fnc extends iwy {
    /* renamed from: a */
    public final iqz f23211a;

    public fnc(ixe ixe, ira ira) {
        super(ixe);
        this.f23211a = ira.mo511a("LoggingImageWriter");
    }

    public final void close() {
        this.f23211a.mo519e("close()");
        super.close();
    }

    /* renamed from: a */
    public final iwz mo3157a(long j) {
        iqz iqz = this.f23211a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("dequeueInputImage(");
        stringBuilder.append(j);
        stringBuilder.append(") START");
        iqz.mo519e(stringBuilder.toString());
        iwz a = super.mo3157a(j);
        iqz iqz2 = this.f23211a;
        StringBuilder stringBuilder2 = new StringBuilder(43);
        stringBuilder2.append("dequeueInputImage(");
        stringBuilder2.append(j);
        stringBuilder2.append(") END");
        iqz2.mo519e(stringBuilder2.toString());
        return a;
    }

    /* renamed from: a */
    public final void mo3158a(iwz iwz) {
        iqz iqz = this.f23211a;
        String valueOf = String.valueOf(iwz);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("queueInputImage(");
        stringBuilder.append(valueOf);
        stringBuilder.append(") START");
        iqz.mo519e(stringBuilder.toString());
        super.mo3158a(iwz);
        iqz = this.f23211a;
        valueOf = String.valueOf(iwz);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("queueInputImage(");
        stringBuilder.append(valueOf);
        stringBuilder.append(") END");
        iqz.mo519e(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo3159a(ixg ixg, Handler handler) {
        super.mo3159a(new fnd(this, ixg), handler);
    }
}
