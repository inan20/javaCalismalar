package day017;

public class C02_CarRuner {
    public static void main(String[] args) {

        C01_Car car=new C01_Car();
        car.marka="toyota";
        car.model="corolla";
        car.yıl=2020;
        car.fiyat=250000;
        System.out.println("car bilgileri\nMarka : " + car.marka +"\nModel : " + car.model
                +"\nYil : " + car.yıl+ "\nFiyat : " + car.fiyat);

/*
        car bilgileri
        Marka : toyota
        Model : corolla
        Yil : 2020
        Fiyat : 250000
*/



    }

}
