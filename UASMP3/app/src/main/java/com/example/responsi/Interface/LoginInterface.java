package com.example.responsi.Interface;




    public interface LoginInterface {
   import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
        @FormUrlEncoded
        @POST(Config.API_LOGIN)
        Call<User> login(
                @Field("email") String email,
                @Field("password") String password);

    }

}
