package p000;

import android.hardware.camera2.params.Face;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.InitParams;

/* compiled from: PG */
/* renamed from: bym */
public interface bym {
    /* renamed from: a */
    byx mo608a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp);

    /* renamed from: a */
    byx mo609a(int i, bzx bzx, fwa fwa, fxi fxi, iwp iwp);

    /* renamed from: a */
    AeResults mo610a(byx byx, iwp iwp, iwz iwz);

    /* renamed from: a */
    BurstSpec mo611a(byx byx);

    /* renamed from: a */
    BurstSpec mo612a(byx byx, AeResults aeResults);

    /* renamed from: a */
    InitParams mo613a();

    /* renamed from: a */
    void mo614a(byx byx, int i, iwp iwp, iwz iwz);

    /* renamed from: a */
    void mo615a(byx byx, int i, iwp iwp, iwz iwz, iwz iwz2, Face[] faceArr);

    /* renamed from: a */
    void mo616a(byx byx, BurstSpec burstSpec);

    /* renamed from: a */
    boolean mo617a(int i);

    /* renamed from: b */
    BurstSpec mo618b(byx byx);

    /* renamed from: b */
    boolean mo619b(int i);

    /* renamed from: c */
    int mo620c(int i);

    /* renamed from: c */
    boolean mo621c(byx byx);
}
