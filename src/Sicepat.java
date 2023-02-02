public class Sicepat extends Shipper implements ShipperInterface{

    public Sicepat() {
        name = "Sicepat";
    }
    @Override
    public void sendPackage(Order order) {
        System.out.println("Kurir "+name+"sedang mengirim paket");
        System.out.println("Kirim request ke www.sicepat.com");
    }
}
