package day22_İnhertenceCounstructorOlş;


    public class C06_FMemur extends C05_EMuhasebe {
        /*
          Extends keyword kullanilan classlarda
          ister default consructor bulunsun
          istersek de biz yeni constructor(lar) olusturalim
          Java constructor'in ilk satirina
          super(); constructor call yazar
          super(); constructor call, default constructor'a benzer
          gorunmese de orada vardir ve calisir
          ancak biz ilk satira farkli bir constructor call yazarsak
          Java super(); 'i siler
          Eger biz mudahale edip kendi constructor call'umuzu olusturmazsak
          Javanin default olarak olusturdugu constructor call
          her zaman parametresizdir
          super();
         */
        C06_FMemur() {
            System.out.println("Memur parametresiz cons");
        }

        C06_FMemur(String isim) {
            System.out.println("Memur parametreli cons");
        }

        public static void main(String[] args) {
            C06_FMemur mmr1 = new C06_FMemur("ali");
        }
    }
