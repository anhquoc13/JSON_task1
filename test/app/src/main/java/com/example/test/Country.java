package com.example.test;

public class Country {
        String id;
        String countryName;

        public Country(String i, String countryName) {
            super();
            this.id = i;
            this.countryName = countryName;
        }

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountryName() {
            return countryName;
        }
        public void setCountryName(String countryName) {
            this.countryName = countryName;
        }
    }


