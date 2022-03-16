package GUI_2022_03_14;

public  class  Main {
    public  static  void  main(String [] args) {

        //zad1
        Figura kwadrat = new Figura("kwadrat", "Niebieski") {
            @Override
            public void obliczPole(int a) {
                setPole(a*a);
            }

            @Override
            public void obliczObwod(int a) {
                setObwod(4*a);
            }
        };



        //zad2
        Spiewak  s1 = new  Spiewak("Eminem") {
            @Override
            String spiewaj() {
                return "You  own it , you  better  never  let it go";
            }
        };

        Spiewak  s2 = new  Spiewak("Eagles"){
            @Override
            String spiewaj() {
                return "Hotel  California";
            }
        };
        Spiewak  s3 = new  Spiewak("Dżem"){
            @Override
            String spiewaj() {
                return "Chwila , która trwa może być najlepszą z Twoich  chwil ...";
            }
        };

        Spiewak  sp[] = {s1 , s2 , s3};

        for (Spiewak s : sp)
            System.out.println(s);

        System.out.println("\n" + Spiewak.najglosniej(sp));
    }
}