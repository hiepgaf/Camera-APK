package p000;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.FilterGraph;
import com.google.android.libraries.smartburst.filterfw.FilterGraph.Builder;
import com.google.android.libraries.smartburst.filterfw.GraphFactory;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.BranchFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.base.MetaFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.image.ToGrayValuesFilter;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.android.libraries.smartburst.filterpacks.analysis.FeatureOutputValueTarget;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;

/* compiled from: PG */
/* renamed from: jlq */
public final class jlq implements GraphFactory {
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
        Filter metaFilter = new MetaFilter(mffContext, "faceScoreCalculator");
        builder.addFilter(metaFilter);
        Filter featureOutputValueTarget = new FeatureOutputValueTarget(mffContext, "faceScoreOutput");
        builder.addFilter(featureOutputValueTarget);
        Filter featureOutputValueTarget2 = new FeatureOutputValueTarget(mffContext, "faceSmilingScoreOutput");
        builder.addFilter(featureOutputValueTarget2);
        Filter featureOutputValueTarget3 = new FeatureOutputValueTarget(mffContext, "faceLeftEyeOpenScoreOutput");
        builder.addFilter(featureOutputValueTarget3);
        Filter featureOutputValueTarget4 = new FeatureOutputValueTarget(mffContext, "faceRightEyeOpenScoreOutput");
        builder.addFilter(featureOutputValueTarget4);
        Filter featureOutputValueTarget5 = new FeatureOutputValueTarget(mffContext, "faceSharpnessScoreOutput");
        builder.addFilter(featureOutputValueTarget5);
        Filter toGrayValuesFilter = new ToGrayValuesFilter(mffContext, "toGrayValues");
        builder.addFilter(toGrayValuesFilter);
        Filter branchFilter = new BranchFilter(mffContext, "rgbBranch");
        builder.addFilter(branchFilter);
        builder.connect(videoProviderSource, "video", branchFilter, "input");
        builder.connect(branchFilter, "toGrayValues", toGrayValuesFilter, "image");
        builder.connect(toGrayValuesFilter, "image", metaFilter, "grayImage");
        builder.connect(branchFilter, "toFaceScorer", metaFilter, "rgbImage");
        builder.connect(metaFilter, "faceCountOutput", featureOutputValueTarget, "feature");
        builder.connect(metaFilter, "faceIsSmilingOutput", featureOutputValueTarget2, "feature");
        builder.connect(metaFilter, "faceIsLeftEyeOpenOutput", featureOutputValueTarget3, "feature");
        builder.connect(metaFilter, "faceIsRightEyeOpenOutput", featureOutputValueTarget4, "feature");
        builder.connect(metaFilter, "faceSharpnessOutput", featureOutputValueTarget5, "feature");
        FilterGraph build = builder.build();
        metaFilter.setGraph(new jlr(build).create(mffContext));
        return build;
    }
}
