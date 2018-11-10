package com.wineguesser.repository;

import java.util.List;

import com.wineguesser.model.Wine;

interface WineRepository {
  public List<Wine> getAllWines();

}