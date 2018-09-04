package p000;

import android.util.Log;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ikm */
public final class ikm extends OutputStream {
    /* renamed from: a */
    private final ikn f7059a;

    public ikm(ikn ikn) {
        this.f7059a = ikn;
    }

    public final void close() {
        ikn ikn = this.f7059a;
        if (ikn.f7060a.m4028a() > 0) {
            String valueOf = String.valueOf(ikn.f7060a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 40);
            stringBuilder.append("Warning: unwritten bytes in the buffer: ");
            stringBuilder.append(valueOf);
            Log.w("CAM_ProcFSM", stringBuilder.toString());
        }
        int i = ikn.f7063d;
        if (i > 0) {
            StringBuilder stringBuilder2 = new StringBuilder(48);
            stringBuilder2.append("Warning: still need to forward ");
            stringBuilder2.append(i);
            stringBuilder2.append(" bytes");
            Log.w("CAM_ProcFSM", stringBuilder2.toString());
        }
        if (ikn.f7062c > 0) {
            i = ikn.f7063d;
            stringBuilder2 = new StringBuilder(45);
            stringBuilder2.append("Warning: still need to skip ");
            stringBuilder2.append(i);
            stringBuilder2.append(" bytes");
            Log.w("CAM_ProcFSM", stringBuilder2.toString());
        }
        ikn.f7061b.close();
    }

    public final void flush() {
        this.f7059a.f7061b.flush();
    }

    public final void write(int i) {
        ikn ikn = this.f7059a;
        int i2 = ikn.f7062c;
        if (i2 != 0) {
            if (i2 > 0) {
                ikn.f7062c = i2 - 1;
            }
        } else if (ikn.f7063d != 0) {
            ikn.f7061b.write(i);
            i2 = ikn.f7063d;
            if (i2 > 0) {
                ikn.f7063d = i2 - 1;
            }
        } else {
            iqa iqa = ikn.f7060a;
            iqa.m4029a(1);
            byte[] bArr = iqa.f7312a;
            int i3 = iqa.f7314c;
            bArr[i3] = (byte) i;
            iqa.f7314c = i3 + 1;
            ikn.m3798b();
        }
    }

    public final void write(byte[] bArr) {
        this.f7059a.m3796a(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.f7059a.m3796a(bArr, i, i2);
    }
}
