package p000;

import com.google.googlex.gcam.GyroSample;
import com.google.googlex.gcam.GyroSampleVector;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: bxf */
public final class bxf implements bwq {
    /* renamed from: b */
    private static final String f11406b = bli.m862a("GyroSampleWorker");
    /* renamed from: a */
    private final kpw f11407a = kpw.m18056d();

    /* renamed from: a */
    public final GyroSampleVector m7842a() {
        Object e;
        try {
            return (GyroSampleVector) this.f11407a.get();
        } catch (InterruptedException e2) {
            e = e2;
        } catch (ExecutionException e3) {
            e = e3;
        }
        String str = f11406b;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("getGyroSampleVectorBlocking() was interrupted: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public final void mo549a(List list) {
        Object gyroSampleVector = new GyroSampleVector();
        for (bwr bwr : list) {
            GyroSample gyroSample = new GyroSample();
            gyroSample.setTimestamp_ns(bwr.f1661e);
            gyroSample.setX(bwr.f1662f);
            gyroSample.setY(bwr.f1663g);
            gyroSample.setZ(bwr.f1664h);
            gyroSampleVector.add(gyroSample);
        }
        this.f11407a.mo3557a(gyroSampleVector);
    }
}
