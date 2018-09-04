package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
/* renamed from: hqe */
public enum hqe implements kse {
    UNKNOWN(0),
    SEARCH_TOOLS_CLICKED(1),
    WINDOW_FOCUS_CHANGED(2),
    PADDING_CHANGED(3),
    MAIN_VIEW_TOUCHED(4),
    REFRESH_DOODLE_DATA(5),
    EXPAND_SEARCH_PLATE_SUGGESTIONS(6),
    LOCATION_SETTINGS_DIALOG_RESPONSE(7),
    LOG_SUGGESTIONS(9),
    ACTION_DRAG_BEGIN(10),
    SUGGESTION_ACTION_BUTTON_CLICKED(11),
    CONTACT_SELECTED_EXTERNALLY(12),
    FINALIZE_RESULT_ON_USER_INTERACTION(14),
    SECURITY_ICON_CLICKED(15),
    OPEN_DOODLE(16),
    SUGGEST_RESPONSE_RENDERED(17),
    ACTION_VE_LOGGING_EVENT(18),
    ACTION_CHANGED_EXTERNALLY(23),
    SUGGESTION_CLICK(24),
    REMOVE_SUGGESTION(25),
    CANVAS_WORKER_BINDER_REQUEST(27),
    CANVAS_WORKER_BINDER_PROVIDER_REQUEST(ScriptIntrinsicBLAS.RsBlas_csyrk),
    FETCH_NATIVE_RESULT(29),
    LOGO_CLICKED(31),
    NEW_ACTIVE_NOTIFICATIONS(32),
    CLEAR_ACTIVE_NOTIFICATIONS(64),
    CANVAS_RENDER_COMPLETE(33),
    ACTION_COUNTDOWN_CANCELED(34),
    ESCAPE_HATCH_CLICKED(35),
    ACQUIRE_KEYBOARD_FOCUS(36),
    RELEASE_KEYBOARD_FOCUS(37),
    ACTION_USER_INTERACTION(38),
    SAVE_USER_INTERACTION(39),
    QUEUE_QUERY_FOR_BACKGROUND_RETRY(40),
    SET_GWS_LOGGABLE_EVENT(41),
    SUPPRESS_GWS_LOGGABLE_EVENT(42),
    NOW_CARDS_REFRESH_REQUEST(43),
    UNDOABLE_INTERACTION_NOT_HANDLED(44),
    UNMUTE_AFFORDANCE_CLICKED(45),
    CLEAR_VOICE_ACTIONS(46),
    SEARCH_TOOLS_CLEAR_BUTTON_CLICKED(47),
    SEARCH_TOOLS_OPTION_SELECTED(48),
    STOP_ENDLESS_MODE_ON_USER_INTERACTION(49),
    BROWSABLE_CATEGORY_SELECTED(51),
    HANDLE_ACTIONS_BACK_PRESS(52),
    GCM_MESSAGE_RECEIVED(53),
    OPT_IN_REQUEST(54),
    DEQUEUE_QUERY_FOR_BACKGROUND_RETRY(55),
    LEGACY_ACTIVE_NOTIFICATIONS(57),
    HOTWORD_DETECTED_IN_INTERACTOR(58),
    HOTWORD_REJECTED_AFTER_DSP_TRIGGERED(59),
    ACTIVITY_COMPLETED_WITH_RESULT(60),
    TTS_PLAYBACK_COMPLETE(61),
    HANDLE_MANUAL_RETRY(62),
    BROWSABLE_INTENT_LAUNCHED_IN_CLIENT(63),
    GEARHEAD_CONNECTED(65),
    GEARHEAD_DISCONNECTED(66),
    TIMESTAMP_UI_GET_LATEST_CLICKED(67),
    REMOTE_ACTION_TRIGGERED(68),
    STOP_LISTENING(69),
    STOP_SPEAKING(70),
    GO_BACK(71),
    SET_BROWSER_DIMENSION(72),
    TTS_STOP_SPEAKING(73),
    WEBVIEW_VISIBLE(74),
    UNSUPPRESS_CORPORA(75),
    SET_SPEECH_DETECTION_ENABLED(76),
    SET_HOTWORD_DETECTION_ENABLED(77),
    QUERY_SET(78),
    QUERY_EDIT(79),
    QUERY_COMMIT(80),
    RECENTLY_SCREENSHOT_CAPTURED(81),
    PROMOTED_SOUND_SEARCH_CLICKED(82),
    CANCEL(83),
    REQUEST_EXECUTE_ACTION(84),
    REQUEST_CANCEL_ACTION_EXECUTION(85),
    STOP_MAGIC_MIC(86),
    SWITCH_QUERY_FOR_VOICE_CORRECTION(87),
    LOG_VOICE_CORRECTION(88),
    CORPUS_CHANGE(89),
    CLEAR_ALL_BACKGROUND_RETRY_QUERIES(90),
    DEBUG_TRIM_MEMORY(92),
    PRERENDER_AMP_VIEWER(93),
    OPEN_AMP_VIEWER(94),
    OPEN_AMP_ACTIONS_VIEWER(349),
    PRERENDER_AMP_ACTIONS_VIEWER(352),
    PRERENDER_AMP_DOCUMENT(338),
    OPEN_AMP_DOCUMENT(339),
    AMP_VIEWER_SUPPORT_REQUEST(95),
    SEARCH_PLATE_TEXT_SELECTED(96),
    LOG_RESHOW_CARDS_REQUEST(97),
    START_CLIENT(98),
    STOP_CLIENT(99),
    MONET_CLIENT_EVENT(100),
    SEARCH_TOOLS_DIALOG_OPTION_CLICK(103),
    SUGGEST_UI_INFO(105),
    ACTION_UI_READY(106),
    SELECT_CURRENT_DEVICE_FOR_HOTWORD_TRIGGERS(107),
    LOG_APP_ENTRY(108),
    LITESWITCH_GO_TO_ORIGINAL_CLICKED(110),
    LITESWITCH_GO_BACK_TO_LITE_CLICKED(111),
    GCM_TOPIC_SUBSCRIPTION_CHANGE(112),
    RECENTLY_ENTRIES_REQUEST_REMOVE(113),
    MONET_CLIENT_LIFECYCLE_EVENT(114),
    NEW_PERMISSIONS_GRANTED(115),
    SHARE_SCREENSHOT(116),
    EXECUTE_MEDIA(117),
    DOODLE_GCM_TOPIC_SUBSCRIPTION_CHANGE(118),
    PERSISTENT_SEARCH_NOTIFICATION_SETTING_CHANGED(119),
    SUGGESTION_LONG_CLICK(120),
    OPA_UI_MODE(121),
    REFRESH_SERVICE_STATE(122),
    BACKGROUND_RETRY_COMPLETED_QUERY_TAPPED(ScriptIntrinsicBLAS.RsBlas_dtrmm),
    NEW_SHORTCUTS_AVAILABLE(ScriptIntrinsicBLAS.RsBlas_dtrsm),
    BACKGROUND_RETRY_QUERY_DELETED(ScriptIntrinsicBLAS.RsBlas_cgemm),
    VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED(ScriptIntrinsicBLAS.RsBlas_csymm),
    HOTWORD_TRIGGERED_ON_DSP(128),
    VOICE_SEARCH_HANDS_FREE(ScriptIntrinsicBLAS.RsBlas_ctrmm),
    DUMMY_CLIENT_EVENT(ScriptIntrinsicBLAS.RsBlas_ctrsm),
    DUMMY_BACKGROUND_TASK_EVENT(131),
    LOG_TELEMETRY_TO_CLEARCUT(132),
    GENERIC_SUGGEST_EVENT(ScriptIntrinsicBLAS.RsBlas_zsyrk),
    RETRY_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_zsyr2k),
    GET_NOTIFIED_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_ztrmm),
    CANCEL_SEARCH_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_ztrsm),
    OPEN_AIRPLANE_MODE_SETTINGS_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_chemm),
    OPEN_DATETIME_SETTINGS_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_cherk),
    OPEN_DATA_USAGE_SETTINGS_BUTTON_TAPPED(306),
    OPEN_DATA_ROAMING_SETTINGS_BUTTON_TAPPED(307),
    OPEN_WIFI_SETTINGS_BUTTON_TAPPED(308),
    SIGN_IN_TO_NETWORK_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_cher2k),
    CONTINUE_INSECURELY_BUTTON_TAPPED(ScriptIntrinsicBLAS.RsBlas_zhemm),
    OPEN_PERMISSIONS_DIALOG_BUTTON_TAPPED(141),
    MANAGE_PENDING_SEARCHES_BUTTON_TAPPED(142),
    OPEN_OFFLINE_SEARCH_SETTINGS_BUTTON_TAPPED(143),
    INSTALL_LANGUAGE_PACK_BUTTON_TAPPED(144),
    SEARCH_MAPS_BUTTON_TAPPED(145),
    GOOGLE_HELP_BUTTON_TAPPED(146),
    SCREEN_SEARCH(147),
    DEEPLINK(148),
    SEARCH_DEEPLINK(149),
    CACHE_BACKGROUND_RETRY(150),
    SEARCH_PLATE_MIC_TAPPED(151),
    START_PRONUNCIATION_LEARNING(152),
    CANCEL_PRONUNCIATION_LEARNING(153),
    PLAY_PRONUNCIATION_LEARNING_RESULT(154),
    OPA_INPUT_MODE(155),
    UPDATE_GSA_CONFIGS(156),
    FETCH_CONFIGS_FROM_PHENOTYPE(157),
    OFFLINE_LANDING_PAGES_ONBOARDING_ACCEPTED(158),
    NEW_HOTWORD_MODEL_AVAILABLE(162),
    NEW_UPGRADE_HOTWORD_MODEL_AVAILABLE(295),
    NEW_SPEECH_DETECTION_MODEL_AVAILABLE(163),
    OPA_EYES_ACTION_INTENT(256),
    OPA_EYES_CAMERA_ATTACH_SURFACE(265),
    OPA_EYES_CAMERA_START(263),
    OPA_EYES_CAMERA_STOP(264),
    OPA_EYES_CANCEL_REQUEST(357),
    OPA_EYES_FORWARDED_SERVICE_EVENT(290),
    LENS_SERVICE_IMAGE_INJECT(341),
    OPA_EYES_PROVIDE_IMAGES_REQUEST(192),
    OPA_EYES_RESET_STATE(ShutterButton.LONG_PRESS_DURATION_MS),
    OPA_EYES_SCREEN_SEARCH(303),
    OPA_EYES_STARTED(166),
    OPA_EYES_STOPPED(167),
    FINGERPRINT_AUTH_CLIENT_EVENT(168),
    REAUTH_CLIENT_EVENT(169),
    MAIN_CONTENT_SCROLLED(170),
    DSP_ERROR_NOTIFICATION(171),
    OPA_CLIENT_INPUT(173),
    COMMON_BROADCAST_MESSAGE_RECEIVED(174),
    BACKGROUND_TASK_STARTED(Illuminant.kOther),
    VIEW_SAVES_CLICKED(175),
    SHOW_BACKGROUND_RETRY_DISABLE_DATA_SAVER_DIALOG(178),
    SHOW_BACKGROUND_RETRY_ENABLE_NOTIFICATIONS_DIALOG(179),
    LOG_ATTEMPTED_SEARCH(MediaDecoder.ROTATE_180),
    BACKGROUND_RETRY_ONBOARDING_ACCEPTED(181),
    BACKGROUND_RETRY_ONBOARDING_DECLINED(182),
    BACKGROUND_RETRY_ONBOARDING_DISMISSED(183),
    REFRESH_ZERO_PREFIX_SUGGESTIONS(184),
    CLIENT_READY(185),
    CHANGE_WERNICKE_PLAYBACK_STATE(186),
    BISTO_PRE_CACHING(187),
    OPA_CHROME_OS_MODE(188),
    BACKUP_DATA(189),
    RESTORE_DATA(190),
    START_OPA_ACTIVITY_FOR_L_ASSIST(191),
    WIDGET_INTENT_RECEIVED(194),
    REQUEST_SHORTCUTS(195),
    PROPERTIES_UPDATE_IN_PHENOTYPE(196),
    OPEN_IMAGE_SHARE_EVENT(197),
    MAY_SHOW_HATS(198),
    BISTO_DEVICE_INFO_PUBLISH(199),
    BISTO_SYNC_CONFIG(200),
    PROACTIVE_REQUEST_DRAWER_STATE(294),
    PROACTIVE_REQUEST_CLUSTERED_CARDS(203),
    PROACTIVE_LOG_ACTION_LIST(204),
    PROACTIVE_DISMISS_ENTRY(205),
    PROACTIVE_REMOVE_GROUP_CHILD_ENTRY(206),
    PROACTIVE_REQUEST_STATIC_MAP_WITH_OPTIONS(207),
    PROACTIVE_REQUEST_RESOLVE_TRAINING_QUESTION(208),
    PROACTIVE_SET_TRAINING_ANSWER(209),
    PROACTIVE_SEND_TRAINING_ACTION(210),
    PROACTIVE_REQUEST_PHOTO_GALLERY_INTENT(211),
    PROACTIVE_SNOOZE_REMINDER(212),
    PROACTIVE_REQUEST_IS_REMINDER_SMART_ACTION_SUPPORTED(213),
    PROACTIVE_INVALIDATE_ENTRIES(214),
    PROACTIVE_REQUEST_TRANSLATE_IN_PLACE(215),
    PROACTIVE_REQUEST_ENABLE_SEARCH_HISTORY_FOR_ACTIVE_ACCOUNT(XmpUtil.M_SOI),
    PROACTIVE_DELETE_NOTIFICATIONS_FOR_ENTRY(XmpUtil.M_SOS),
    PROACTIVE_RECORD_PREDICTIVE_INTERACTION(219),
    PROACTIVE_RECORD_EXECUTED_USER_ACTIONS(FragmentManagerImpl.ANIM_DUR),
    PROACTIVE_REFRESH_ENTRIES_AND_LOG(221),
    PROACTIVE_FRESHEN_ENTRIES(222),
    PROACTIVE_REFRESH_FROM_CARD_SELECTOR(223),
    PROACTIVE_REQUEST_HELP_INTENT(224),
    PROACTIVE_RECORD_FEEDBACK_PROMPT_ACTION(XmpUtil.M_APP1),
    PROACTIVE_QUEUE_DISMISS_ENTRY_ACTION(226),
    PROACTIVE_REQUEST_CREATE_CALENDAR_EVENT(227),
    PROACTIVE_REQUEST_CURRENT_ACCOUNT(228),
    PROACTIVE_MAYBE_SHOW_LOCATION_PERMISSION_NOTIFICATION(230),
    PROACTIVE_HANDLE_CONTAINER_VISIBILTY_CHANGE(231),
    PROACTIVE_HANDLE_RENDERING_STOPPED(232),
    PROACTIVE_REQUEST_LOCATION_SETTINGS_RESOLUTION(233),
    PROACTIVE_NON_BLOCKING_FETCH(235),
    PROACTIVE_REQUEST_SHARABLE_SHORT_URL(236),
    PROACTIVE_START_EVENT(237),
    PROACTIVE_ADD_ENDSTATE_EXTRA_INFO(304),
    PROACTIVE_LOG_ENDSTATE(238),
    PROACTIVE_CREATE_ENDSTATE(239),
    PROACTIVE_DELETE_ENDSTATE(240),
    PROACTIVE_LOG_ENDSTATES(241),
    PROACTIVE_MARK_ALL_CARDS_RENDERED(242),
    PROACTIVE_MARK_ALL_CARDS_RENDERED_NON_TAB_STREAM(243),
    PROACTIVE_REQUEST_NEW_CARDS_INFO(244),
    PROACTIVE_REQUEST_NEW_CARDS_INFO_NON_TAB_STREAM(245),
    PROACTIVE_REMOVE_BOTTOM_BAR_PROMO(246),
    PROACTIVE_UPDATE_BACK_OF_CARD_FOLLOW_CLICK_FOR_ENTRY(247),
    PROACTIVE_REQUEST(248),
    PROACTIVE_NEW_ENTRY_TREE(309),
    FEEDBACK_LINK_TAPPED(249),
    TROUBLESHOOT_LINK_TAPPED(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS),
    PIXEL_APPS(251),
    SEARCH_MAPS_COUNTDOWN_FINISHED(253),
    OPA_DEEPLINK(257),
    COMMON_CONTENT_PROVIDER_QUERY(258),
    COMMON_CONTENT_PROVIDER_GET_TYPE(259),
    COMMON_CONTENT_PROVIDER_INSERT(260),
    COMMON_CONTENT_PROVIDER_BULK_INSERT(MediaDecoder.ROTATE_90_LEFT),
    COMMON_CONTENT_PROVIDER_DELETE(261),
    COMMON_CONTENT_PROVIDER_UPDATE(262),
    COMMON_CONTENT_PROVIDER_OPEN_FILE(274),
    OPA_REQUEST_SHERLOG_ENTRIES(267),
    SEARCH_MAPS_COUNTDOWN_CANCELED(268),
    OPA_ACTIVITY_LIFECYCLE_STATE(269),
    SEARCH_TAB_CLICKED(271),
    SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS(272),
    REMOVE_QUERY_FROM_RECENTLY_HISTORY(273),
    CLEAR_ALL_STORED_SHORTCUTS_DATA(275),
    RECENTLY_DOODLE_CLICKED(276),
    LOG_APP_FLOW_EVENT(277),
    BISTO_BULK_PRE_CACHING_REQUEST(278),
    DISABLE_SPEECH_DETECTION(279),
    NOW_PREFERENCE_SELECTION(280),
    BISTO_START_ACTIVITY_REQUEST(281),
    WEBVIEW_LONG_PRESS(282),
    OPA_DISPLAY_CONTEXT_UPDATED(283),
    PIXEL_SEARCH_STARTED(284),
    BISTO_CLEAR_JSON_LD_ENCODED_SCHEMA_ENTITIES(285),
    OPA_ACTIVITY_SIZE(286),
    BURGER_CLICKED_IN_NOW(287),
    BURGER_CLICKED_IN_LOGO_HEADER(288),
    PODCAST_PLAYER_EVENT(289),
    UPDATE_TIP_ACCEPT_BUTTON_CLICK(291),
    UPDATE_TIP_REJECT_BUTTON_CLICK(292),
    SEND_GTM_EVENT_FROM_LEGACY_UI(293),
    UPDATE_TOOLTIP_SHOWN(296),
    ACETONE_LOG_VERSION(297),
    OPA_FOREGROUND_APP_UPDATED(298),
    OPA_REQUEST_MEDIA_SESSION_TOKEN(299),
    RSS_GMM_COMMUTE_UPDATE(VideoProviderSource.TIMESTAMP_FILTER_SIZE),
    RSS_GMM_COMMUTE_QUERY(FrameType.ELEMENT_RGBA8888),
    NOW_RENDER_FINISHED(302),
    PREPARE_CCT_SESSION(160),
    PLACE_DETAILS_CLIENT_EVENT(305),
    PIXEL_HOMESCREEN_QSB_TAPPED(311),
    OPA_SOURCE_UPDATED(312),
    REGENERATE_CLIENT_OPTIN_CONTEXT_PROTO(313),
    SUGGEST_FEEDBACK_CLICK(314),
    OPA_CANCEL_CONVERSATION(315),
    FETCH_CUSTOM_LOCATION_DETAILS(316),
    SAVE_ENTRY_LOCATION(317),
    SAVE_RELATIONSHIP(318),
    OPA_REQUEST_ZERO_STATE_CONTENT(319),
    BISTO_UPDATE_CUSTOMIZATION(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX),
    DEVICE_BOOT(321),
    APP_INSTALL(322),
    HTTP_EXECUTE_REQUEST_UNBUFFERED(323),
    HTTP_EXECUTE_REQUEST(326),
    HTTP_CREATE_GRPC_CHANNEL(331),
    HTTP_GET_STATISTICS(324),
    HTTP_FORCE_START_NETLOG(328),
    HTTP_CAPTURE_NETLOG(329),
    HTTP_SET_TESTING_URL_REWRITER(330),
    ASSISTANT_CLIENT_SYNC_START(325),
    RELOAD_QUERY_STATE(327),
    FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES(332),
    DELIVER_ACTIVE_NOTIFICATIONS(333),
    SEARCH_NOW_ACTIVITY_BOOTSTRAPPED(334),
    MAPS_NAVIGATION_STATE_UPDATE(335),
    BISTO_STARTUP_PREF_CHANGED(336),
    SCREEN_STATE_CHANGE(337),
    UPDATE_RECENTLY(340),
    GET_SETTINGS_CLIENT_EVENT(342),
    UPDATE_SETTINGS_CLIENT_EVENT(343),
    LINK_DEVICE_CLIENT_EVENT(344),
    END_SESSION(345),
    OPA_REQUEST_USER_NAME(346),
    LENS_SERVICE_WARM_UP_ACTIVITY(347),
    LENS_SERVICE_TARGET_API_VERSION(348),
    FETCH_MORE_SUGGESTIONS(351),
    KEPLER_AWARENESS_TIP_BUTTON_CLICKED(353),
    BACKGROUND_NOW_OPT_IN(354),
    LENS_SERVICE_START_ACTIVITY(355),
    UPDATE_UI_LOGGING_SNAPSHOT(356),
    PLAY_TTS(358),
    STOP_TTS(359);
    
    /* renamed from: h */
    public final int f18032h;

    static {
        hqf hqf = new hqf();
    }

    private hqe(int i) {
        this.f18032h = i;
    }

    /* renamed from: a */
    public static hqe m11960a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return SEARCH_TOOLS_CLICKED;
            case 2:
                return WINDOW_FOCUS_CHANGED;
            case 3:
                return PADDING_CHANGED;
            case 4:
                return MAIN_VIEW_TOUCHED;
            case 5:
                return REFRESH_DOODLE_DATA;
            case 6:
                return EXPAND_SEARCH_PLATE_SUGGESTIONS;
            case 7:
                return LOCATION_SETTINGS_DIALOG_RESPONSE;
            case 9:
                return LOG_SUGGESTIONS;
            case 10:
                return ACTION_DRAG_BEGIN;
            case 11:
                return SUGGESTION_ACTION_BUTTON_CLICKED;
            case 12:
                return CONTACT_SELECTED_EXTERNALLY;
            case 14:
                return FINALIZE_RESULT_ON_USER_INTERACTION;
            case 15:
                return SECURITY_ICON_CLICKED;
            case 16:
                return OPEN_DOODLE;
            case 17:
                return SUGGEST_RESPONSE_RENDERED;
            case 18:
                return ACTION_VE_LOGGING_EVENT;
            case 23:
                return ACTION_CHANGED_EXTERNALLY;
            case 24:
                return SUGGESTION_CLICK;
            case 25:
                return REMOVE_SUGGESTION;
            case 27:
                return CANVAS_WORKER_BINDER_REQUEST;
            case 29:
                return FETCH_NATIVE_RESULT;
            case 31:
                return LOGO_CLICKED;
            case 32:
                return NEW_ACTIVE_NOTIFICATIONS;
            case 33:
                return CANVAS_RENDER_COMPLETE;
            case 34:
                return ACTION_COUNTDOWN_CANCELED;
            case 35:
                return ESCAPE_HATCH_CLICKED;
            case 36:
                return ACQUIRE_KEYBOARD_FOCUS;
            case 37:
                return RELEASE_KEYBOARD_FOCUS;
            case 38:
                return ACTION_USER_INTERACTION;
            case 39:
                return SAVE_USER_INTERACTION;
            case 40:
                return QUEUE_QUERY_FOR_BACKGROUND_RETRY;
            case 41:
                return SET_GWS_LOGGABLE_EVENT;
            case 42:
                return SUPPRESS_GWS_LOGGABLE_EVENT;
            case 43:
                return NOW_CARDS_REFRESH_REQUEST;
            case 44:
                return UNDOABLE_INTERACTION_NOT_HANDLED;
            case 45:
                return UNMUTE_AFFORDANCE_CLICKED;
            case 46:
                return CLEAR_VOICE_ACTIONS;
            case 47:
                return SEARCH_TOOLS_CLEAR_BUTTON_CLICKED;
            case 48:
                return SEARCH_TOOLS_OPTION_SELECTED;
            case 49:
                return STOP_ENDLESS_MODE_ON_USER_INTERACTION;
            case 51:
                return BROWSABLE_CATEGORY_SELECTED;
            case 52:
                return HANDLE_ACTIONS_BACK_PRESS;
            case 53:
                return GCM_MESSAGE_RECEIVED;
            case 54:
                return OPT_IN_REQUEST;
            case 55:
                return DEQUEUE_QUERY_FOR_BACKGROUND_RETRY;
            case 57:
                return LEGACY_ACTIVE_NOTIFICATIONS;
            case 58:
                return HOTWORD_DETECTED_IN_INTERACTOR;
            case 59:
                return HOTWORD_REJECTED_AFTER_DSP_TRIGGERED;
            case 60:
                return ACTIVITY_COMPLETED_WITH_RESULT;
            case 61:
                return TTS_PLAYBACK_COMPLETE;
            case 62:
                return HANDLE_MANUAL_RETRY;
            case 63:
                return BROWSABLE_INTENT_LAUNCHED_IN_CLIENT;
            case 64:
                return CLEAR_ACTIVE_NOTIFICATIONS;
            case 65:
                return GEARHEAD_CONNECTED;
            case 66:
                return GEARHEAD_DISCONNECTED;
            case 67:
                return TIMESTAMP_UI_GET_LATEST_CLICKED;
            case 68:
                return REMOTE_ACTION_TRIGGERED;
            case 69:
                return STOP_LISTENING;
            case 70:
                return STOP_SPEAKING;
            case 71:
                return GO_BACK;
            case 72:
                return SET_BROWSER_DIMENSION;
            case 73:
                return TTS_STOP_SPEAKING;
            case 74:
                return WEBVIEW_VISIBLE;
            case 75:
                return UNSUPPRESS_CORPORA;
            case 76:
                return SET_SPEECH_DETECTION_ENABLED;
            case 77:
                return SET_HOTWORD_DETECTION_ENABLED;
            case 78:
                return QUERY_SET;
            case 79:
                return QUERY_EDIT;
            case 80:
                return QUERY_COMMIT;
            case 81:
                return RECENTLY_SCREENSHOT_CAPTURED;
            case 82:
                return PROMOTED_SOUND_SEARCH_CLICKED;
            case 83:
                return CANCEL;
            case 84:
                return REQUEST_EXECUTE_ACTION;
            case 85:
                return REQUEST_CANCEL_ACTION_EXECUTION;
            case 86:
                return STOP_MAGIC_MIC;
            case 87:
                return SWITCH_QUERY_FOR_VOICE_CORRECTION;
            case 88:
                return LOG_VOICE_CORRECTION;
            case 89:
                return CORPUS_CHANGE;
            case 90:
                return CLEAR_ALL_BACKGROUND_RETRY_QUERIES;
            case 92:
                return DEBUG_TRIM_MEMORY;
            case 93:
                return PRERENDER_AMP_VIEWER;
            case 94:
                return OPEN_AMP_VIEWER;
            case 95:
                return AMP_VIEWER_SUPPORT_REQUEST;
            case 96:
                return SEARCH_PLATE_TEXT_SELECTED;
            case 97:
                return LOG_RESHOW_CARDS_REQUEST;
            case 98:
                return START_CLIENT;
            case 99:
                return STOP_CLIENT;
            case 100:
                return MONET_CLIENT_EVENT;
            case 103:
                return SEARCH_TOOLS_DIALOG_OPTION_CLICK;
            case 105:
                return SUGGEST_UI_INFO;
            case 106:
                return ACTION_UI_READY;
            case 107:
                return SELECT_CURRENT_DEVICE_FOR_HOTWORD_TRIGGERS;
            case 108:
                return LOG_APP_ENTRY;
            case 110:
                return LITESWITCH_GO_TO_ORIGINAL_CLICKED;
            case 111:
                return LITESWITCH_GO_BACK_TO_LITE_CLICKED;
            case 112:
                return GCM_TOPIC_SUBSCRIPTION_CHANGE;
            case 113:
                return RECENTLY_ENTRIES_REQUEST_REMOVE;
            case 114:
                return MONET_CLIENT_LIFECYCLE_EVENT;
            case 115:
                return NEW_PERMISSIONS_GRANTED;
            case 116:
                return SHARE_SCREENSHOT;
            case 117:
                return EXECUTE_MEDIA;
            case 118:
                return DOODLE_GCM_TOPIC_SUBSCRIPTION_CHANGE;
            case 119:
                return PERSISTENT_SEARCH_NOTIFICATION_SETTING_CHANGED;
            case 120:
                return SUGGESTION_LONG_CLICK;
            case 121:
                return OPA_UI_MODE;
            case 122:
                return REFRESH_SERVICE_STATE;
            case ScriptIntrinsicBLAS.RsBlas_dtrmm /*123*/:
                return BACKGROUND_RETRY_COMPLETED_QUERY_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_dtrsm /*124*/:
                return NEW_SHORTCUTS_AVAILABLE;
            case ScriptIntrinsicBLAS.RsBlas_cgemm /*125*/:
                return BACKGROUND_RETRY_QUERY_DELETED;
            case ScriptIntrinsicBLAS.RsBlas_csymm /*126*/:
                return VOICE_ASSIST_FROM_KEYGUARD_TRIGGERED;
            case ScriptIntrinsicBLAS.RsBlas_csyrk /*127*/:
                return CANVAS_WORKER_BINDER_PROVIDER_REQUEST;
            case 128:
                return HOTWORD_TRIGGERED_ON_DSP;
            case ScriptIntrinsicBLAS.RsBlas_ctrmm /*129*/:
                return VOICE_SEARCH_HANDS_FREE;
            case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                return DUMMY_CLIENT_EVENT;
            case 131:
                return DUMMY_BACKGROUND_TASK_EVENT;
            case 132:
                return LOG_TELEMETRY_TO_CLEARCUT;
            case ScriptIntrinsicBLAS.RsBlas_zsyrk /*133*/:
                return GENERIC_SUGGEST_EVENT;
            case ScriptIntrinsicBLAS.RsBlas_zsyr2k /*134*/:
                return RETRY_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_ztrmm /*135*/:
                return GET_NOTIFIED_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_ztrsm /*136*/:
                return CANCEL_SEARCH_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_chemm /*137*/:
                return OPEN_AIRPLANE_MODE_SETTINGS_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_cherk /*138*/:
                return OPEN_DATETIME_SETTINGS_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_cher2k /*139*/:
                return SIGN_IN_TO_NETWORK_BUTTON_TAPPED;
            case ScriptIntrinsicBLAS.RsBlas_zhemm /*140*/:
                return CONTINUE_INSECURELY_BUTTON_TAPPED;
            case 141:
                return OPEN_PERMISSIONS_DIALOG_BUTTON_TAPPED;
            case 142:
                return MANAGE_PENDING_SEARCHES_BUTTON_TAPPED;
            case 143:
                return OPEN_OFFLINE_SEARCH_SETTINGS_BUTTON_TAPPED;
            case 144:
                return INSTALL_LANGUAGE_PACK_BUTTON_TAPPED;
            case 145:
                return SEARCH_MAPS_BUTTON_TAPPED;
            case 146:
                return GOOGLE_HELP_BUTTON_TAPPED;
            case 147:
                return SCREEN_SEARCH;
            case 148:
                return DEEPLINK;
            case 149:
                return SEARCH_DEEPLINK;
            case 150:
                return CACHE_BACKGROUND_RETRY;
            case 151:
                return SEARCH_PLATE_MIC_TAPPED;
            case 152:
                return START_PRONUNCIATION_LEARNING;
            case 153:
                return CANCEL_PRONUNCIATION_LEARNING;
            case 154:
                return PLAY_PRONUNCIATION_LEARNING_RESULT;
            case 155:
                return OPA_INPUT_MODE;
            case 156:
                return UPDATE_GSA_CONFIGS;
            case 157:
                return FETCH_CONFIGS_FROM_PHENOTYPE;
            case 158:
                return OFFLINE_LANDING_PAGES_ONBOARDING_ACCEPTED;
            case 160:
                return PREPARE_CCT_SESSION;
            case 162:
                return NEW_HOTWORD_MODEL_AVAILABLE;
            case 163:
                return NEW_SPEECH_DETECTION_MODEL_AVAILABLE;
            case 166:
                return OPA_EYES_STARTED;
            case 167:
                return OPA_EYES_STOPPED;
            case 168:
                return FINGERPRINT_AUTH_CLIENT_EVENT;
            case 169:
                return REAUTH_CLIENT_EVENT;
            case 170:
                return MAIN_CONTENT_SCROLLED;
            case 171:
                return DSP_ERROR_NOTIFICATION;
            case 173:
                return OPA_CLIENT_INPUT;
            case 174:
                return COMMON_BROADCAST_MESSAGE_RECEIVED;
            case 175:
                return VIEW_SAVES_CLICKED;
            case 178:
                return SHOW_BACKGROUND_RETRY_DISABLE_DATA_SAVER_DIALOG;
            case 179:
                return SHOW_BACKGROUND_RETRY_ENABLE_NOTIFICATIONS_DIALOG;
            case MediaDecoder.ROTATE_180 /*180*/:
                return LOG_ATTEMPTED_SEARCH;
            case 181:
                return BACKGROUND_RETRY_ONBOARDING_ACCEPTED;
            case 182:
                return BACKGROUND_RETRY_ONBOARDING_DECLINED;
            case 183:
                return BACKGROUND_RETRY_ONBOARDING_DISMISSED;
            case 184:
                return REFRESH_ZERO_PREFIX_SUGGESTIONS;
            case 185:
                return CLIENT_READY;
            case 186:
                return CHANGE_WERNICKE_PLAYBACK_STATE;
            case 187:
                return BISTO_PRE_CACHING;
            case 188:
                return OPA_CHROME_OS_MODE;
            case 189:
                return BACKUP_DATA;
            case 190:
                return RESTORE_DATA;
            case 191:
                return START_OPA_ACTIVITY_FOR_L_ASSIST;
            case 192:
                return OPA_EYES_PROVIDE_IMAGES_REQUEST;
            case 194:
                return WIDGET_INTENT_RECEIVED;
            case 195:
                return REQUEST_SHORTCUTS;
            case 196:
                return PROPERTIES_UPDATE_IN_PHENOTYPE;
            case 197:
                return OPEN_IMAGE_SHARE_EVENT;
            case 198:
                return MAY_SHOW_HATS;
            case 199:
                return BISTO_DEVICE_INFO_PUBLISH;
            case 200:
                return BISTO_SYNC_CONFIG;
            case 203:
                return PROACTIVE_REQUEST_CLUSTERED_CARDS;
            case 204:
                return PROACTIVE_LOG_ACTION_LIST;
            case 205:
                return PROACTIVE_DISMISS_ENTRY;
            case 206:
                return PROACTIVE_REMOVE_GROUP_CHILD_ENTRY;
            case 207:
                return PROACTIVE_REQUEST_STATIC_MAP_WITH_OPTIONS;
            case 208:
                return PROACTIVE_REQUEST_RESOLVE_TRAINING_QUESTION;
            case 209:
                return PROACTIVE_SET_TRAINING_ANSWER;
            case 210:
                return PROACTIVE_SEND_TRAINING_ACTION;
            case 211:
                return PROACTIVE_REQUEST_PHOTO_GALLERY_INTENT;
            case 212:
                return PROACTIVE_SNOOZE_REMINDER;
            case 213:
                return PROACTIVE_REQUEST_IS_REMINDER_SMART_ACTION_SUPPORTED;
            case 214:
                return PROACTIVE_INVALIDATE_ENTRIES;
            case 215:
                return PROACTIVE_REQUEST_TRANSLATE_IN_PLACE;
            case XmpUtil.M_SOI /*216*/:
                return PROACTIVE_REQUEST_ENABLE_SEARCH_HISTORY_FOR_ACTIVE_ACCOUNT;
            case XmpUtil.M_SOS /*218*/:
                return PROACTIVE_DELETE_NOTIFICATIONS_FOR_ENTRY;
            case 219:
                return PROACTIVE_RECORD_PREDICTIVE_INTERACTION;
            case FragmentManagerImpl.ANIM_DUR /*220*/:
                return PROACTIVE_RECORD_EXECUTED_USER_ACTIONS;
            case 221:
                return PROACTIVE_REFRESH_ENTRIES_AND_LOG;
            case 222:
                return PROACTIVE_FRESHEN_ENTRIES;
            case 223:
                return PROACTIVE_REFRESH_FROM_CARD_SELECTOR;
            case 224:
                return PROACTIVE_REQUEST_HELP_INTENT;
            case XmpUtil.M_APP1 /*225*/:
                return PROACTIVE_RECORD_FEEDBACK_PROMPT_ACTION;
            case 226:
                return PROACTIVE_QUEUE_DISMISS_ENTRY_ACTION;
            case 227:
                return PROACTIVE_REQUEST_CREATE_CALENDAR_EVENT;
            case 228:
                return PROACTIVE_REQUEST_CURRENT_ACCOUNT;
            case 230:
                return PROACTIVE_MAYBE_SHOW_LOCATION_PERMISSION_NOTIFICATION;
            case 231:
                return PROACTIVE_HANDLE_CONTAINER_VISIBILTY_CHANGE;
            case 232:
                return PROACTIVE_HANDLE_RENDERING_STOPPED;
            case 233:
                return PROACTIVE_REQUEST_LOCATION_SETTINGS_RESOLUTION;
            case 235:
                return PROACTIVE_NON_BLOCKING_FETCH;
            case 236:
                return PROACTIVE_REQUEST_SHARABLE_SHORT_URL;
            case 237:
                return PROACTIVE_START_EVENT;
            case 238:
                return PROACTIVE_LOG_ENDSTATE;
            case 239:
                return PROACTIVE_CREATE_ENDSTATE;
            case 240:
                return PROACTIVE_DELETE_ENDSTATE;
            case 241:
                return PROACTIVE_LOG_ENDSTATES;
            case 242:
                return PROACTIVE_MARK_ALL_CARDS_RENDERED;
            case 243:
                return PROACTIVE_MARK_ALL_CARDS_RENDERED_NON_TAB_STREAM;
            case 244:
                return PROACTIVE_REQUEST_NEW_CARDS_INFO;
            case 245:
                return PROACTIVE_REQUEST_NEW_CARDS_INFO_NON_TAB_STREAM;
            case 246:
                return PROACTIVE_REMOVE_BOTTOM_BAR_PROMO;
            case 247:
                return PROACTIVE_UPDATE_BACK_OF_CARD_FOLLOW_CLICK_FOR_ENTRY;
            case 248:
                return PROACTIVE_REQUEST;
            case 249:
                return FEEDBACK_LINK_TAPPED;
            case ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS /*250*/:
                return TROUBLESHOOT_LINK_TAPPED;
            case 251:
                return PIXEL_APPS;
            case 253:
                return SEARCH_MAPS_COUNTDOWN_FINISHED;
            case Illuminant.kOther /*255*/:
                return BACKGROUND_TASK_STARTED;
            case 256:
                return OPA_EYES_ACTION_INTENT;
            case 257:
                return OPA_DEEPLINK;
            case 258:
                return COMMON_CONTENT_PROVIDER_QUERY;
            case 259:
                return COMMON_CONTENT_PROVIDER_GET_TYPE;
            case 260:
                return COMMON_CONTENT_PROVIDER_INSERT;
            case 261:
                return COMMON_CONTENT_PROVIDER_DELETE;
            case 262:
                return COMMON_CONTENT_PROVIDER_UPDATE;
            case 263:
                return OPA_EYES_CAMERA_START;
            case 264:
                return OPA_EYES_CAMERA_STOP;
            case 265:
                return OPA_EYES_CAMERA_ATTACH_SURFACE;
            case 267:
                return OPA_REQUEST_SHERLOG_ENTRIES;
            case 268:
                return SEARCH_MAPS_COUNTDOWN_CANCELED;
            case 269:
                return OPA_ACTIVITY_LIFECYCLE_STATE;
            case MediaDecoder.ROTATE_90_LEFT /*270*/:
                return COMMON_CONTENT_PROVIDER_BULK_INSERT;
            case 271:
                return SEARCH_TAB_CLICKED;
            case 272:
                return SEARCH_PLATE_MIC_TAPPED_FOR_OPA_PROMO_NOTIFICATIONS;
            case 273:
                return REMOVE_QUERY_FROM_RECENTLY_HISTORY;
            case 274:
                return COMMON_CONTENT_PROVIDER_OPEN_FILE;
            case 275:
                return CLEAR_ALL_STORED_SHORTCUTS_DATA;
            case 276:
                return RECENTLY_DOODLE_CLICKED;
            case 277:
                return LOG_APP_FLOW_EVENT;
            case 278:
                return BISTO_BULK_PRE_CACHING_REQUEST;
            case 279:
                return DISABLE_SPEECH_DETECTION;
            case 280:
                return NOW_PREFERENCE_SELECTION;
            case 281:
                return BISTO_START_ACTIVITY_REQUEST;
            case 282:
                return WEBVIEW_LONG_PRESS;
            case 283:
                return OPA_DISPLAY_CONTEXT_UPDATED;
            case 284:
                return PIXEL_SEARCH_STARTED;
            case 285:
                return BISTO_CLEAR_JSON_LD_ENCODED_SCHEMA_ENTITIES;
            case 286:
                return OPA_ACTIVITY_SIZE;
            case 287:
                return BURGER_CLICKED_IN_NOW;
            case 288:
                return BURGER_CLICKED_IN_LOGO_HEADER;
            case 289:
                return PODCAST_PLAYER_EVENT;
            case 290:
                return OPA_EYES_FORWARDED_SERVICE_EVENT;
            case 291:
                return UPDATE_TIP_ACCEPT_BUTTON_CLICK;
            case 292:
                return UPDATE_TIP_REJECT_BUTTON_CLICK;
            case 293:
                return SEND_GTM_EVENT_FROM_LEGACY_UI;
            case 294:
                return PROACTIVE_REQUEST_DRAWER_STATE;
            case 295:
                return NEW_UPGRADE_HOTWORD_MODEL_AVAILABLE;
            case 296:
                return UPDATE_TOOLTIP_SHOWN;
            case 297:
                return ACETONE_LOG_VERSION;
            case 298:
                return OPA_FOREGROUND_APP_UPDATED;
            case 299:
                return OPA_REQUEST_MEDIA_SESSION_TOKEN;
            case VideoProviderSource.TIMESTAMP_FILTER_SIZE /*300*/:
                return RSS_GMM_COMMUTE_UPDATE;
            case FrameType.ELEMENT_RGBA8888 /*301*/:
                return RSS_GMM_COMMUTE_QUERY;
            case 302:
                return NOW_RENDER_FINISHED;
            case 303:
                return OPA_EYES_SCREEN_SEARCH;
            case 304:
                return PROACTIVE_ADD_ENDSTATE_EXTRA_INFO;
            case 305:
                return PLACE_DETAILS_CLIENT_EVENT;
            case 306:
                return OPEN_DATA_USAGE_SETTINGS_BUTTON_TAPPED;
            case 307:
                return OPEN_DATA_ROAMING_SETTINGS_BUTTON_TAPPED;
            case 308:
                return OPEN_WIFI_SETTINGS_BUTTON_TAPPED;
            case 309:
                return PROACTIVE_NEW_ENTRY_TREE;
            case 311:
                return PIXEL_HOMESCREEN_QSB_TAPPED;
            case 312:
                return OPA_SOURCE_UPDATED;
            case 313:
                return REGENERATE_CLIENT_OPTIN_CONTEXT_PROTO;
            case 314:
                return SUGGEST_FEEDBACK_CLICK;
            case 315:
                return OPA_CANCEL_CONVERSATION;
            case 316:
                return FETCH_CUSTOM_LOCATION_DETAILS;
            case 317:
                return SAVE_ENTRY_LOCATION;
            case 318:
                return SAVE_RELATIONSHIP;
            case 319:
                return OPA_REQUEST_ZERO_STATE_CONTENT;
            case DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX /*320*/:
                return BISTO_UPDATE_CUSTOMIZATION;
            case 321:
                return DEVICE_BOOT;
            case 322:
                return APP_INSTALL;
            case 323:
                return HTTP_EXECUTE_REQUEST_UNBUFFERED;
            case 324:
                return HTTP_GET_STATISTICS;
            case 325:
                return ASSISTANT_CLIENT_SYNC_START;
            case 326:
                return HTTP_EXECUTE_REQUEST;
            case 327:
                return RELOAD_QUERY_STATE;
            case 328:
                return HTTP_FORCE_START_NETLOG;
            case 329:
                return HTTP_CAPTURE_NETLOG;
            case 330:
                return HTTP_SET_TESTING_URL_REWRITER;
            case 331:
                return HTTP_CREATE_GRPC_CHANNEL;
            case 332:
                return FETCH_SEARCH_SERVICE_BACKGROUND_TASK_NAMES;
            case 333:
                return DELIVER_ACTIVE_NOTIFICATIONS;
            case 334:
                return SEARCH_NOW_ACTIVITY_BOOTSTRAPPED;
            case 335:
                return MAPS_NAVIGATION_STATE_UPDATE;
            case 336:
                return BISTO_STARTUP_PREF_CHANGED;
            case 337:
                return SCREEN_STATE_CHANGE;
            case 338:
                return PRERENDER_AMP_DOCUMENT;
            case 339:
                return OPEN_AMP_DOCUMENT;
            case 340:
                return UPDATE_RECENTLY;
            case 341:
                return LENS_SERVICE_IMAGE_INJECT;
            case 342:
                return GET_SETTINGS_CLIENT_EVENT;
            case 343:
                return UPDATE_SETTINGS_CLIENT_EVENT;
            case 344:
                return LINK_DEVICE_CLIENT_EVENT;
            case 345:
                return END_SESSION;
            case 346:
                return OPA_REQUEST_USER_NAME;
            case 347:
                return LENS_SERVICE_WARM_UP_ACTIVITY;
            case 348:
                return LENS_SERVICE_TARGET_API_VERSION;
            case 349:
                return OPEN_AMP_ACTIONS_VIEWER;
            case ShutterButton.LONG_PRESS_DURATION_MS /*350*/:
                return OPA_EYES_RESET_STATE;
            case 351:
                return FETCH_MORE_SUGGESTIONS;
            case 352:
                return PRERENDER_AMP_ACTIONS_VIEWER;
            case 353:
                return KEPLER_AWARENESS_TIP_BUTTON_CLICKED;
            case 354:
                return BACKGROUND_NOW_OPT_IN;
            case 355:
                return LENS_SERVICE_START_ACTIVITY;
            case 356:
                return UPDATE_UI_LOGGING_SNAPSHOT;
            case 357:
                return OPA_EYES_CANCEL_REQUEST;
            case 358:
                return PLAY_TTS;
            case 359:
                return STOP_TTS;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final int mo1771a() {
        return this.f18032h;
    }
}
