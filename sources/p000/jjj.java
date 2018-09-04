package p000;

import com.google.android.libraries.smartburst.filterpacks.face.FaceEditor;

/* compiled from: PG */
/* renamed from: jjj */
final class jjj implements Runnable {
    /* renamed from: a */
    private final FaceEditor f7882a;

    public jjj(FaceEditor faceEditor) {
        this.f7882a = faceEditor;
    }

    public final void run() {
        this.f7882a.dispose();
    }
}
