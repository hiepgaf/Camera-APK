package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: grj */
public final class grj implements glm {
    /* renamed from: f */
    private static final String f17252f = bli.m862a("CaptureTrace");
    /* renamed from: a */
    public long f17253a;
    /* renamed from: b */
    public long f17254b;
    /* renamed from: c */
    public long f17255c;
    /* renamed from: d */
    public long f17256d;
    /* renamed from: e */
    public klb[] f17257e;
    /* renamed from: g */
    private final irs f17258g;
    /* renamed from: h */
    private glw f17259h;
    /* renamed from: i */
    private long f17260i;
    /* renamed from: j */
    private long f17261j;
    /* renamed from: k */
    private long f17262k;
    /* renamed from: l */
    private long f17263l;
    /* renamed from: m */
    private boolean f17264m = false;
    /* renamed from: n */
    private boolean f17265n = false;

    public grj(irs irs, iya iya) {
        this.f17258g = irs;
    }

    public final void onCaptureCanceled(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f17265n) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureCanceled invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else if (this.f17264m) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureCanceled invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else {
            str = f17252f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureCanceled ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            this.f17264m = true;
            this.f17258g.mo1580a(this.f17260i, this.f17259h, i, i2);
        }
    }

    public final void onCaptureDeleted() {
        String str = f17252f;
        String valueOf = String.valueOf(toString());
        String str2 = "onCaptureDeleted ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m863a(str, valueOf);
        this.f17258g.mo1579a(this.f17260i, this.f17259h);
    }

    public final void onCaptureFailed(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f17265n) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureFailed invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else if (this.f17264m) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureFailed invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else {
            str = f17252f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureFailed ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            this.f17264m = true;
            this.f17258g.mo1598b(this.f17260i, this.f17259h, i, i2);
        }
    }

    public final void onCaptureFinalized() {
        String valueOf;
        String str;
        if (this.f17264m) {
            String str2 = f17252f;
            valueOf = String.valueOf(toString());
            str = "onCaptureFinalized ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            bli.m863a(str2, valueOf);
            return;
        }
        str2 = f17252f;
        valueOf = String.valueOf(ion.m3960b());
        str = "onCaptureFinalized invoked without the final result being set!";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        bli.m873e(str2, valueOf);
    }

    public final void onCapturePersisted(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f17265n) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCapturePersisted invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else if (this.f17264m) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCapturePersisted invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else {
            str = f17252f;
            valueOf = String.valueOf(toString());
            str2 = "onCapturePersisted ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            this.f17264m = true;
            this.f17263l = SystemClock.elapsedRealtimeNanos();
            this.f17258g.mo1578a(this.f17260i, this.f17261j, this.f17262k, this.f17253a, this.f17254b, this.f17255c, this.f17256d, this.f17257e, this.f17263l, this.f17259h, i, i2);
        }
    }

    public final void onCaptureStartCommitted(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f17265n) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureStartCommitted invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else if (this.f17264m) {
            str = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str2 = "onCaptureStartCommitted invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m873e(str, valueOf);
        } else {
            str = f17252f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureStartCommitted ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m863a(str, valueOf);
            this.f17258g.mo1602c(this.f17260i, this.f17259h, i, i2);
        }
    }

    public final void onCaptureStarted(glw glw) {
        String valueOf;
        String str;
        if (this.f17265n) {
            String str2 = f17252f;
            valueOf = String.valueOf(ion.m3960b());
            str = "onCaptureStarted invoked after stated event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            bli.m873e(str2, valueOf);
            return;
        }
        str2 = f17252f;
        valueOf = String.valueOf(toString());
        str = "onCaptureStarted ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        bli.m863a(str2, valueOf);
        this.f17265n = true;
        this.f17260i = SystemClock.elapsedRealtimeNanos();
        this.f17259h = glw;
        this.f17258g.mo1597b(this.f17260i, this.f17259h);
    }

    public final void onMediumThumb() {
        String str = f17252f;
        String valueOf = String.valueOf(toString());
        String str2 = "onMediumThumb ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m863a(str, valueOf);
        this.f17262k = SystemClock.elapsedRealtimeNanos();
    }

    public final void onTinyThumb() {
        String str = f17252f;
        String valueOf = String.valueOf(toString());
        String str2 = "onTinyThumb ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m863a(str, valueOf);
        this.f17261j = SystemClock.elapsedRealtimeNanos();
    }

    public final String toString() {
        return jqk.m13098b((Object) this).m4741a("CaptureStartTimeNs", this.f17260i).m4741a("TinyThumbTimeNs", this.f17261j).m4741a("MediumThumbTimeNs", this.f17262k).m4741a("CapturePersistedTimeNs", this.f17263l).m4742a("SessionType", this.f17259h).toString();
    }
}
