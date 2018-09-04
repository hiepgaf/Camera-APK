package p000;

import com.google.android.vision.face.Face;

/* compiled from: PG */
/* renamed from: jrv */
final class jrv extends jrx {
    jrv() {
        super();
    }

    /* renamed from: a */
    public final Float mo3175a(Face face) {
        return Float.valueOf(face.getIsSmilingScore());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        return Float.valueOf(((Face) obj).getIsSmilingScore());
    }
}
