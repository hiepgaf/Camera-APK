package p000;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gtm */
public final class gtm implements gtl {
    /* renamed from: a */
    public static final String f17320a = bli.m862a("StorageDlgBldr");
    /* renamed from: b */
    public final Context f17321b;
    /* renamed from: c */
    public final ikd f17322c;
    /* renamed from: d */
    private final guf f17323d;

    gtm(Context context, ikd ikd, guf guf) {
        this.f17321b = context;
        this.f17322c = ikd;
        this.f17323d = guf;
    }

    /* renamed from: a */
    private static AlertDialog m11508a(Builder builder) {
        AlertDialog create = builder.create();
        create.setCancelable(false);
        create.setCanceledOnTouchOutside(false);
        return create;
    }

    /* renamed from: a */
    public final AlertDialog mo1627a(OnClickListener onClickListener) {
        return gtm.m11508a(m11509b(this.f17321b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f17321b.getResources().getString(R.string.video_storage_max_duration_dialog_body), onClickListener));
    }

    /* renamed from: b */
    public final AlertDialog mo1628b(OnClickListener onClickListener) {
        return gtm.m11508a(m11509b(this.f17321b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f17321b.getResources().getString(R.string.video_storage_max_file_size_dialog_body), onClickListener));
    }

    /* renamed from: c */
    public final AlertDialog mo1629c(OnClickListener onClickListener) {
        return gtm.m11508a(m11507a(this.f17321b.getResources().getString(R.string.photo_storage_full_error_dialog_title), this.f17321b.getResources().getString(R.string.video_storage_full_error_dialog_body), onClickListener));
    }

    /* renamed from: d */
    public final AlertDialog mo1630d(OnClickListener onClickListener) {
        return gtm.m11508a(m11507a(this.f17321b.getResources().getString(R.string.video_storage_full_error_dialog_title), this.f17321b.getResources().getString(R.string.video_storage_full_error_dialog_body), onClickListener));
    }

    /* renamed from: e */
    public final AlertDialog mo1631e(OnClickListener onClickListener) {
        return gtm.m11508a(m11507a(this.f17321b.getResources().getString(R.string.video_storage_full_error_recording_dialog_title), this.f17321b.getResources().getString(R.string.video_storage_full_error_recording_dialog_body), onClickListener));
    }

    /* renamed from: f */
    public final kpk mo1632f(OnClickListener onClickListener) {
        kpk a = this.f17323d.mo1650a(false);
        kow.m13622a(a, new gtn(this, mo1629c(onClickListener)), kpq.f8410a);
        return a;
    }

    /* renamed from: a */
    private final Builder m11507a(String str, String str2, OnClickListener onClickListener) {
        return new Builder(this.f17321b, 16974546).setTitle(str).setMessage(str2).setPositiveButton(this.f17321b.getResources().getString(R.string.video_storage_full_error_free_up_space), new gtp(this)).setNegativeButton(this.f17321b.getResources().getString(R.string.dialog_dismiss), onClickListener);
    }

    /* renamed from: b */
    private final Builder m11509b(String str, String str2, OnClickListener onClickListener) {
        return new Builder(this.f17321b, 16974546).setTitle(str).setMessage(str2).setPositiveButton(this.f17321b.getResources().getString(R.string.dialog_ok), onClickListener);
    }
}
