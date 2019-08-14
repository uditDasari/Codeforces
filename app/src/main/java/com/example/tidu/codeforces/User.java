package com.example.tidu.codeforces;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

 class User {
    @Expose
    @SerializedName("result")
    private List<Result> result;
    @Expose
    @SerializedName("status")
    private String status;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Result {
        @Expose
        @SerializedName("maxRank")
        private String maxrank;
        @Expose
        @SerializedName("registrationTimeSeconds")
        private int registrationtimeseconds;
        @Expose
        @SerializedName("maxRating")
        private int maxrating;
        @Expose
        @SerializedName("rank")
        private String rank;
        @Expose
        @SerializedName("organization")
        private String organization;
        @Expose
        @SerializedName("contribution")
        private int contribution;
        @Expose
        @SerializedName("firstName")
        private String firstname;
        @Expose
        @SerializedName("avatar")
        private String avatar;
        @Expose
        @SerializedName("handle")
        private String handle;
        @Expose
        @SerializedName("titlePhoto")
        private String titlephoto;
        @Expose
        @SerializedName("friendOfCount")
        private int friendofcount;
        @Expose
        @SerializedName("rating")
        private int rating;
        @Expose
        @SerializedName("city")
        private String city;
        @Expose
        @SerializedName("lastOnlineTimeSeconds")
        private int lastonlinetimeseconds;
        @Expose
        @SerializedName("country")
        private String country;
        @Expose
        @SerializedName("lastName")
        private String lastname;

        public String getMaxrank() {
            return maxrank;
        }

        public void setMaxrank(String maxrank) {
            this.maxrank = maxrank;
        }

        public int getRegistrationtimeseconds() {
            return registrationtimeseconds;
        }

        public void setRegistrationtimeseconds(int registrationtimeseconds) {
            this.registrationtimeseconds = registrationtimeseconds;
        }

        public int getMaxrating() {
            return maxrating;
        }

        public void setMaxrating(int maxrating) {
            this.maxrating = maxrating;
        }

        public String getRank() {
            return rank;
        }

        public void setRank(String rank) {
            this.rank = rank;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

        public int getContribution() {
            return contribution;
        }

        public void setContribution(int contribution) {
            this.contribution = contribution;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }

        public String getHandle() {
            return handle;
        }

        public void setHandle(String handle) {
            this.handle = handle;
        }

        public String getTitlephoto() {
            return titlephoto;
        }

        public void setTitlephoto(String titlephoto) {
            this.titlephoto = titlephoto;
        }

        public int getFriendofcount() {
            return friendofcount;
        }

        public void setFriendofcount(int friendofcount) {
            this.friendofcount = friendofcount;
        }

        public int getRating() {
            return rating;
        }

        public void setRating(int rating) {
            this.rating = rating;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getLastonlinetimeseconds() {
            return lastonlinetimeseconds;
        }

        public void setLastonlinetimeseconds(int lastonlinetimeseconds) {
            this.lastonlinetimeseconds = lastonlinetimeseconds;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }
    }
}
