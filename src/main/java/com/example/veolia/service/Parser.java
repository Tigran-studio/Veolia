package com.example.veolia.service;

public interface Parser {
    List<Announcement> parse(String contents);
}