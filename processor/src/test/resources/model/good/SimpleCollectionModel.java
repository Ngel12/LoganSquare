package com.bluelinelabs.logansquare.processor;

import com.bluelinelabs.logansquare.annotation.JsonField;
import com.bluelinelabs.logansquare.annotation.JsonObject;

import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

@JsonObject
public class SimpleCollectionModel {

    @JsonField(name = "model_list")
    public List<ModelForCollection> modelForCollectionList;

    @JsonField(name = "model_set")
    public Set<ModelForCollection> modelForCollectionSet;

    @JsonField(name = "model_queue")
    public Queue<ModelForCollection> modelForCollectionQueue;

    @JsonField(name = "model_deque")
    public Deque<ModelForCollection> modelForCollectionDeque;

    @JsonField(name = "model_map")
    public Map<String, ModelForCollection> modelForCollectionMap;

    @JsonObject
    public static class ModelForCollection {

        @JsonField
        public String name;

    }
}
