package p000;

import android.util.Pair;
import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;

/* compiled from: PG */
/* renamed from: jjk */
final class jjk implements izi {
    /* renamed from: a */
    private final jqo f18850a;
    /* renamed from: b */
    private final FaceEditor f18851b;

    public jjk(jqo jqo, FaceEditor faceEditor) {
        this.f18850a = jqo;
        this.f18851b = faceEditor;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        return Pair.create(this.f18851b.createAllSmiles(this.f18850a, true), Long.valueOf(this.f18851b.getBestInputBitmapTimestamp()));
    }
}
