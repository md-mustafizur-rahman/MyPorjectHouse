package Main;

import Product.Product;

public class SubsetOfProduct extends Product {
//    @Override
//   public double productCategory() {
//
//        return super.productCategory();
//    }

//    @Override
//    public double productCategory(int stareDiscount) {
//        return super.productCategory(stareDiscount);
//    }

    @Override
    protected void sendMoneyToTheProduct(double bankMoney,int bkashPin) {
        super.sendMoneyToTheProduct(bankMoney,bkashPin);
    }


}
