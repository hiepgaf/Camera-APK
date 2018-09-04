package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bkm */
public final class bkm {
    /* renamed from: a */
    private final AudioManager f1241a;

    public bkm(AudioManager audioManager) {
        this.f1241a = audioManager;
    }

    /* renamed from: a */
    public final AudioDeviceInfo m847a() {
        AudioDeviceInfo audioDeviceInfo = null;
        AudioDeviceInfo[] devices = this.f1241a.getDevices(1);
        int length = devices.length;
        int i = 0;
        AudioDeviceInfo audioDeviceInfo2 = null;
        while (i < length) {
            AudioDeviceInfo audioDeviceInfo3;
            AudioDeviceInfo audioDeviceInfo4 = devices[i];
            String valueOf = String.valueOf(bkm.m846a(audioDeviceInfo4));
            String str = "Found: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            Log.d("AudioDeviceFinder", valueOf);
            if (audioDeviceInfo4.getType() == 11 || audioDeviceInfo4.getType() == 22) {
                valueOf = String.valueOf(bkm.m846a(audioDeviceInfo4));
                str = "USB audio device is found: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                Log.d("AudioDeviceFinder", valueOf);
                if (audioDeviceInfo2 == null) {
                    audioDeviceInfo2 = audioDeviceInfo4;
                }
            }
            if (audioDeviceInfo4.getType() == 3) {
                valueOf = String.valueOf(bkm.m846a(audioDeviceInfo4));
                str = "Headset audio device is found: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                Log.d("AudioDeviceFinder", valueOf);
                if (audioDeviceInfo == null) {
                    audioDeviceInfo3 = audioDeviceInfo4;
                } else {
                    audioDeviceInfo3 = audioDeviceInfo;
                }
            } else {
                audioDeviceInfo3 = audioDeviceInfo;
            }
            i++;
            audioDeviceInfo = audioDeviceInfo3;
        }
        return audioDeviceInfo2 != null ? audioDeviceInfo2 : audioDeviceInfo;
    }

    /* renamed from: a */
    public static String m846a(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return "(device is null)";
        }
        String valueOf = String.valueOf(audioDeviceInfo.getProductName());
        int type = audioDeviceInfo.getType();
        int id = audioDeviceInfo.getId();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 60);
        stringBuilder.append("Audio device (Product: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(", Type: ");
        stringBuilder.append(type);
        stringBuilder.append(", Id: ");
        stringBuilder.append(id);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
