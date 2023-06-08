package com.sat.result.models;

public class SATResult {

        private String name;
        private String address;
        private String city;
        private String country;
        private String pincode;
        private int satScore;
        private boolean passed;

        public SATResult(String name, String address, String city, String country, String pincode, int satScore, boolean passed) {
            this.name = name;
            this.address = address;
            this.city = city;
            this.country = country;
            this.pincode = pincode;
            this.satScore = satScore;
            this.passed = passed;
        }

        public String getName() {
            return name;
        }

        public String getAddress() {
            return address;
        }

        public String getCity() {
            return city;
        }

        public String getCountry() {
            return country;
        }

        public String getPincode() {
            return pincode;
        }

        public int getSatScore() {
            return satScore;
        }

        public boolean isPassed() {
            return passed;
        }

        public void setSatScore(int satScore) {
            this.satScore = satScore;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }

        public String toJson() {
            return "{"
                    + "\"name\":\"" + name + "\","
                    + "\"address\":\"" + address + "\","
                    + "\"city\":\"" + city + "\","
                    + "\"country\":\"" + country + "\","
                    + "\"pincode\":\"" + pincode + "\","
                    + "\"satScore\":" + satScore + ","
                    + "\"passed\":" + passed
                    + "}";
        }



}
