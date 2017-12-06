package com.akucera.codeadvent.advent06;

public class Configuration {
    private String config;
    private int order;

    public Configuration(String config, int order) {
        this.config = config;
        this.order = order;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Configuration that = (Configuration) o;

        return config != null ? config.equals(that.config) : that.config == null;
    }

    @Override
    public int hashCode() {
        return config != null ? config.hashCode() : 0;
    }
}
