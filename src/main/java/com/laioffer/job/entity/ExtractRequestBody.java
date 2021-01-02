package com.laioffer.job.entity;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;



public class ExtractRequestBody {

    public List<String> data;

    @JsonProperty("max_keywords")
    public int maxKeywords;

    public ExtractRequestBody(List<String> data, int maxKeywords) {
        this.data = data;
        this.maxKeywords = maxKeywords;
    }

}
