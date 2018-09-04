package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: hba */
public final class hba {
    /* renamed from: a */
    private Size f5881a;
    /* renamed from: b */
    private Rect f5882b;
    /* renamed from: c */
    private Rect f5883c;
    /* renamed from: d */
    private Rect f5884d;
    /* renamed from: e */
    private Rect f5885e;
    /* renamed from: f */
    private Rect f5886f;
    /* renamed from: g */
    private Rect f5887g;
    /* renamed from: h */
    private Rect f5888h;

    public hba(byte b) {
        this();
    }

    /* renamed from: a */
    public final gxv m3001a() {
        String str = "";
        if (this.f5881a == null) {
            str = String.valueOf(str).concat(" window");
        }
        if (this.f5882b == null) {
            str = String.valueOf(str).concat(" preview");
        }
        if (this.f5883c == null) {
            str = String.valueOf(str).concat(" uncoveredPreview");
        }
        if (this.f5884d == null) {
            str = String.valueOf(str).concat(" topBar");
        }
        if (this.f5885e == null) {
            str = String.valueOf(str).concat(" optionsBar");
        }
        if (this.f5886f == null) {
            str = String.valueOf(str).concat(" bottomBar");
        }
        if (this.f5887g == null) {
            str = String.valueOf(str).concat(" fullScreen");
        }
        if (this.f5888h == null) {
            str = String.valueOf(str).concat(" modeSwitchUi");
        }
        if (str.isEmpty()) {
            return new gxq(this.f5881a, this.f5882b, this.f5883c, this.f5884d, this.f5885e, this.f5886f, this.f5887g, this.f5888h);
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
    public final hba m3002a(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null bottomBar");
        }
        this.f5886f = rect;
        return this;
    }

    /* renamed from: b */
    public final hba m3004b(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null fullScreen");
        }
        this.f5887g = rect;
        return this;
    }

    /* renamed from: c */
    public final hba m3005c(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null modeSwitchUi");
        }
        this.f5888h = rect;
        return this;
    }

    /* renamed from: d */
    public final hba m3006d(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null optionsBar");
        }
        this.f5885e = rect;
        return this;
    }

    /* renamed from: e */
    public final hba m3007e(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null preview");
        }
        this.f5882b = rect;
        return this;
    }

    /* renamed from: f */
    public final hba m3008f(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null topBar");
        }
        this.f5884d = rect;
        return this;
    }

    /* renamed from: g */
    public final hba m3009g(Rect rect) {
        if (rect == null) {
            throw new NullPointerException("Null uncoveredPreview");
        }
        this.f5883c = rect;
        return this;
    }

    /* renamed from: a */
    public final hba m3003a(Size size) {
        if (size == null) {
            throw new NullPointerException("Null window");
        }
        this.f5881a = size;
        return this;
    }
}
