package day22_İnhertenceCounstructorOlş;


    class C09_KDizelCorolla extends C08_HCorolla {

        C09_KDizelCorolla() {

            System.out.println("KDizelCorolla parametresiz cons");
        }

       C09_KDizelCorolla(String isim) {
            super(isim);
            System.out.println("KDizelCorolla parametreli cons");
        }

        public static void main(String[] args) {
            C09_KDizelCorolla obj1 = new C09_KDizelCorolla("Hasan");
        }
    }
