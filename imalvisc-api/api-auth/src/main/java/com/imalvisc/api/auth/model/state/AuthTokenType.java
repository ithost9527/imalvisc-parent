package com.imalvisc.api.auth.model.state;

public enum AuthTokenType {

    ACCESS_TOKEN("access_token", "access_token"),
    REFRESH_TOKEN("refresh_token", "refresh_token");

    private String key;

    private String value;

    AuthTokenType(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

}
