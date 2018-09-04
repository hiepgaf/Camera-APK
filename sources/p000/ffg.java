package p000;

/* compiled from: PG */
/* renamed from: ffg */
final class ffg implements Runnable {
    /* renamed from: a */
    private final ffe f4529a;
    /* renamed from: b */
    private final /* synthetic */ fff f4530b;

    public ffg(fff fff, ffe ffe) {
        this.f4530b = fff;
        this.f4529a = ffe;
    }

    public final void run() {
        try {
            ird ird = this.f4530b.f4523a;
            String valueOf = String.valueOf(this.f4529a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 8);
            stringBuilder.append("Command#");
            stringBuilder.append(valueOf);
            ird.mo1903a(stringBuilder.toString());
            this.f4529a.mo347a();
            this.f4530b.f4523a.mo1904b();
        } catch (isr e) {
            this.f4530b.f4523a.mo1904b();
        } catch (InterruptedException e2) {
            this.f4530b.f4523a.mo1904b();
        } catch (Exception e3) {
            this.f4530b.f4524b.execute(new ffh(e3));
            this.f4530b.f4523a.mo1904b();
        } catch (Throwable th) {
            this.f4530b.f4523a.mo1904b();
        }
    }
}
