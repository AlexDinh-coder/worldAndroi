package com.trungdthe160011.helloworld.slot11;

import retrofit2.Call;
import retrofit2.http.GET;

public interface InterfaceSelect {
    @GET("get_all_product.php")
    Call<SvrResponseSelect> getPrd();
}
