package p000;

import android.support.v4.app.SharedElementCallback;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.common.io.ByteStreams;

/* compiled from: PG */
/* renamed from: kl */
public final class kl {
    /* renamed from: a */
    public static final kl f8328a = new kl(1);
    /* renamed from: b */
    public static final kl f8329b = new kl(2);
    /* renamed from: c */
    public final Object f8330c;

    static {
        kl klVar = new kl(4);
        klVar = new kl(8);
        klVar = new kl(16);
        klVar = new kl(32);
        klVar = new kl(64);
        klVar = new kl(128);
        klVar = new kl(256);
        klVar = new kl(512);
        klVar = new kl(1024);
        klVar = new kl((int) DepthmapTask.MAX_REFERENCE_SIZE_HR_PX);
        klVar = new kl(4096);
        klVar = new kl(8192);
        klVar = new kl(16384);
        klVar = new kl(32768);
        klVar = new kl(65536);
        klVar = new kl(131072);
        klVar = new kl(262144);
        klVar = new kl((int) ByteStreams.ZERO_COPY_CHUNK_SIZE);
        klVar = new kl((int) SharedElementCallback.MAX_IMAGE_SIZE);
        klVar = new kl(2097152);
        klVar = new kl(AccessibilityAction.ACTION_SHOW_ON_SCREEN);
        klVar = new kl(AccessibilityAction.ACTION_SCROLL_TO_POSITION);
        klVar = new kl(AccessibilityAction.ACTION_SCROLL_UP);
        klVar = new kl(AccessibilityAction.ACTION_SCROLL_LEFT);
        klVar = new kl(AccessibilityAction.ACTION_SCROLL_DOWN);
        klVar = new kl(AccessibilityAction.ACTION_SCROLL_RIGHT);
        klVar = new kl(AccessibilityAction.ACTION_CONTEXT_CLICK);
        klVar = new kl(AccessibilityAction.ACTION_SET_PROGRESS);
        klVar = new kl(AccessibilityAction.ACTION_MOVE_WINDOW);
        klVar = new kl(AccessibilityAction.ACTION_SHOW_TOOLTIP);
        klVar = new kl(AccessibilityAction.ACTION_HIDE_TOOLTIP);
    }

    private kl(int i) {
        this(new AccessibilityAction(i, null));
    }

    private kl(Object obj) {
        this.f8330c = obj;
    }
}
