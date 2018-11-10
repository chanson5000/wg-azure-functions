package com.wineguesser.model;

public class Condition {
  private boolean tart;
  private boolean ripe;
  private boolean overripe;
  private boolean baked;

  public boolean isTart() {
    return this.tart;
  }

  public void setTart(boolean tart) {
    this.tart = tart;
  }

  public boolean isRipe() {
    return this.ripe;
  }

  public void setRipe(boolean ripe) {
    this.ripe = ripe;
  }

  public boolean isOverripe() {
    return this.overripe;
  }

  public void setOverripe(boolean overripe) {
    this.overripe = overripe;
  }

  public boolean isBaked() {
    return this.baked;
  }

  public void setBaked(boolean baked) {
    this.baked = baked;
  }

}