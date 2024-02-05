package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {
    List<Product> productList = new ArrayList<>();

    public ProductRepo(){

    }
    public ProductRepo(List<Product> products) {
        this.productList = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductRepo that = (ProductRepo) o;

        return Objects.equals(productList, that.productList);
    }

    @Override
    public int hashCode() {
        return productList != null ? productList.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + productList +
                '}';
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProductByName(String name){
        Product productReturn = null;
        for (Product product : productList){
            if (product.name().equals(name)){
                productReturn = product;
                break;
            }
        }
        return productReturn;
    }

    public Product getProductById(int id){
        for (Product product : productList){
            if (product.id() == id){
                return product;
            }
        }
        return null;
    }

    public List<Product> getAllProducts() {
        return new ArrayList<>(productList);
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public void removeProductById(int productId){
        Product productToRemove = null;
        for (Product product : productList){
            if (product.id() == productId) {
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null){
            productList.remove(productToRemove);
        }
    }

    public void removeProductByName(String productName){
        Product productToRemove = null;
        for (Product product : productList){
            if (product.name() == productName){
                productToRemove = product;
                break;
            }
        }
        if (productToRemove != null){
            productList.remove(productToRemove);
        }
    }
}
