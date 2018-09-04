package p000;

import android.os.Environment;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import java.io.File;
import java.io.FileOutputStream;

/* compiled from: PG */
/* renamed from: epe */
public final class epe implements epc, kwk {
    public epe(ecg ecg) {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return (cub) ktm.m13963a(new cuj(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: a */
    public final void mo774a(eventprotos$CameraEvent eventprotos_cameraevent) {
        byte[] toByteArray = kvl.toByteArray(eventprotos_cameraevent);
        File file = new File(new File(Environment.getExternalStorageDirectory(), "camera_events"), "session.pb");
        try {
            kiz.m4969a(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write(toByteArray);
            fileOutputStream.write("\n\n\n".getBytes());
            fileOutputStream.close();
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }
}
