package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ekh */
final class ekh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3752a;
    /* renamed from: b */
    private final /* synthetic */ ejy f3753b;

    ekh(ejy ejy, byte[] bArr) {
        this.f3753b = ejy;
        this.f3752a = bArr;
    }

    public final void run() {
        try {
            String str = (String) this.f3753b.f3716H.remove(0);
            OutputStream fileOutputStream = new FileOutputStream(str);
            File file = new File(str);
            str = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
            stringBuilder.append("imageFile: ");
            stringBuilder.append(str);
            if (ejv.m1813a()) {
                byte[] bArr = this.f3752a;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                decodeByteArray.compress(CompressFormat.JPEG, 100, fileOutputStream);
                decodeByteArray.recycle();
            } else {
                fileOutputStream.write(this.f3752a);
            }
            fileOutputStream.close();
            ejy ejy = this.f3753b;
            if (ejy.f3739o < ejy.f3714F.size()) {
                ejy = this.f3753b;
                ejy.f3714F.get(ejy.f3739o);
                file.getAbsolutePath();
            }
            int i = this.f3753b.f3739o;
            int length = this.f3752a.length;
            StringBuilder stringBuilder2 = new StringBuilder(44);
            stringBuilder2.append("Photo ");
            stringBuilder2.append(i);
            stringBuilder2.append(" saved : ");
            stringBuilder2.append(length);
            stringBuilder2.append(" bytes.");
            ejy = this.f3753b;
            ejy.f3738n.get(ejy.f3739o);
            ((float[]) this.f3753b.f3715G.remove(0)).clone();
            ejx ejx = this.f3753b.f3712D;
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(absolutePath);
            String str2 = "alignNextImage called for ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            ejx.f3704a.put(absolutePath);
            ejy = this.f3753b;
            ejy.f3739o++;
            ekm ekm = ejy.f3717I;
            ekm.f3808b = ejy.m1818a(file);
            ekm.m1839a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Unexpected interruption");
        } catch (Throwable e2) {
            kqg.f8420a.mo2210b(e2);
        } catch (Throwable e22) {
            kqg.f8420a.mo2210b(e22);
        } catch (Throwable e222) {
            kqg.f8420a.mo2210b(e222);
        }
    }
}
