package com.scaler.lld.design.assignments.builder;

import javax.xml.crypto.Data;

@WithBuilder
public class DatabaseConfiguration {

    private String databaseUrl;
    private String username;
    private String password;
    private int maxConnections;
    private boolean enableCache;
    private boolean isReadOnly;

    public DatabaseConfiguration(Builder builder) {
        this.databaseUrl = builder.databaseUrl;
        this.username = builder.username;
        this.password = builder.password;
        this.maxConnections = builder.maxConnections;
        this.enableCache = builder.enableCache;
        this.isReadOnly = builder.isReadOnly;
    }

    public DatabaseConfiguration() {

    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public boolean isEnableCache() {
        return enableCache;
    }

    public boolean isReadOnly() {
        return isReadOnly;
    }


    public static final class Builder{

        private String databaseUrl;
        private String username;
        private String password;
        private int maxConnections;
        private boolean enableCache;
        private boolean isReadOnly;

        public Builder setDatabaseUrl(String databaseUrl) {
            this.databaseUrl = databaseUrl;
            return this;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setMaxConnections(int maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }

        public Builder setEnableCache(boolean enableCache) {
            this.enableCache = enableCache;
            return this;
        }

        public Builder setReadOnly(boolean readOnly) {
            isReadOnly = readOnly;
            return this;
        }

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}



        public DatabaseConfiguration build(){
            return new DatabaseConfiguration(this);
        }


    }
}