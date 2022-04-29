package com.example.myapplication.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ShopRepo {
    private MutableLiveData<List<Product>> mutableProductList;

    public LiveData<List<Product>> getProducts() {
        if (mutableProductList == null) {
            mutableProductList = new MutableLiveData<>();
            loadProducts();
        }
        return mutableProductList;
    }

    private void loadProducts() {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(UUID.randomUUID().toString(), "Chocolate cake", 1299, true, "https://www.google.com/search?q=chocolate+cake&sxsrf=ALiCzsYsBHpjpGm7-ZQHknreA2p3HwaJKw:1651173158721&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA-Nmsu7f3AhXeRPEDHZGQAEYQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1#imgrc=WwByv6c9imwF7M" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Chocolate cake", 1299, true, "https://www.google.com/search?q=chocolate+cake&sxsrf=ALiCzsYsBHpjpGm7-ZQHknreA2p3HwaJKw:1651173158721&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA-Nmsu7f3AhXeRPEDHZGQAEYQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1#imgrc=WwByv6c9imwF7M" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Chocolate cake", 1299, true, "https://www.google.com/search?q=chocolate+cake&sxsrf=ALiCzsYsBHpjpGm7-ZQHknreA2p3HwaJKw:1651173158721&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA-Nmsu7f3AhXeRPEDHZGQAEYQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1#imgrc=WwByv6c9imwF7M" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Chocolate cake", 1299, true, "https://www.google.com/search?q=chocolate+cake&sxsrf=ALiCzsYsBHpjpGm7-ZQHknreA2p3HwaJKw:1651173158721&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA-Nmsu7f3AhXeRPEDHZGQAEYQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1#imgrc=WwByv6c9imwF7M" ));
        productList.add(new Product(UUID.randomUUID().toString(), "Chocolate cake", 1299, true, "https://www.google.com/search?q=chocolate+cake&sxsrf=ALiCzsYsBHpjpGm7-ZQHknreA2p3HwaJKw:1651173158721&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiA-Nmsu7f3AhXeRPEDHZGQAEYQ_AUoAXoECAMQAw&biw=1366&bih=625&dpr=1#imgrc=WwByv6c9imwF7M" ));
        mutableProductList.setValue(productList);
    }
}

