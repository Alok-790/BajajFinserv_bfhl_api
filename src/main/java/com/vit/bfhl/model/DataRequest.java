package com.vit.bfhl.model;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public class DataRequest {
    @NotNull
    private List<String> data;

    public DataRequest() {}

    public DataRequest(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }
}