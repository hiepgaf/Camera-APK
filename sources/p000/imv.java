package p000;

/* compiled from: PG */
/* renamed from: imv */
final class imv extends imw {
    /* renamed from: a */
    private final boolean f18373a;
    /* renamed from: b */
    private final boolean f18374b;
    /* renamed from: c */
    private final boolean f18375c;
    /* renamed from: d */
    private final boolean f18376d;
    /* renamed from: e */
    private final boolean f18377e;
    /* renamed from: f */
    private final boolean f18378f;
    /* renamed from: g */
    private final boolean f18379g;

    imv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f18373a = z;
        this.f18374b = z2;
        this.f18375c = z3;
        this.f18376d = z4;
        this.f18377e = z5;
        this.f18378f = z6;
        this.f18379g = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof imw)) {
            return false;
        }
        imw imw = (imw) obj;
        if (this.f18373a == imw.mo1884a() && this.f18374b == imw.mo1885b() && this.f18375c == imw.mo1887d() && this.f18376d == imw.mo1886c() && this.f18377e == imw.mo1888e() && this.f18378f == imw.mo1890g() && this.f18379g == imw.mo1889f()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (this.f18373a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (this.f18374b) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f18375c) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f18376d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f18377e) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f18378f) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (i ^ i3) * 1000003;
        if (this.f18379g) {
            i2 = 1231;
        }
        return i ^ i2;
    }

    /* renamed from: a */
    public final boolean mo1884a() {
        return this.f18373a;
    }

    /* renamed from: b */
    public final boolean mo1885b() {
        return this.f18374b;
    }

    /* renamed from: c */
    public final boolean mo1886c() {
        return this.f18376d;
    }

    /* renamed from: d */
    public final boolean mo1887d() {
        return this.f18375c;
    }

    /* renamed from: e */
    public final boolean mo1888e() {
        return this.f18377e;
    }

    public final String toString() {
        boolean z = this.f18373a;
        boolean z2 = this.f18374b;
        boolean z3 = this.f18375c;
        boolean z4 = this.f18376d;
        boolean z5 = this.f18377e;
        boolean z6 = this.f18378f;
        boolean z7 = this.f18379g;
        StringBuilder stringBuilder = new StringBuilder(252);
        stringBuilder.append("CamcorderCameraConfig{sessionShouldUseAeTargetFps=");
        stringBuilder.append(z);
        stringBuilder.append(", shouldContinuousAutoFocusOnDuringRecording=");
        stringBuilder.append(z2);
        stringBuilder.append(", shouldUnlockAfAeWithSceneChange=");
        stringBuilder.append(z3);
        stringBuilder.append(", shouldDetectFace=");
        stringBuilder.append(z4);
        stringBuilder.append(", shouldVideoStabilizationOn=");
        stringBuilder.append(z5);
        stringBuilder.append(", useOpticalStabilization=");
        stringBuilder.append(z6);
        stringBuilder.append(", useGoogLlv=");
        stringBuilder.append(z7);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final boolean mo1889f() {
        return this.f18379g;
    }

    /* renamed from: g */
    public final boolean mo1890g() {
        return this.f18378f;
    }
}
