public class Order {
    private String goodsName;
    private String receiverName;
    private String receiverAddress;
    private String shipperName;

    public Order(String goodsName, String receiverName, String receiverAddress, String shipperName) {
        this.goodsName = goodsName;
        this.receiverName = receiverName;
        this.receiverAddress = receiverAddress;
        this.shipperName = shipperName;
    }

    public String toString(){
        return "Nama barang: "+ goodsName
                +", Nama Penerima: "+receiverName
                +", Alamat Penerima: "+receiverAddress
                +", Nama Kurir: "+shipperName;
    }
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddres) {
        this.receiverAddress = receiverAddres;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }


}
