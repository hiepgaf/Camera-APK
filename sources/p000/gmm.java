package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: gmm */
final class gmm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ gmi f5440a;

    gmm(gmi gmi) {
        this.f5440a = gmi;
    }

    public final void run() {
        String valueOf;
        try {
            gmi gmi = this.f5440a;
            BitmapDrawable bitmapDrawable = new BitmapDrawable(new ByteArrayInputStream(gmi.f23268c.mo1620d((File) jri.m13152b(gmi.f23267b.m2653a()))));
            if (bitmapDrawable.getBitmap() == null) {
                gmi gmi2 = this.f5440a;
                valueOf = String.valueOf(((File) jri.m13152b(gmi2.f23267b.m2653a())).getAbsolutePath());
                String str = "Could not decode preview file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                gmi2.m15783b(valueOf);
                return;
            }
            gkt gkt = this.f5440a;
            gkt.f21508u.m2625a((gmq) jri.m13152b(gkt.n), new alt(bitmapDrawable, new agx()));
            gkt = this.f5440a;
            gkt.m15765a(gkt.f21506s);
        } catch (IOException e) {
            IOException iOException = e;
            gmi gmi3 = this.f5440a;
            valueOf = ((File) jri.m13152b(gmi3.f23267b.m2653a())).getAbsolutePath();
            String message = iOException.getMessage();
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(message).length());
            stringBuilder.append("Could not read preview file: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" ");
            stringBuilder.append(message);
            gmi3.m15783b(stringBuilder.toString());
        }
    }
}
