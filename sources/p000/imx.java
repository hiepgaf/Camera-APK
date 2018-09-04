package p000;

/* compiled from: PG */
/* renamed from: imx */
public final class imx {
    /* renamed from: a */
    private Boolean f7098a;
    /* renamed from: b */
    private Boolean f7099b;
    /* renamed from: c */
    private Boolean f7100c;
    /* renamed from: d */
    private Boolean f7101d;
    /* renamed from: e */
    private Boolean f7102e;
    /* renamed from: f */
    private Boolean f7103f;
    /* renamed from: g */
    private Boolean f7104g;

    imx(byte b) {
        this();
    }

    /* renamed from: a */
    public final imw m3854a() {
        String str = "";
        if (this.f7098a == null) {
            str = String.valueOf(str).concat(" sessionShouldUseAeTargetFps");
        }
        if (this.f7099b == null) {
            str = String.valueOf(str).concat(" shouldContinuousAutoFocusOnDuringRecording");
        }
        if (this.f7100c == null) {
            str = String.valueOf(str).concat(" shouldUnlockAfAeWithSceneChange");
        }
        if (this.f7101d == null) {
            str = String.valueOf(str).concat(" shouldDetectFace");
        }
        if (this.f7102e == null) {
            str = String.valueOf(str).concat(" shouldVideoStabilizationOn");
        }
        if (this.f7103f == null) {
            str = String.valueOf(str).concat(" useOpticalStabilization");
        }
        if (this.f7104g == null) {
            str = String.valueOf(str).concat(" useGoogLlv");
        }
        if (str.isEmpty()) {
            return new imv(this.f7098a.booleanValue(), this.f7099b.booleanValue(), this.f7100c.booleanValue(), this.f7101d.booleanValue(), this.f7102e.booleanValue(), this.f7103f.booleanValue(), this.f7104g.booleanValue());
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final imx m3855a(boolean z) {
        this.f7098a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final imx m3856b(boolean z) {
        this.f7099b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final imx m3857c(boolean z) {
        this.f7101d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final imx m3858d(boolean z) {
        this.f7100c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final imx m3859e(boolean z) {
        this.f7102e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public final imx m3860f(boolean z) {
        this.f7104g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public final imx m3861g(boolean z) {
        this.f7103f = Boolean.valueOf(z);
        return this;
    }
}
