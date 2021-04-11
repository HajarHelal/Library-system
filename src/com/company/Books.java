package com.company;

    public class Books extends Items {
        private String author;
        private String typeBooks;
        Books(){}
        Books(int uniqueNumber,String _author,String _typeBooks,String title,double cost){
            super(uniqueNumber,title,cost);
            author=_author;
            typeBooks=_typeBooks;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }

        public void setTypeBooks(String typeBooks) {
            this.typeBooks = typeBooks;
        }

        public String getTypeBooks() {
            return typeBooks;
        }
        public void displaybook(){
            System.out.println("The author:"+author+"\n"+"The Type of Book:"+typeBooks);
            super.Display();


        }

    }

