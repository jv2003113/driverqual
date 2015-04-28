package com.ehi.driverqual.domain;


public class ClientProfile {
    String profileName;

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public ParentClientProfile getParentClientProfile() {
        return parentClientProfile;
    }

    public void setParentClientProfile(ParentClientProfile parentClientProfile) {
        this.parentClientProfile = parentClientProfile;
    }

    ParentClientProfile parentClientProfile;
}
