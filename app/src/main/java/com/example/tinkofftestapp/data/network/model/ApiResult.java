package com.example.tinkofftestapp.data.network.model;

import com.squareup.moshi.Json;

public class ApiResult<T> {
    @Json(name = "resultCode")
    private final String resultCode;
    @Json(name = "payload")
    private final T payload;

    public ApiResult(String resultCode, T payload) {
        this.resultCode = resultCode;
        this.payload = payload;
    }

    public String getResultCode() {
        return resultCode;
    }

    public T getPayload() {
        return payload;
    }
}
