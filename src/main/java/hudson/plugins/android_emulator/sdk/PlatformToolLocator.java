package hudson.plugins.android_emulator.sdk;

public class PlatformToolLocator implements ToolLocator {
    @Override
    public String findInSdk(AndroidSdk androidSdk) {
        return ToolLocator.PLATFORM_TOOLS_DIR;
    }
}
