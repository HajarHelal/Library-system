package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.String.*;

    public class Itemcollection {
        private ArrayList<Items> thelibrary;
        private int numBooks;
        private int maxBooks;
        private int numCDs;
        private int maxCDs;
        private int numDVDs;
        private int maxDVDs;
        public Itemcollection() {
            int _numBooks; int _maxBooks=20; int _numCDs; int _maxCDs=20; int _numDVDs; int _maxDVDs = 20;
            _numBooks = 0;
            maxBooks = _maxBooks;
            numCDs = 0;
            maxCDs = _maxCDs;
            numDVDs = 0;
            maxDVDs = _maxDVDs;
            thelibrary = new ArrayList<Items>();
        }

        public boolean addBooks(Books b) {

            if (numBooks == maxBooks) {
                return false;
            } else {

                thelibrary.add(b);
                numBooks++;
                return true;
            }
        }

        public boolean addCDs( CDs cd) {

            if (numCDs == maxCDs) {

                return false;
            } else {

                thelibrary.add(cd);
                numCDs++;
                return true;
            }
        }

        public boolean addDVDs(DVDs dvd) {

            if (numDVDs == maxDVDs) {

                return false;
            } else {
                thelibrary.add(dvd);
                numCDs++;
                return true;
            }
        }

        void listBooks() {
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            System.out.println("The Books:");
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            for (int i = 0; i < thelibrary.size(); ++i) {
                if (thelibrary.get(i) instanceof Books) {
                    Books theBook = (Books) thelibrary.get(i);
                    theBook.displaybook();
                }
            }
        }

        void listCDs() {
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            System.out.println("The CDs:");
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            for (int i = 0; i < thelibrary.size(); ++i) {
                if (thelibrary.get(i) instanceof CDs) {
                    CDs theCD = (CDs) thelibrary.get(i);
                    theCD.displayCDs();
                }
            }


        }

        void listDVDs() {
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            System.out.println("The DVDs:");
            System.out.print("- - - - - - - - - - - - - - - - - "+"\n");
            for (int i = 0; i < thelibrary.size(); ++i) {
                if (thelibrary.get(i) instanceof DVDs) {
                    DVDs theDVD = (DVDs) thelibrary.get(i);
                    theDVD.displayDVD();
                }
            }
        }

        void displayAllItems() {

            listBooks();
            listCDs();
            listDVDs();
        }
        public void searchitems(){
            int n;
            System.out.print("please insert the unique number of item ");
            Scanner number =new Scanner(System.in);
            n=number.nextInt();
            for(Items item: thelibrary){

                if(n == item.getUniqueNumber()){
                    item.Display();
                    break;

                }
            }
            System.out.print("not found ");


        }
        public double totalPrice(){
           double  Cost=0;
            for(Items items:thelibrary) {
                Cost+=items.getCost();
            }
            return Cost;
        }

        public void menu() {
            java.lang.String n;
            System.out.print("1.add a Book" + "\n" + "2.add a CD" + "\n" + "3.add DVDs" + "\n" + "4.Search Items" + "\n" +
                    "5.display Books \n6.display CDs \n7.display DVDs \n8.display all items \n9.The whole prices \n10.Exit \n"
            );
            do {
                System.out.print("Please Insert The Number of Operation" + "\n");
                Scanner e = new Scanner(System.in);
                n = e.nextLine();

                switch (n) {
                    case "1":
                        System.out.print("Enter book number: ");
                        Scanner bN = new Scanner(System.in);
                        int book_number = bN.nextInt();
                        System.out.print("Enter book author: ");
                        Scanner ba = new Scanner(System.in);
                        java.lang.String book_author = ba.nextLine();
                        System.out.print("Enter book title: ");
                        Scanner bn = new Scanner(System.in);
                        java.lang.String book_title = bn.nextLine();
                        System.out.print("Enter book type: ");
                        Scanner bt = new Scanner(System.in);
                        java.lang.String book_type = bt.nextLine();

                        System.out.print("Enter book cost: ");
                        Scanner bc = new Scanner(System.in);
                        double book_cost = bc.nextDouble();
                        this.addBooks(new Books(book_number,book_author, book_type,  book_title, book_cost));

                        break;

                    case "2":
                        System.out.print("Enter CD number: ");
                        Scanner cn = new Scanner(System.in);
                        int cd_number = cn.nextInt();
                        System.out.print("Enter CD type ");
                        Scanner ca = new Scanner(System.in);
                        java.lang.String cd_audiobook = ca.nextLine();
                        System.out.print("Enter CD artist: ");
                        Scanner cA = new Scanner(System.in);
                        java.lang.String cd_artist = cA.nextLine();

                        System.out.print("Enter CD title: ");
                        Scanner ct = new Scanner(System.in);
                        java.lang.String cd_title = ct.nextLine();
                        System.out.print("Enter CD cost: ");
                        Scanner cc = new Scanner(System.in);
                        double cd_cost = cc.nextDouble();
                        this.addCDs(new CDs( cd_number,cd_audiobook,cd_artist, cd_title, cd_cost));
                        break;
                    case  "3":
                        System.out.print("Enter DVD number: ");
                        Scanner dn = new Scanner(System.in);
                        int dvd_number = dn.nextInt();
                        System.out.print("Enter DVD Films name: ");
                        Scanner df = new Scanner(System.in);
                        java.lang.String dvd_films = df.nextLine();
                        System.out.print("Enter DVD Film details: ");
                        Scanner dfd = new Scanner(System.in);
                        java.lang.String dvd_filmdetails = dfd.nextLine();
                        System.out.print("Enter DVD Producers: ");
                        Scanner dp = new Scanner(System.in);
                        java.lang.String dvd_producers = dp.nextLine();
                        System.out.print("Enter DVD Category: ");
                        Scanner dc = new Scanner(System.in);
                        java.lang.String dvd_category = dc.nextLine();
                        System.out.print("Enter DVD title: ");
                        Scanner dt = new Scanner(System.in);
                        java.lang.String dvd_title = dt.nextLine();
                        System.out.print("Enter DVD cost: ");
                        Scanner dC = new Scanner(System.in);
                        double dvd_cost = dC.nextDouble();
                        this.addDVDs(new DVDs(dvd_films,dvd_filmdetails,dvd_producers,dvd_category, dvd_number, dvd_title, dvd_cost));
                        break;
                    case  "4":
                        this.searchitems();
                        break;
                    case  "5":
                        this.listBooks();
                        break;
                    case  "6":
                        this.listCDs();
                        break;
                    case  "7":
                        this.listDVDs();
                        break;
                    case  "8":
                        this.displayAllItems();
                        break;
                    case "9":
                        System.out.println("*************************");
                        System.out.println("The whole prices:");
                        System.out.println("*************************");
                        System.out.println("ALL ITEMS COST:");
                        System.out.println(totalPrice());
                        System.out.println("$");
                    case "10":
                        break;
                }
            } while(!(n.equals("10")));
        }

    }


