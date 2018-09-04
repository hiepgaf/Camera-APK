package p000;

import android.os.SystemClock;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ioz */
public final class ioz extends Thread {
    /* renamed from: a */
    private final /* synthetic */ iow f7262a;

    public ioz(iow iow, String str) {
        this.f7262a = iow;
        super(str);
    }

    public final void run() {
        Log.v("AudioEncoder", "starting");
        Object obj;
        do {
            iow iow = this.f7262a;
            if (iow.f18488c.getRecordingState() != 3) {
                Log.d("AudioEncoder", "Receive stopping signal from AudioRecord.");
                obj = 1;
                continue;
            } else {
                int dequeueInputBuffer = iow.f18489d.dequeueInputBuffer(10000);
                if (dequeueInputBuffer >= 0) {
                    int i;
                    ByteBuffer inputBuffer = iow.f18489d.getInputBuffer(dequeueInputBuffer);
                    int read = iow.f18488c.read(inputBuffer, inputBuffer.limit());
                    int i2 = read / iow.f18487b;
                    int i3 = iow.f18491f;
                    long j = ((((long) i2) * 1000000) + ((long) (i3 / 2))) / ((long) i3);
                    if (read > 0) {
                        i = 0;
                        obj = null;
                    } else if (read < 0) {
                        StringBuilder stringBuilder = new StringBuilder(52);
                        stringBuilder.append("Read buffer from AudioRecord with error: ");
                        stringBuilder.append(read);
                        Log.e("AudioEncoder", stringBuilder.toString());
                        i = 4;
                        r7 = 1;
                    } else if (iow.f18488c.getRecordingState() == 3) {
                        Log.w("AudioEncoder", "Read buffer from AudioRecord, but buffer size is 0.");
                        i = 4;
                        r7 = 1;
                    } else {
                        Log.d("AudioEncoder", "Receive stopping signal from AudioRecord.");
                        i = 4;
                        r7 = 1;
                    }
                    if (iow.f18493h < 0) {
                        iow.f18493h = SystemClock.uptimeMillis() * 1000;
                    }
                    iow.f18489d.queueInputBuffer(dequeueInputBuffer, 0, read, iow.f18493h, i);
                    iow.f18493h += j;
                    continue;
                } else {
                    obj = null;
                    continue;
                }
            }
        } while (obj == null);
        Log.v("AudioEncoder", "stopping");
    }
}
