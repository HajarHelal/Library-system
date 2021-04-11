package com.company;

    public class DVDs extends Items  {
        private String films;
        private String detailsFilms;
        private String producers;
        private String category;
        DVDs(){}
        DVDs(String _films,String _detailsFilms,String _producers,String _category,int uniquenumber,String title,double cost){
            super(uniquenumber,title,cost);
            films=_films;
            detailsFilms=_detailsFilms;
            producers=_producers;
            category=_category;
        }
        DVDs(String _films,String _detailsFilms){
            films=_films;
            detailsFilms=_detailsFilms;
        }
        DVDs(String _films,String _producers,String _category ){
            films=_films;
            producers=_producers;
            category=_category;
        }

        public void setFilms(String films) {
            this.films = films;
        }

        public String getFilms() {
            return films;
        }

        public void setDetailsFilms(String detailsFilms) {
            this.detailsFilms = detailsFilms;
        }

        public String getDetailsFilms() {
            return detailsFilms;
        }

        public void setProducers(String producers) {
            this.producers = producers;
        }

        public String getProducers() {
            return producers;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return category;
        }
        public void displayDVD(){
            System.out.print("Films:"+films+"\n"+"Details Films:"+detailsFilms+"\n"+"Producers:"+""+producers+"\n"+"Category:"+category);
            super.Display();
           }
    }


