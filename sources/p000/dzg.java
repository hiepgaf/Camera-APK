package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraCharacteristics;
import com.google.android.GoogleCamera.R;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: dzg */
public final class dzg extends eak {
    /* renamed from: a */
    private static final String f14770a = bli.m862a("AppUpgrader");
    /* renamed from: b */
    private final Context f14771b;
    /* renamed from: c */
    private final fbn f14772c;

    public dzg(Context context, fbn fbn) {
        super("pref_upgrade_version", 11);
        this.f14771b = context;
        this.f14772c = fbn;
    }

    /* renamed from: a */
    protected final int mo1204a(gos gos) {
        SharedPreferences a = gos.mo1528a();
        if (a.contains("pref_strict_upgrade_version")) {
            Object obj = a.getAll().get("pref_strict_upgrade_version");
            a.edit().remove("pref_strict_upgrade_version").apply();
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        return super.mo1204a(gos);
    }

    /* renamed from: a */
    public final void mo1143a(gos gos, fbn fbn, int i) {
        SharedPreferences a;
        String valueOf;
        Context context = this.f14771b;
        if (i < 5) {
            a = gos.mo1528a();
            SharedPreferences c = gos.mo1542c("_preferences_camera");
            if (a.contains("pref_camera_recordlocation_key") && !eak.m1733a(gos.mo1542c("default_scope"), "pref_camera_recordlocation_key")) {
                gos.mo1540b("default_scope", "pref_camera_recordlocation_key", eak.m1734b(a, "pref_camera_recordlocation_key"));
            }
            if (a.contains("pref_user_selected_aspect_ratio")) {
                gos.mo1540b("default_scope", "pref_user_selected_aspect_ratio", eak.m1734b(a, "pref_user_selected_aspect_ratio"));
            }
            if (a.contains("pref_camera_exposure_compensation_key")) {
                gos.mo1540b("default_scope", "pref_camera_exposure_compensation_key", eak.m1734b(a, "pref_camera_exposure_compensation_key"));
            }
            if (a.contains("pref_camera_first_use_hint_shown_key")) {
                gos.mo1540b("default_scope", "pref_camera_first_use_hint_shown_key", eak.m1734b(a, "pref_camera_first_use_hint_shown_key"));
            }
            if (c.contains("pref_flash_supported_back_camera")) {
                boolean b = eak.m1734b(c, "pref_flash_supported_back_camera");
                if (b) {
                    gos.mo1540b("default_scope", "pref_flash_supported_back_camera", b);
                }
            }
            if (a.contains("pref_should_show_refocus_viewer_cling")) {
                gos.mo1540b("default_scope", "pref_should_show_refocus_viewer_cling", eak.m1734b(a, "pref_should_show_refocus_viewer_cling"));
            }
            if (a.contains("pref_should_show_settings_button_cling")) {
                gos.mo1540b("default_scope", "pref_should_show_settings_button_cling", eak.m1734b(a, "pref_should_show_settings_button_cling"));
            }
            if (c.contains("pref_camera_hdr_plus_key") && "on".equals(eak.m1735c(c, "pref_camera_hdr_plus_key"))) {
                gos.mo1540b("default_scope", "pref_camera_hdr_plus_key", true);
            }
            if (c.contains("pref_camera_hdr_key") && "on".equals(eak.m1735c(c, "pref_camera_hdr_key"))) {
                gos.mo1540b("default_scope", "pref_camera_hdr_key", true);
            }
            if (c.contains("pref_camera_grid_lines") && "on".equals(eak.m1735c(c, "pref_camera_grid_lines"))) {
                gos.mo1540b("default_scope", "pref_camera_grid_lines", true);
            }
        }
        if (i < 2) {
            a = gos.mo1542c("_preferences_camera");
            if (gos.mo1544e("default_scope", "pref_camera_recordlocation_key")) {
                if (!gos.mo1535a("default_scope", "pref_camera_recordlocation_key")) {
                    gos.mo1545f("default_scope", "pref_camera_recordlocation_key");
                }
            } else if (a.contains("pref_camera_recordlocation_key") && "on".equals(eak.m1735c(a, "pref_camera_recordlocation_key"))) {
                gos.mo1540b("default_scope", "pref_camera_recordlocation_key", true);
            }
        }
        if (i < 3) {
            m9569a(gos, iut.FRONT);
            m9569a(gos, iut.BACK);
        }
        if (i < 6) {
            String[] stringArray = context.getResources().getStringArray(R.array.camera_id_entryvalues);
            for (int i2 = 0; i2 < stringArray.length; i2++) {
                String valueOf2 = String.valueOf("_preferences_");
                valueOf = String.valueOf(stringArray[i2]);
                if (valueOf.length() == 0) {
                    valueOf = new String(valueOf2);
                } else {
                    valueOf = valueOf2.concat(valueOf);
                }
                SharedPreferences c2 = gos.mo1542c(valueOf);
                SharedPreferences c3 = gos.mo1542c(gos.m2669a(stringArray[i2]));
                for (Entry entry : c2.getAll().entrySet()) {
                    valueOf = (String) entry.getKey();
                    Object value = entry.getValue();
                    String str;
                    if (value == null) {
                        str = f14770a;
                        valueOf2 = String.valueOf(valueOf);
                        String str2 = "skipped upgrade and removing entry for null key ";
                        if (valueOf2.length() == 0) {
                            valueOf2 = new String(str2);
                        } else {
                            valueOf2 = str2.concat(valueOf2);
                        }
                        bli.m873e(str, valueOf2);
                        c3.edit().remove(valueOf).apply();
                    } else if (value instanceof Boolean) {
                        c3.edit().putString(valueOf, gos.m2670a(((Boolean) value).booleanValue())).apply();
                    } else if (value instanceof Integer) {
                        c3.edit().putString(valueOf, Integer.toString(((Integer) value).intValue())).apply();
                    } else if (value instanceof Long) {
                        long longValue = ((Long) value).longValue();
                        if (longValue > 2147483647L || longValue < -2147483648L) {
                            valueOf2 = f14770a;
                            r11 = new StringBuilder(String.valueOf(valueOf).length() + 66);
                            r11.append("skipped upgrade for out of bounds long key ");
                            r11.append(valueOf);
                            r11.append(" : ");
                            r11.append(longValue);
                            bli.m873e(valueOf2, r11.toString());
                        } else {
                            c3.edit().putString(valueOf, Integer.toString((int) longValue)).apply();
                        }
                    } else if (value instanceof String) {
                        c3.edit().putString(valueOf, (String) value).apply();
                    } else {
                        str = f14770a;
                        valueOf2 = String.valueOf(value.getClass());
                        r11 = new StringBuilder((String.valueOf(valueOf).length() + 64) + String.valueOf(valueOf2).length());
                        r11.append("skipped upgrade and removing entry for unrecognized key type ");
                        r11.append(valueOf);
                        r11.append(" : ");
                        r11.append(valueOf2);
                        bli.m873e(str, r11.toString());
                        c3.edit().remove(valueOf).apply();
                    }
                }
            }
        }
        if (i < 8 && gos.mo1544e("default_scope", "pref_camera_hdr_plus_key")) {
            Boolean bool;
            valueOf = gos.mo1543d("default_scope", "pref_camera_hdr_plus_key");
            if ("1".equals(valueOf)) {
                bool = Boolean.TRUE;
            } else if ("0".equals(valueOf)) {
                bool = Boolean.FALSE;
            } else {
                bool = null;
            }
            if (bool != null) {
                if (bool.booleanValue()) {
                    valueOf = "on";
                } else {
                    valueOf = "off";
                }
                gos.mo1532a("default_scope", "pref_camera_hdr_plus_key", valueOf);
            }
        }
        if (i < 9 && gos.mo1544e("default_scope", "pref_camera_hdr_plus_key")) {
            valueOf = gos.mo1543d("default_scope", "pref_camera_hdr_plus_key");
            if (!(valueOf == null || valueOf.equals("on") || valueOf.equals("off") || valueOf.equals("auto"))) {
                gos.mo1545f("default_scope", "pref_camera_hdr_plus_key");
            }
        }
        if (i < 11 && fbn != null) {
            for (iur iur : fbn.mo1347b()) {
                boolean z;
                Boolean bool2 = (Boolean) fbn.m10176b(iur).mo1913a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                if (bool2 == null) {
                    z = false;
                } else if (bool2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    valueOf = gos.m2669a(iur.f7482b);
                    if (gos.mo1544e(valueOf, "pref_camera_flashmode_key")) {
                        gos.mo1532a("default_scope", "pref_camera_flashmode_key", gos.mo1543d(valueOf, "pref_camera_flashmode_key"));
                        gos.mo1545f(valueOf, "pref_camera_flashmode_key");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m9569a(gos gos, iut iut) {
        String str;
        jri.m13152b((Object) gos);
        jri.m13152b((Object) iut);
        if (iut == iut.FRONT) {
            str = "pref_camera_picturesize_front_key";
        } else if (iut == iut.BACK) {
            str = "pref_camera_picturesize_back_key";
        } else {
            bli.m873e(f14770a, "Ignoring attempt to upgrade size of unhandled camera facing direction");
            return;
        }
        iur b = this.f14772c.mo1346b(iut);
        if (b == null) {
            String str2 = f14770a;
            String valueOf = String.valueOf(iut);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
            stringBuilder.append("Failed to retrieve a camera id for facing: ");
            stringBuilder.append(valueOf);
            bli.m873e(str2, stringBuilder.toString());
            gos.mo1545f("default_scope", str);
            return;
        }
        ffc b2 = this.f14772c.m10176b(b);
        gos.mo1532a("default_scope", str, ion.m3962b(eal.m1740a(gos.mo1543d("default_scope", str), b2.mo1920b(256), b2.mo1921c())));
    }
}
