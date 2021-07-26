package com.example.responsi.Service;

public class RegisterService {
    private RegisterInterface registerInterface;

    public RegisterService(Context context) {
        registerInterface = RetrofitBuilder.builder(context)
                .create(RegisterInterface.class);
    }

    public void doRegister(String firstname, String lastname, String email, String password, Callback callback) {
        registerInterface.register(firstname, lastname, email, password).enqueue(callback);
    }

}
