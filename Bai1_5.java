public class Bai1_5 {
    public static void main(String[] args) {
        InvoiceItem inv1 = new InvoiceItem("A101", "Pen red", 888, 0.08);
        System.out.println(inv1);
        inv1.setQty(999);
        inv1.setUniPrice(0.99);
        System.out.println(inv1);
        System.out.println("id is : "+inv1.getId());
        System.out.println("desc is : "+inv1.getDesc());
        System.out.println("qty is : "+inv1.getQty());
        System.out.println("uniPrice is : "+inv1.getUniPrice());
        System.out.println("Total is : "+inv1.getTotal());

    }
}
