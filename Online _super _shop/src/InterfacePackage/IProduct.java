package InterfacePackage;

public interface IProduct {
   double productCategory(int tax, int discount );
   void setProduct(String name, String id, String category, double price,int quantity,int moneyDiscount,int tax);
   void ProductValueDisplay();

}
