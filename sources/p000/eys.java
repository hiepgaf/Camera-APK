package p000;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: eys */
public class eys implements eyt {
    /* renamed from: a */
    public final /* synthetic */ String f15768a;
    /* renamed from: b */
    private final long f15769b;

    /* renamed from: a */
    public final long mo1319a() {
        return TimeUnit.MICROSECONDS.convert(this.f15769b - 1500000000, TimeUnit.NANOSECONDS);
    }

    /* renamed from: a */
    public final void mo1320a(eyu eyu) {
        eyu.mo1291a(TimeUnit.MICROSECONDS.convert(this.f15769b + 3000000000L, TimeUnit.NANOSECONDS));
    }

    public eys(String str) {
        this.f15768a = str;
    }

    /* renamed from: b */
    public InputStream m10089b() {
        try {
            return new FileInputStream(this.f15768a);
        } catch (FileNotFoundException e) {
            String str = ery.f4177a;
            String str2 = this.f15768a;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str2).length() + 52);
            stringBuilder.append("Could not read file: ");
            stringBuilder.append(str2);
            stringBuilder.append(", perhaps it is not a panorama.");
            bli.m873e(str, stringBuilder.toString());
            return null;
        }
    }
}
