package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.MetaFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.image.ToGrayValuesFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterpacks.analysis.FeatureOutputValueTarget;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;

/* compiled from: PG */
/* renamed from: jlv */
public final class jlv implements GraphFactory {
    public final FilterGraph create(MffContext mffContext) {
        Builder builder = new Builder(mffContext);
        builder.addVariable("videoProvider", null);
        builder.addVariable("targetFrameRate", Float.valueOf(15.0f));
        Filter videoProviderSource = new VideoProviderSource(mffContext, "camera");
        builder.addFilter(videoProviderSource);
        builder.assignVariableToFilterInput("videoProvider", "camera", "provider");
        builder.assignValueToFilterInput(Integer.valueOf(MediaDecoder.ROTATE_180), "camera", "minDimension");
        builder.assignValueToFilterInput(Integer.valueOf(4), "camera", "multipleOfX");
        builder.assignVariableToFilterInput("targetFrameRate", "camera", MotionAnalysisFilter.FRAME_RATE);
        Filter metaFilter = new MetaFilter(mffContext, "motionAnalysisCalculator");
        builder.addFilter(metaFilter);
        Filter featureOutputValueTarget = new FeatureOutputValueTarget(mffContext, "motionSaliencyOutput");
        builder.addFilter(featureOutputValueTarget);
        Filter featureOutputValueTarget2 = new FeatureOutputValueTarget(mffContext, "motionEstimationSaliencyOutput");
        builder.addFilter(featureOutputValueTarget2);
        Filter featureOutputValueTarget3 = new FeatureOutputValueTarget(mffContext, "interFrameHomographyOutput");
        builder.addFilter(featureOutputValueTarget3);
        Filter featureOutputValueTarget4 = new FeatureOutputValueTarget(mffContext, "cameraMotionOutput");
        builder.addFilter(featureOutputValueTarget4);
        Filter toGrayValuesFilter = new ToGrayValuesFilter(mffContext, "toGrayValues");
        builder.addFilter(toGrayValuesFilter);
        builder.connect(videoProviderSource, "video", toGrayValuesFilter, "image");
        builder.connect(toGrayValuesFilter, "image", metaFilter, "image");
        builder.connect(metaFilter, "motionSaliencyOutput", featureOutputValueTarget, "feature");
        builder.connect(metaFilter, "motionEstimationSaliencyOutput", featureOutputValueTarget2, "feature");
        builder.connect(metaFilter, "interFrameHomographyOutput", featureOutputValueTarget3, "feature");
        builder.connect(metaFilter, "cameraMotionOutput", featureOutputValueTarget4, "feature");
        FilterGraph build = builder.build();
        metaFilter.setGraph(new jlw(build).create(mffContext));
        return build;
    }
}
