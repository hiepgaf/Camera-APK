package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: awl */
public final class awl {
    static {
        bli.m862a("IntentHelper");
    }

    /* renamed from: a */
    public static kbg m710a(Intent intent) {
        return kbg.m4744b(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
    }

    /* renamed from: b */
    public static int m713b(Intent intent) {
        int intExtra = intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        if (intExtra < 3) {
            return 3;
        }
        if (intExtra > 30) {
            return 30;
        }
        return intExtra;
    }

    /* renamed from: a */
    public static Intent m709a(Uri uri) {
        return new Intent("android.intent.action.VIEW").setDataAndType(uri, "video/*");
    }

    /* renamed from: c */
    public static boolean m715c(Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA");
    }

    /* renamed from: a */
    public static boolean m711a(awr awr) {
        Intent intent = awr.f989a.getIntent();
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!awl.m712a(action)) {
            boolean z = !"android.media.action.STILL_IMAGE_CAMERA".equals(action) ? "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) : true;
            if (!z) {
                return false;
            }
        }
        if (intent.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m714b(awr awr) {
        Intent intent = awr.f989a.getIntent();
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if ("android.media.action.VIDEO_CAPTURE".equals(action) || awl.m712a(action)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m712a(String str) {
        if ("android.media.action.IMAGE_CAPTURE".equals(str) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m716d(Intent intent) {
        if (intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false)) {
            return true;
        }
        return false;
    }
}
