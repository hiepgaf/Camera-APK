package p000;

/* compiled from: PG */
/* renamed from: fwp */
public final class fwp implements ffe {
    /* renamed from: a */
    private final fwm f16579a;
    /* renamed from: b */
    private final fwa f16580b;
    /* renamed from: c */
    private final /* synthetic */ fvy f16581c;

    public fwp(fvy fvy, fwm fwm, fwa fwa) {
        this.f16581c = fvy;
        this.f16579a = fwm;
        this.f16580b = fwa;
    }

    /* renamed from: a */
    public final void mo347a() {
        try {
            this.f16581c.f4740b.mo1171a(this.f16579a, this.f16580b);
            this.f16579a.close();
        } catch (Throwable e) {
            fvy fvy = this.f16581c;
            iqz iqz = fvy.f4741c;
            String str = "PictureTaker command failed: ";
            String valueOf = String.valueOf(fvy.f4740b.toString());
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            iqz.mo515b(valueOf, e);
            throw e;
        } catch (Throwable th) {
            this.f16579a.close();
            this.f16580b.f4755d.close();
            this.f16580b.f4754c.m2405a();
            this.f16580b.f4752a.f4451g.close();
        }
    }

    public final String toString() {
        return "PictureTakerCommand";
    }
}
