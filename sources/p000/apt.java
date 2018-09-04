package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apt */
public final class apt {
    /* renamed from: a */
    private final List f838a = new ArrayList();

    /* renamed from: a */
    public final synchronized void m552a(ImageHeaderParser imageHeaderParser) {
        this.f838a.add(imageHeaderParser);
    }

    /* renamed from: a */
    public final synchronized List m551a() {
        return this.f838a;
    }
}
