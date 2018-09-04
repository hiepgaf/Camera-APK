package p000;

import com.google.googlex.gcam.BoolVector;
import com.google.googlex.gcam.FloatVector;
import com.google.googlex.gcam.ShotLogData;

/* compiled from: PG */
/* renamed from: epu */
public final class epu {
    /* renamed from: a */
    public kkf f4065a = new kkf();

    public epu(ShotLogData shotLogData, int i) {
        kkf kkf;
        boolean z;
        boolean z2 = true;
        this.f4065a.f22204a = shotLogData.getAe_confidence_short_exposure();
        this.f4065a.f22205b = shotLogData.getAe_confidence_long_exposure();
        this.f4065a.f22206c = shotLogData.getAe_confidence_single_exposure();
        this.f4065a.f22207d = shotLogData.getIdeal_range_compression();
        this.f4065a.f22208e = shotLogData.getActual_range_compression();
        this.f4065a.f22194C = shotLogData.getPure_fraction_of_pixels_from_long_exposure();
        this.f4065a.f22195D = shotLogData.getWeighted_fraction_of_pixels_from_long_exposure();
        this.f4065a.f22209f = shotLogData.getShort_exp_adjustment_factor();
        this.f4065a.f22210g = shotLogData.getLong_exp_adjustment_factor();
        this.f4065a.f22211h = shotLogData.getLog_scene_brightness();
        this.f4065a.f22212i = shotLogData.getMetering_frame_count();
        this.f4065a.f22213j = shotLogData.getOriginal_payload_frame_count();
        this.f4065a.f22215l = shotLogData.getBase_frame_index();
        this.f4065a.f22216m = shotLogData.getMerged_frame_count();
        this.f4065a.f22220q = shotLogData.getZsl();
        FloatVector original_payload_frame_sharpness = shotLogData.getOriginal_payload_frame_sharpness();
        this.f4065a.f22214k = new float[((int) original_payload_frame_sharpness.size())];
        int i2 = 0;
        while (true) {
            float[] fArr = this.f4065a.f22214k;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = original_payload_frame_sharpness.get(i2);
            i2++;
        }
        original_payload_frame_sharpness = shotLogData.getFinal_payload_frame_sharpness();
        this.f4065a.f22221r = new float[((int) original_payload_frame_sharpness.size())];
        i2 = 0;
        while (true) {
            fArr = this.f4065a.f22221r;
            if (i2 >= fArr.length) {
                break;
            }
            fArr[i2] = original_payload_frame_sharpness.get(i2);
            i2++;
        }
        BoolVector was_payload_frame_merged = shotLogData.getWas_payload_frame_merged();
        this.f4065a.f22222s = new boolean[((int) was_payload_frame_merged.size())];
        i2 = 0;
        while (true) {
            kkf = this.f4065a;
            boolean[] zArr = kkf.f22222s;
            if (i2 >= zArr.length) {
                break;
            }
            zArr[i2] = was_payload_frame_merged.get(i2);
            i2++;
        }
        kkf.f22217n = shotLogData.getTime_to_shot();
        this.f4065a.f22218o = shotLogData.getTime_to_postview();
        kkf kkf2 = this.f4065a;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        kkf2.f22197F = z;
        if (shotLogData.getExecuted_finish_on() != 1) {
            z2 = false;
        }
        kkf2.f22219p = z2;
        this.f4065a.f22223t = shotLogData.getCapture_time();
        this.f4065a.f22224u = shotLogData.getPostview_callback_time();
        this.f4065a.f22225v = shotLogData.getMerge_process_time();
        this.f4065a.f22226w = shotLogData.getMerged_raw_callback_time();
        this.f4065a.f22227x = shotLogData.getFinish_process_time();
        this.f4065a.f22228y = shotLogData.getFinal_image_callback_time();
        this.f4065a.f22229z = shotLogData.getJpeg_encode_time();
        this.f4065a.f22192A = shotLogData.getJpeg_callback_time();
        this.f4065a.f22193B = shotLogData.getAborted();
        this.f4065a.f22196E = shotLogData.getCpu_usage_factor();
    }
}
