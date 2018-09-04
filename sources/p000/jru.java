package p000;

import com.google.android.vision.face.Face;

/* compiled from: PG */
/* renamed from: jru */
final class jru extends jrx {
    jru() {
        super();
    }

    /* renamed from: a */
    public final Float mo3175a(Face face) {
        return Float.valueOf(face.getIsRightEyeOpenScore());
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        return Float.valueOf(((Face) obj).getIsRightEyeOpenScore());
    }
}
