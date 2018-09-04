package p000;

import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gli */
final class gli implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ glf f5368a;

    gli(glf glf) {
        this.f5368a = glf;
    }

    public final void run() {
        String valueOf;
        try {
            glf glf = this.f5368a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(glf.f21517c.mo1620d((File) jri.m13152b(glf.f21516b.m2653a()))));
            if (bitmapDrawable.getBitmap() == null) {
                glf glf2 = this.f5368a;
                valueOf = String.valueOf(((File) jri.m13152b(glf2.f21516b.m2653a())).getAbsolutePath());
                String str = "Could not decode preview file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                glf2.m15823b(valueOf);
                return;
            }
            glf = this.f5368a;
            glf.f21519e.m2625a((gmq) jri.m13152b(glf.f21520f), new alt(bitmapDrawable, new agx()));
            glf = this.f5368a;
            glf.f21518d.m2633a((Uri) jri.m13152b(glf.f21521g));
        } catch (IOException e) {
            IOException iOException = e;
            glf glf3 = this.f5368a;
            valueOf = ((File) jri.m13152b(glf3.f21516b.m2653a())).getAbsolutePath();
            String message = iOException.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(message).length());
            stringBuilder.append("Could not read preview file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(message);
            glf3.m15823b(stringBuilder.toString());
        }
    }
}
