package p000;

import android.media.MediaRecorder;
import android.media.MediaRecorder.OnInfoListener;

/* compiled from: PG */
/* renamed from: biy */
final class biy implements OnInfoListener {
    /* renamed from: a */
    private boolean f1197a;
    /* renamed from: b */
    private boolean f1198b;
    /* renamed from: c */
    private final /* synthetic */ iop f1199c;

    biy(iop iop) {
        this.f1199c = iop;
    }

    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 801) {
            bli.m871d(bix.f10943a, "MEDIA_RECORDER_INFO_MAX_FILESIZE_REACHED");
            if (!this.f1198b) {
                this.f1198b = true;
                this.f1199c.mo2663e();
            }
        } else if (i == 800) {
            bli.m871d(bix.f10943a, "MEDIA_RECORDER_INFO_MAX_DURATION_REACHED");
            if (!this.f1197a) {
                this.f1197a = true;
                this.f1199c.mo2661c();
            }
        } else if (i == 802) {
            bli.m871d(bix.f10943a, "MEDIA_RECORDER_INFO_MAX_FILESIZE_APPROACHING");
            this.f1199c.mo2662d();
        } else if (i == 803) {
            bli.m871d(bix.f10943a, "MEDIA_RECORDER_INFO_NEXT_OUTPUT_FILE_STARTED");
            this.f1199c.mo2664f();
        }
    }
}
