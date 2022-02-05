package com.company;

public class Main {

    public static void main(String[] args) {
    Balyk balyk = new Balyk();
        System.out.println("Balyk zhonundo maalymat---------------------------");
        balyk.setAty("UnuZhok");
        balyk.setPorodasy("Pirani");
        balyk.setTysy("Kara");
        balyk.setSalmagy(1);
        System.out.println(balyk.getAty()+" "+balyk.getPorodasy()+" "+balyk.getTysy()+" "+balyk.getSalmagy());
        System.out.println("--------------------------------------------------");
            Popugai popugai = new Popugai();
            System.out.println("Popugai jonundo maalymat--------------------------");
            popugai.setAty("Kukareku");
            popugai.setPorodasy("Amazon");
            popugai.setTysy("Sary");
            popugai.setSalmagy(2);
            System.out.println(popugai.getAty()+" "+popugai.getPorodasy()+" "+popugai.getTysy()+" "+popugai.getSalmagy());
            System.out.println("--------------------------------------------------");
                Myshyk myshyk = new Myshyk();
                System.out.println("Myshyk jonundo maalymat---------------------------");
                myshyk.setAty("Gaz");
                myshyk.setPorodasy("Shotland");
                myshyk.setTysy("Ak");
                myshyk.setSalmagy(3);
                System.out.println(myshyk.getAty()+" "+myshyk.getPorodasy()+" "+myshyk.getTysy()+" "+myshyk.getSalmagy());
                System.out.println("--------------------------------------------------");
                    It it = new It();
                    System.out.println("It jonundo maalymat-------------------------------");
                    it.setAty("Tormoz");
                    it.setPorodasy("Buldog");
                    it.setTysy("Kyzul");
                    it.setSalmagy(4);
                    System.out.println(it.getAty()+" "+it.getPorodasy()+" "+it.getTysy()+" "+it.getSalmagy());
                    System.out.println("--------------------------------------------------");


    }
}
