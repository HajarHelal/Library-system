package com.company;
public class Items {
        protected int uniqueNumber;
        protected String title;
        protected double cost;
        Items(){}
        Items(int uniqueno,String titl,double Cost){
            uniqueNumber=uniqueno;
            title=titl;
            cost=Cost;
        }
        Items(int uniqueno,String titl){
            uniqueNumber=uniqueno;
            title=titl;
        }
        Items(int uniqueno,double Cost){
            uniqueNumber=uniqueno;
            cost=Cost;
        }

        public void setUniqueNumber(int uniqueNumber) {
            this.uniqueNumber = uniqueNumber;
        }

        public int getUniqueNumber() {
            return uniqueNumber;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
        public double getCost() {
            return cost;
        }

        public void Display(){
            System.out.println("The unique Number:"+uniqueNumber);
            System.out.println("The Title:"+title);
            System.out.println("Cost:"+cost+"$");
            System.out.println("**************************************************");
        }
    }


