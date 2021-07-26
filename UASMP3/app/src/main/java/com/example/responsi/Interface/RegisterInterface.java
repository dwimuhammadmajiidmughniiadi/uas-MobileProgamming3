package ;

public class RegisterInterface {
}
import com.example.responsi.Interface;
        import com.example.responsi.Interface;

        import retrofit2.Call;
        import retrofit2.http.Field;
        import retrofit2.http.FormUrlEncoded;
        import retrofit2.http.POST;

public interface RegisterInterface {

    @FormUrlEncoded
    @POST(Config.API_REGISTER)
    Call<BaseResponse> register(
            @Field("firstname") String firstname,
            @Field("lastname") String lastname,
            @Field("email") String email,
            @Field("password") String password);

}