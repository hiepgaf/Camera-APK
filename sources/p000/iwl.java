package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: iwl */
public interface iwl extends iqo {
    /* renamed from: a */
    iwn mo2986a(int i);

    @TargetApi(23)
    /* renamed from: a */
    iwn mo2987a(iwp iwp);

    @TargetApi(23)
    /* renamed from: a */
    void mo2988a(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler);

    @TargetApi(28)
    /* renamed from: a */
    void mo2989a(iwu iwu);

    /* renamed from: a */
    void mo2990a(List list, iwi iwi, Handler handler);

    @TargetApi(23)
    /* renamed from: a */
    void mo2991a(List list, iwk iwk, Handler handler);

    @TargetApi(24)
    /* renamed from: b */
    void mo2992b(InputConfiguration inputConfiguration, List list, iwi iwi, Handler handler);

    @TargetApi(24)
    /* renamed from: b */
    void mo2993b(List list, iwi iwi, Handler handler);

    void close();
}
