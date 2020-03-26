package com.github.xiaolyuh;

import javax.swing.*;

/**
 * 初始化参数
 *
 * @author yuhao.wang3
 */
public class InitOptions {

    /**
     * 主干分支名称
     */
    private String masterBranch;

    /**
     * 发布分支名称
     */
    private String releaseBranch;

    /**
     * 测试分支名称
     */
    private String testBranch;

    /**
     * 开发分支前缀
     */
    private String featurePrefix;

    /**
     * 修复分支前缀
     */
    private String hotfixPrefix;

    /**
     * 版本前缀
     */
    private String versionPrefix;

    /**
     * 发布完成是否删除发布分支
     */
    private boolean releaseFinishIsDeleteRelease;

    /**
     * 发布完成是否删除开发分支
     */
    private boolean releaseFinishIsDeleteFeature;

    public String getMasterBranch() {
        return masterBranch;
    }

    public void setMasterBranch(String masterBranch) {
        this.masterBranch = masterBranch;
    }

    public String getReleaseBranch() {
        return releaseBranch;
    }

    public void setReleaseBranch(String releaseBranch) {
        this.releaseBranch = releaseBranch;
    }

    public String getTestBranch() {
        return testBranch;
    }

    public void setTestBranch(String testBranch) {
        this.testBranch = testBranch;
    }

    public String getFeaturePrefix() {
        return featurePrefix;
    }

    public void setFeaturePrefix(String featurePrefix) {
        this.featurePrefix = featurePrefix;
    }

    public String getHotfixPrefix() {
        return hotfixPrefix;
    }

    public void setHotfixPrefix(String hotfixPrefix) {
        this.hotfixPrefix = hotfixPrefix;
    }

    public String getVersionPrefix() {
        return versionPrefix;
    }

    public void setVersionPrefix(String versionPrefix) {
        this.versionPrefix = versionPrefix;
    }

    public boolean isReleaseFinishIsDeleteRelease() {
        return releaseFinishIsDeleteRelease;
    }

    public void setReleaseFinishIsDeleteRelease(boolean releaseFinishIsDeleteRelease) {
        this.releaseFinishIsDeleteRelease = releaseFinishIsDeleteRelease;
    }

    public boolean isReleaseFinishIsDeleteFeature() {
        return releaseFinishIsDeleteFeature;
    }

    public void setReleaseFinishIsDeleteFeature(boolean releaseFinishIsDeleteFeature) {
        this.releaseFinishIsDeleteFeature = releaseFinishIsDeleteFeature;
    }
}
