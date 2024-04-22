package com.example.veolia.service;

public interface NLProcessor {
    List<Announcement> tokenize(String sentence);
}