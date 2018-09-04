package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bpl */
public enum bpl {
    GENERIC_CAMERA_ERROR(R.string.error_cannot_connect_camera, R.string.feedback_description_camera_access, true),
    ERROR_CAMERA_DISABLED(R.string.error_camera_disabled, R.string.feedback_description_camera_access, true),
    ERROR_CAMERA_DEVICE(R.string.error_camera_device, R.string.feedback_description_camera_access, true),
    ERROR_CAMERA_IN_USE(R.string.error_camera_in_use, R.string.feedback_description_camera_access, true),
    ERROR_CAMERA_SERVICE(R.string.error_camera_service, R.string.feedback_description_camera_access, true),
    ERROR_MAX_CAMERAS_IN_USE(R.string.error_max_cameras_in_use, R.string.feedback_description_camera_access, true),
    MEDIA_STORAGE_FAILURE(R.string.error_media_storage_failure, R.string.feedback_description_save_photo, false),
    MEDIA_RECORDER_FAILURE(R.string.error_media_recorder_failure, R.string.feedback_description_media_recorder_failure, true);
    
    /* renamed from: e */
    public final int f1391e;
    /* renamed from: f */
    public final int f1392f;
    /* renamed from: g */
    public final boolean f1393g;

    private bpl(int i, int i2, boolean z) {
        this.f1391e = i;
        this.f1392f = i2;
        this.f1393g = z;
    }

    /* renamed from: a */
    public static bpl m931a(int i) {
        switch (i) {
            case 1:
                return ERROR_CAMERA_IN_USE;
            case 2:
                return ERROR_MAX_CAMERAS_IN_USE;
            case 3:
                return ERROR_CAMERA_DISABLED;
            case 4:
                return ERROR_CAMERA_DEVICE;
            case 5:
                return ERROR_CAMERA_SERVICE;
            default:
                return GENERIC_CAMERA_ERROR;
        }
    }
}
