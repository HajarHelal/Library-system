package com.company;
    public class CDs extends Items {
        private String audioBook;
        private String artist;
        private String genre;
        CDs(String _audioBook,String _artist,String _genre ){
            audioBook=_audioBook;
            artist=_artist;
            genre=_genre;

        }
        CDs(int uniquenumber,String _audioBook,String _artist,String title,double cost){
            super(uniquenumber,title,cost);
            audioBook=_audioBook;
            artist=_artist;

        }
        CDs(String _audioBook,String _artist){
            audioBook=_audioBook;
            artist=_artist;
        }
        CDs(String _audioBooK){
            audioBook=_audioBooK;
        }
        CDs(){}
        public void setAudioBook(String audioBook) {
            this.audioBook = audioBook;
        }

        public String getAudioBook() {
            return audioBook;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getArtist() {
            return artist;
        }


        public void displayCDs(){
            System.out.print("AudioBook:"+audioBook+"\n"+"Artist:"+artist+"\n"+"Genre:"+""+genre+"\n");
            super.Display();

        }
    }


