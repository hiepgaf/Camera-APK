package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: inh */
public final class inh {
    /* renamed from: a */
    public final Map f7163a = new HashMap();

    public inh() {
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (r8 <= 0) {
                    Log.w("CdrCodecMgr", String.valueOf(name).concat(" contains empty supported type"));
                } else {
                    for (String str : mediaCodecInfo.getSupportedTypes()) {
                        StringBuilder stringBuilder = new StringBuilder((String.valueOf(name).length() + 22) + String.valueOf(str).length());
                        stringBuilder.append("codecInfo name=");
                        stringBuilder.append(name);
                        stringBuilder.append(" types=");
                        stringBuilder.append(str);
                        Log.v("CdrCodecMgr", stringBuilder.toString());
                        this.f7163a.put(str, mediaCodecInfo);
                    }
                }
            }
        }
    }
}
